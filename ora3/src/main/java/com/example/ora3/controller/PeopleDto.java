package com.example.ora3.controller;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.example.ora3.service.People;

public class PeopleDto {
	
	private Long id;
	@NotBlank
	@Size(min=3)
	private String name;
	@NotNull
	@Min(1)
	private Integer age;
	
	public People toPeople() {
		People people = new People();
		people.setId(getId());
		people.setAge(getAge());
		people.setName(getName());
		return people;
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
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	
	
	
}
