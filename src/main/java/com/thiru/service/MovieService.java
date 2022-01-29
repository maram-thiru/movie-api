package com.thiru.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.thiru.database.DataBase;
import com.thiru.entity.Movie;
import com.thiru.entity.TitleBasic;

@Service
public class MovieService {

	public Movie findMovieByTitle(String searchByTitle) {
		Movie movie = new Movie();
		Optional<TitleBasic> title = Optional.ofNullable(DataBase.titlesTbl().values().stream()
				.filter(record -> record.getPrimaryTitle().contains(searchByTitle)).collect(Collectors.toList())
				.get(0));
		if (title.isPresent()) {
			movie.setTitle(title.get());
			movie.setCrewDetails(
					DataBase.crewDetailsTbl().get(DataBase.crewTbl().get(title.get().getTconst()).getDirectors()));
			movie.setRating(addRating(movie).getRating());
		}

		return movie;
	}

	public List<Movie> findMovieByGenre(String searchByGenre) {
		List<TitleBasic> titles = DataBase.titlesTbl().values().stream()
				.filter(record -> Arrays.asList(record.getGenres()).contains(searchByGenre))
				.collect(Collectors.toList());
		List<Movie> movieList = titles.stream().map(MovieService::createMovie).collect(Collectors.toList());
		List<Movie> moviesWithRating = movieList.stream().map(MovieService::addRating).collect(Collectors.toList());
		List<Movie> moviesWithRatingAndCrew = moviesWithRating.stream().map(MovieService::addCrew)
				.collect(Collectors.toList());
		List<Movie> topMoviesByRating = moviesWithRatingAndCrew.stream()
				.sorted((m1, m2) -> m2.getRating().compareTo(m1.getRating())).collect(Collectors.toList());
		return topMoviesByRating;

	}

	private static Movie createMovie(TitleBasic tb) {
		Movie movie = new Movie();
		movie.setTitle(tb);
		return movie;
	}

	private static Movie addRating(Movie movie) {
		movie.setRating(DataBase.ratingsTbl().get(movie.getTitle().getTconst()).getAverageRating().doubleValue());
		return movie;
	}

	private static Movie addCrew(Movie movie) {
		movie.setCrewDetails(
				DataBase.crewDetailsTbl().get(DataBase.crewTbl().get(movie.getTitle().getTconst()).getDirectors()));
		return movie;
	}

}
