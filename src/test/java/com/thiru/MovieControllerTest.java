/**
 * 
 */
package com.thiru;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import com.thiru.controller.MovieController;
import com.thiru.entity.CrewDetails;
import com.thiru.entity.Movie;
import com.thiru.entity.Rating;
import com.thiru.entity.TitleBasic;
import com.thiru.service.MovieService;

/**
 * @author Thirupathi Maram
 *
 */

@ExtendWith(SpringExtension.class)
@WebMvcTest(controllers = MovieController.class)
public class MovieControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private MovieService movieService;

	@Test
	void test_findMovieByTitle_With_Valid_Input() throws Exception {

		Movie movie = new Movie();
		TitleBasic titleBasic = new TitleBasic("tt0000002", "short", "Le clown et ses chiens", "Le clown et ses chiens",
				false, "1892", "N", 5, new String[] { "Animation", "Short" });

		CrewDetails crewDetails = new CrewDetails("nm0721526", "Émile Reynaud", "1844	", "1918",
				new String[] { "director", "animation_department", "writer" },
				new String[] { "tt0000003", "tt13125956", "tt2184231", "tt2184201" });

		Rating rating = new Rating("tt0000002", new BigDecimal(6.0), 241);

		movie.setTitle(titleBasic);
		movie.setCrewDetails(crewDetails);
		movie.setRating(rating.getAverageRating().doubleValue());

		mockMvc.perform(get("/movies/title/?").accept(MediaType.APPLICATION_JSON_VALUE).param("searchKey", "Le clown"))
				.andExpect(status().isOk());

		verify(movieService, times(1)).findMovieByTitle("Le clown");
	}
}
