/**
 * 
 */
package com.thiru.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.thiru.entity.Movie;
import com.thiru.service.MovieService;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Thirupathi Maram
 *
 */

@RestController
@Slf4j
@RequestMapping("/movies")
public class MovieController {

	@Autowired
	private MovieService movieService;

	@GetMapping("/title")
	public Movie findMovieByTitle(@RequestParam("searchKey") String searchKey) {
		log.info("Searching movie by title... " + searchKey);
		return movieService.findMovieByTitle(searchKey);
	}

	@GetMapping("/genre")
	public List<Movie> findMovieByGenre(@RequestParam("searchKey") String searchKey) {
		log.info("Searching movie by genre... " + searchKey);
		return movieService.findMovieByGenre(searchKey);
	}

}
