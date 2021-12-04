package com.example.ora3.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.example.ora3.repository.PeopleEntity;
import com.example.ora3.repository.PeopleRepository;


@Service
public class PeopleServiceImp implements PeopleService {

	
	@Autowired
	private PeopleRepository peoplerepository;
	

	@SuppressWarnings("null")
	@Override
	public void savePeople(PeopleEntity peopleentity) {
		System.out.println(peopleentity.toString());
		System.out.println(peoplerepository);
		peoplerepository.save(peopleentity);
	}

	
	public List<PeopleEntity> readPeople() {
		return (List<PeopleEntity>) peoplerepository.findAll();
	}
	
	public Optional<PeopleEntity> ReadById(String id) {
		System.out.println(id);
		long num = Long.parseLong(id);
		System.out.println(num);
		return peoplerepository.findById(num);
	}
}
