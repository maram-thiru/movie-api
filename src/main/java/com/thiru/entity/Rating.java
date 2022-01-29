/**
 * 
 */
package com.thiru.entity;

import java.io.Serializable;
import java.math.BigDecimal;

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
public class Rating implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String tconst;
	private BigDecimal averageRating;
	private Integer numVotes;

}
