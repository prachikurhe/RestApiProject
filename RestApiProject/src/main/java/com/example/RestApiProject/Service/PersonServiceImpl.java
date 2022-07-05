package com.example.RestApiProject.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.RestApiProject.Entity.Person;
import com.example.RestApiProject.Repository.PersonRepository;
@Service
public class PersonServiceImpl implements PersonService<Person ,Long> {
   
	@Autowired
	PersonRepository repository;
		
	@Override
	public List<Person> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
				
	}

	@Override
	public Person findById(Long id) {
		// TODO Auto-generated method stub
		return repository.getById(id);
	}

	@Override
	public Person save(Person person) {
		// TODO Auto-generated method stub
		return repository.save(person);
	}

	@Override
	public Person update(Person person) {
		// TODO Auto-generated method stub
		return repository.save(person);
	}

	@Override
	public Person delete(Long id) {
		// TODO Auto-generated method stub
		Person p=repository.getById(id);
		repository.deleteById(id);
		return p;
	}
	

}
