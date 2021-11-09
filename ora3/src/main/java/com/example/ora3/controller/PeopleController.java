package com.example.ora3.controller;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ora3.repository.PeopleEntity;
import com.example.ora3.repository.PeopleRepository;
import com.example.ora3.service.PeopleService;

@RestController
public class PeopleController {
	
	private  PeopleService peopleservice;
	
	public PeopleController(PeopleService peopleservice) {
		this.peopleservice = peopleservice;
	}
	
	@PostMapping(path = "/people", consumes = "application/json")
	void savePeople(@Valid @RequestBody PeopleDto peopledto){
		/**/
		peopleservice.savePeople(
				peopledto.toPeopleEntity()
				);
		/**/
		
		
		System.out.println("Sikeres POST küldés! -- " + peopledto.toString());
		
	}
	
}
