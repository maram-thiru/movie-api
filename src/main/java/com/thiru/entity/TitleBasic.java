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
public class TitleBasic implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String tconst;
	private String titleType;
	private String primaryTitle;
	private String originalTitle;
	private boolean isAdult;
	private String startYear;
	private String endYear;
	private int runtimeMinutes;
	private String[] genres;

}
