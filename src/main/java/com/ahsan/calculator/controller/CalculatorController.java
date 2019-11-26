package com.ahsan.calculator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ahsan.calculator.service.CalculatorServiceImpl;


@RestController
public class CalculatorController {
	
	@Autowired
	CalculatorServiceImpl calculatorService;

	@GetMapping("/")
	public ResponseEntity<String> healthCheck() {
		return ResponseEntity.ok().body("Hello World");
	}
	
	@PostMapping("/add")
	public ResponseEntity<Long> add(@RequestParam(name="firstNum") long firstNum, @RequestParam(name="secondNum") long secondNum){		
		long total = calculatorService.add(firstNum, secondNum);
		return ResponseEntity.ok().body(total);
	}
	
	@PostMapping("/substract")
	public ResponseEntity<Long> substract(@RequestParam(name="firstNum") long firstNum, @RequestParam(name="secondNum") long secondNum){		
		long total = calculatorService.substract(firstNum, secondNum);
		return ResponseEntity.ok().body(total);
	}
	
	@PostMapping("/multiply")
	public ResponseEntity<Long> multiply(@RequestParam(name="firstNum") long firstNum, @RequestParam(name="secondNum") long secondNum){		
		long total = calculatorService.multiply(firstNum, secondNum);
		return ResponseEntity.ok().body(total);
	}
	
	@PostMapping("/divide")
	public ResponseEntity<Long> divide(@RequestParam(name="firstNum") long firstNum, @RequestParam(name="secondNum") long secondNum){		
		long total = calculatorService.divide(firstNum, secondNum);
		return ResponseEntity.ok().body(total);
	}
	

	
	
}
