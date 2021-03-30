package com.cognizant.springlearn;

import javax.validation.constraints.NotNull;

import javax.validation.constraints.Size;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import lombok.Data;
@Data
public class Country {

	@NotNull
	@Size(min = 2, max = 2, message = "Country code should be 2 characters")
	private String code;
	private String name;
	public static final Logger LOGGER = LoggerFactory.getLogger(Country.class);
	public Country() {
		
		LOGGER.debug("Inside Country Constructor");
	}

	

}