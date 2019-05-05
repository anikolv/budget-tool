package com.team1.pbt.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomePage {
	private static final Logger LOG=LogManager.getLogger(HomePage.class);

	@RequestMapping(value="/home")
	public String home() {
		LOG.info("inside home.");
		return "Hello World!";
	}
}
