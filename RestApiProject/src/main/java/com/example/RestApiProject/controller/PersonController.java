package com.example.RestApiProject.controller;

import java.util.List;

import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.RestApiProject.Entity.Person;
import com.example.RestApiProject.Service.PersonService;

@RestController
public class PersonController {
	@Autowired
	PersonService<Person, Long> service;
	
	@GetMapping("/emp")
	public List<Person>getAll() {
		return service.findAll();
	}
	
	@GetMapping("/emp/id/{id}")
	public Person getPersonById(@PathVariable("id") long id) {
		return service.findById(id);
		
	}
	
	@PostMapping("/emp")
	public Person savePerson(@RequestBody Person person) {
		return service.save(person);
		
	}
	
	@PutMapping("/emp")
	public Person updatePerson(@RequestBody Person person) {
		return service.update(person);
		
	}
	@DeleteMapping("/emp/id/{id}")
	public Person deletePerson(@PathVariable long id) {
		return service.delete(id);
		
	}
	
	
	

}
