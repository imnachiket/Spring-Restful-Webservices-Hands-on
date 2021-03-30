package com.cognizant.springlearn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import lombok.Data;

@Data
public class Country {
	private static final Logger LOGGER = LoggerFactory.getLogger(Country.class);
	private String code;
	private String name;

	public Country() {
		LOGGER.debug("Inside the constructor");
	}

}