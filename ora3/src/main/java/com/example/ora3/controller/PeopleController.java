package com.example.ora3.controller;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ora3.service.PeopleService;

@RestController
public class PeopleController {
	
	private PeopleService peopleService;
	
	public PeopleController(PeopleService peopleService) {
		this.peopleService = peopleService;
	}
	
	@PostMapping(path = "/people", consumes = "application/json")
	void savePeople(@Valid @RequestBody PeopleDto peopledto){
		/**/
		peopleService.savePeople(
					peopledto.toPeople()
				);
		/**/
		
		
		System.out.println(peopledto+" Sikeres POST küldés!");
		
	}
	
}
