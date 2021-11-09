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
	
	
	//constructors
	
	public PeopleEntity() {
		super();
	}
	
	public PeopleEntity(Long id, String name, Long age) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
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

	public void setId(Long id) {
		this.id = id;
	}

	//to String
	@Override
	public String toString() {
		return "PeopleEntity [id=" + id + ", age=" + age + ", name=" + name + "]";
	}

	
}
