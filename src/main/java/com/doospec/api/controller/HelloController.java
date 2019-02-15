package com.doospec.api.controller;

import java.math.BigDecimal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.doospec.api.model.Model;

@RestController
public class HelloController {
	
	@GetMapping("/hello")
	@ResponseBody
	public Model hello() {
		
		Model model = new Model();
		model.setName("CIVIC");
		model.setPrice(new BigDecimal(1000));
		return model;
	}

}	
