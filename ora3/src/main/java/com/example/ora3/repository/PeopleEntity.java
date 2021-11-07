package com.example.ora3.repository;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PeopleEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Long age;
	@Column(length=20)
	private String name;
	
	/*
	//constructor
	
	public People() {
		
	}
	
	public People(String name, Long age) {
		this.name = name;
		this.age = age;
	}


	//Getters /Setters
	
	public Long getAge() {
		return age;
	}

	public void setAge(Long age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}


	*/
	
}
