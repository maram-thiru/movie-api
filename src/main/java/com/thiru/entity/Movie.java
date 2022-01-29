/**
 * 
 */
package com.thiru.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Thirupathi Maram
 *
 */
@Entity
@Data
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Movie implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private TitleBasic title;
	private CrewDetails crewDetails;
	private Double rating;

}
