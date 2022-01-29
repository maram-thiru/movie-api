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
import lombok.ToString;

/**
 * @author Thirupathi Maram
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class CrewDetails implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String nconst;
	private String primaryName;
	private String birthYear;
	private String deathYear;
	private String[] primaryProfession;
	private String[] knownForTitles;

}
