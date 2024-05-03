package com.limit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.limit.configuration.Config;
import com.limit.model.Limits;

@RestController
public class LimitController {
	
	@Autowired
	private Config config;
	
	@GetMapping("/limits")
	public Limits retrievelimits() {
		//return new Limits(1,1000);
		
		return new Limits(config.getMinimum(), config.getMaximum());
	}
}
