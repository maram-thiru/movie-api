/**
 * 
 */
package com.thiru.database;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;

import com.thiru.entity.Crew;
import com.thiru.entity.CrewDetails;
import com.thiru.entity.Rating;
import com.thiru.entity.TitleBasic;

/**
 * @author Thirupathi Maram
 *
 */
@Service
public class DataBase {

	public static Map<String, TitleBasic> titlesTbl() {

		return loadTitlesData().stream().collect(Collectors.toMap(TitleBasic::getTconst, Function.identity()));

	}

	public static Map<String, Crew> crewTbl() {

		return loadCrewData().stream().collect(Collectors.toMap(Crew::getTconst, Function.identity()));

	}

	public static Map<String, Rating> ratingsTbl() {

		return loadRatingData().stream().collect(Collectors.toMap(Rating::getTconst, Function.identity()));

	}

	public static Map<String, CrewDetails> crewDetailsTbl() {

		return loadCrewDetailsData().stream().collect(Collectors.toMap(CrewDetails::getNconst, Function.identity()));

	}

	/**
	 * construct and load title data
	 */
	private static List<TitleBasic> loadTitlesData() {
		return Stream.of(new TitleBasic[] {

				new TitleBasic("tt0000001", "short", "Carmencita", "Carmencita", false, "1894", "N", 1,
						new String[] { "Documentary", "Short" }),
				new TitleBasic("tt0000002", "short", "Le clown et ses chiens", "Le clown et ses chiens", false, "1892",
						"N", 5, new String[] { "Animation", "Short" }),
				new TitleBasic("tt0000003", "short", "Pauvre Pierrot", "Pauvre Pierrot", false, "1892", "N", 4,
						new String[] { "Animation", "Comedy", "Romance" }),
				new TitleBasic("tt0000009", "short", "Miss Jerry", "Miss Jerry", false, "1894", "N", 40,
						new String[] { "Romance", "Short" }),
				new TitleBasic("tt0000075", "short", "The Conjuring of a Woman at the House of Robert Houdin",
						"Escamotage d'une dame au théâtre Robert Houdin", false, "1896", "N", 1,
						new String[] { "Horror", "Short" }),
				new TitleBasic("tt0000091", "short", "The House of the Devil", "Le manoir du diable", false, "1896",
						"N", 3, new String[] { "Horror", "Short" }),
				new TitleBasic("tt0000131", "short", "A Terrible Night", "Une nuit terrible", false, "1896", "N", 1,
						new String[] { "Horror", "Short" }),
				new TitleBasic("tt0000138", "short", "The Bewitched Inn", "The Bewitched Inn", false, "1896", "N", 1,
						new String[] { "Horror", "Short" }),
				new TitleBasic("tt0000152", "short", "The Hallucinated Alchemist", "The Hallucinated Alchemist", false,
						"1896", "N", 1, new String[] { "Horror", "Short" }),
				new TitleBasic("tt0000153", "short", "The Haunted Castle", "The Haunted Castle", false, "1896", "N", 1,
						new String[] { "Horror", "Short" }),
				new TitleBasic("tt0000159", "short", "The Devil's Laboratory", "Le cabinet de Méphistophélès", false,
						"1896", "N", 1, new String[] { "Horror", "Short" }),
				new TitleBasic("tt0000172", "short", "The X-Ray Fiend", "The X-Ray Fiend", false, "1896", "N", 1,
						new String[] { "Horror", "Short" }),
				new TitleBasic("tt0000178", "short", "The Cavalier's Dream", "The Cavalier's Dream", false, "1896", "N",
						1, new String[] { "Horror", "Short" }),
				new TitleBasic("tt0000179", "short", "The Cave of the Demons", "La caverne maudite", false, "1896", "N",
						1, new String[] { "Horror", "Short" }) })
				.collect(Collectors.toList());
	}

	/**
	 * construct and load rating data
	 */
	private static List<Rating> loadRatingData() {
		return Stream.of(new Rating[] {

				new Rating("tt0000001", new BigDecimal(5.7), 1850), new Rating("tt0000002", new BigDecimal(6.0), 241),
				new Rating("tt0000003", new BigDecimal(6.5), 1617), new Rating("tt0000009", new BigDecimal(5.9), 192),
				new Rating("tt0000075", new BigDecimal(6.3), 1792), new Rating("tt0000091", new BigDecimal(6.7), 3301),
				new Rating("tt0000131", new BigDecimal(5.8), 1292), new Rating("tt0000138", new BigDecimal(6.5), 1039),
				new Rating("tt0000152", new BigDecimal(6.1), 227), new Rating("tt0000153", new BigDecimal(5.7), 407),
				new Rating("tt0000159", new BigDecimal(5.3), 109), new Rating("tt0000172", new BigDecimal(6.1), 834),
				new Rating("tt0000178", new BigDecimal(5.2), 161), new Rating("tt0000179", new BigDecimal(4.5), 40) })
				.collect(Collectors.toList());
	}

	/**
	 * construct and load crew data
	 */
	private static List<Crew> loadCrewData() {
		return Stream.of(new Crew[] { new Crew("tt0000001", "nm0005690", "N"), new Crew("tt0000002", "nm0721526", "N"),
				new Crew("tt0000003", "nm0721526", "N"), new Crew("tt0000075", "nm0617588", "N"),
				new Crew("tt0000091", "nm0617588", "nm0617588"), new Crew("tt0000131", "nm0617588", "N"),
				new Crew("tt0000138", "nm0617588", "nm0617588"), new Crew("tt0000152", "nm0617588", "N"),
				new Crew("tt0000153", "nm0808310", "N"), new Crew("tt0000159", "nm0617588", "N"),
				new Crew("tt0000172", "nm0808310", "N"), new Crew("tt0000178", "nm0692105", "N"),
				new Crew("tt0000179", "nm0617588", "N"),

		}).collect(Collectors.toList());
	}

	/**
	 * construct and load crew data
	 */
	private static List<CrewDetails> loadCrewDetailsData() {

		// nm0721526
		return Stream.of(new CrewDetails[] {
				new CrewDetails("nm0617588", "Georges Méliès", "1861", "1938",
						new String[] { "director", "actor", "producer" },
						new String[] { "tt0215737", "tt0223267", "tt0002113", "tt0000091" }),
				new CrewDetails("nm0721526", "Émile Reynaud", "1844	", "1918",
						new String[] { "director", "animation_department", "writer" },
						new String[] { "tt0000003", "tt13125956", "tt2184231", "tt2184201" })

		}).collect(Collectors.toList());
	}
}
