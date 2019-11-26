package com.ahsan.calculator.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

	@GetMapping("/")
	public ResponseEntity<String> healthCheck() {
		return ResponseEntity.ok().body("Hello World");
	}
	

	
	
}
