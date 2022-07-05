package com.driver.DriverManagementSystem.service;

import java.util.List;

import com.driver.DriverManagementSystem.Entity.Driver;

public interface GenericService<T,ID> {
	
	T findById(ID id);
	
	T save(T t);
	
	T findByName(String name);
	
	T update(T t);
	
	T delete(ID id);
	
	List<T> findAll();

}
