package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	private SzamologepService szamologepService = new SzamologepService();
	
	@GetMapping("/")
	
	public String main() {
		
		return "Hello Waze!!!";
	}
	
	@GetMapping("/calculator")
	
	public double szamologep(
			@RequestParam("a") int a,
			@RequestParam("b")int b,
			@RequestParam("operator") String operator
			) {
		
				return szamologepService.szamol(a, b, operator);
	}
	
	@GetMapping(path="/calculator-rest", 
	consumes = "application/JSON", 
	produces = "application/JSON")
	public double calculatorRest(@RequestBody CalculatorDto calculatorDto) {
	
	return szamologepService.szamol(
				calculatorDto.getA(), 
				calculatorDto.getB(),
				calculatorDto.getOperator()				
			);
}
	
	
}
