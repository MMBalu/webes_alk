package com.example.ora3.service;

import java.util.List;
import java.util.Optional;

import com.example.ora3.repository.PeopleEntity;

public interface PeopleService {
	
	public void savePeople(PeopleEntity peopleentity);

	public List<PeopleEntity> readPeople();

	public Optional<PeopleEntity> ReadById(String id);

}
