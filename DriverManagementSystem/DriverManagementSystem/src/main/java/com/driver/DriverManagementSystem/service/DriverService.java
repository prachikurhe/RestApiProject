package com.driver.DriverManagementSystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.driver.DriverManagementSystem.Entity.Driver;
import com.driver.DriverManagementSystem.repository.DriverRepository;


@Service
public class DriverService implements GenericService<Driver, Long>{

	@Autowired
	DriverRepository repository;
	
	@Override
	public Driver findById(Long id) {
		return repository.findById(id).get();
	}

	@Override
	public Driver save(Driver driver) {
		
		return repository.save(driver);
	}

	@Override
	public Driver update(Driver driver) {
		
		return repository.save(driver);
	}

	@Override
	public Driver delete(Long id) {
		Driver one=repository.getById(id);
		repository.deleteById(id);
		return one;
	}

	@Override
	public List<Driver> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Driver findByName(String name) {
		
		return repository.findByName(name);
	}

}
