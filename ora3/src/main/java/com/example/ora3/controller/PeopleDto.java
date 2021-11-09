package com.example.ora3.controller;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.example.ora3.repository.PeopleEntity;
import com.example.ora3.service.People;

public class PeopleDto {
	
	private Long id;
	@NotBlank
	@Size(min=3)
	private String name;
	@NotNull
	@Min(1)
	private Long age;
	
	public PeopleEntity toPeopleEntity() {
		PeopleEntity people = new PeopleEntity(id, name, age);
		/*
		people.setId(id);
		people.setAge(getAge());
		people.setName(getName());
		*/
		return people;
	}
	
	@Override
	public String toString() {
		return "PeopleDto [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getAge() {
		return age;
	}
	public void setAge(Long age) {
		this.age = age;
	}
	
	
	
	
}
