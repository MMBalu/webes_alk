package com.example.ora3.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PeopleRepository extends CrudRepository<PeopleEntity, Long>{
	
}
