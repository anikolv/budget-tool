package com.team1.pbt.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	private static final Logger LOG = LogManager.getLogger(HomeController.class);

	@GetMapping(value="/")
	public String index() {
		return "index";
	}
}
