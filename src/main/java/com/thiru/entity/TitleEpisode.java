/**
 * 
 */
package com.thiru.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Thirupathi Maram
 *
 */
@Data

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class TitleEpisode implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String tconst;
	private String parentTconst;
	private String seasonNumber;
	private String episodeNumber;

}
