package com.example.ora3.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ora3.repository.PeopleEntity;
import com.example.ora3.service.PeopleService;

@RestController
public class PeopleController<UserEntity> {
	
	private  PeopleService peopleservice;
	
	public PeopleController(PeopleService peopleservice) {
		this.peopleservice = peopleservice;
	}
	
	@PostMapping(path = "/people", consumes = "application/json")
	void savePeople(@Valid @RequestBody PeopleDto peopledto){
		peopleservice.savePeople(
				peopledto.toPeopleEntity()
				);
		
		System.out.println("Sikeres POST küldés! -- " + peopledto.toString());
	}
	
	@GetMapping(value="/people")
	List<PeopleEntity> readPeople(){
		return (List<PeopleEntity>) peopleservice.readPeople();
		
	}
	
	@GetMapping(value="/people/{id}")
	Optional<PeopleEntity> onePeople(@PathVariable String id) {
		
		Optional<PeopleEntity> user = peopleservice.ReadById(id) ;
		return user;
	}
		
	
}
