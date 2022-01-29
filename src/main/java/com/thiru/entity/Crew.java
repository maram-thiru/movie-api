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
public class Crew implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String tconst;
	private String directors;
	private String writers;

}