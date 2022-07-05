package com.example.RestApiProject.Service;

import java.util.List;

import javax.persistence.Id;

import com.example.RestApiProject.Entity.Person;

public interface PersonService<T, ID> {
	
	List<T>findAll();

	T findById(ID id);

	T save(T t);

	T update(T t);
	
	T delete(ID id);

}
