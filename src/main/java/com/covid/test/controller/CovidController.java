package com.covid.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.covid.test.repository.CovidRepository;

@RestController
@RequestMapping("/covid")
public class CovidController {
	  
	@Autowired
	CovidRepository covidRepository;
	
	
	
	
}
