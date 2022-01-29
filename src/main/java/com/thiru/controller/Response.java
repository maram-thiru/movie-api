/**
 * 
 */
package com.thiru.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Thirupathi Maram
 *
 */
@Component
@Data
@Getter
@Setter
public class Response<T> {

	List<T> data = new ArrayList<>();
	String message;
}
