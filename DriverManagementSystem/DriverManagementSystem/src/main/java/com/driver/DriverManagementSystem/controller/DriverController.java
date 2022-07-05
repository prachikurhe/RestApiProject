package com.driver.DriverManagementSystem.controller;

import java.util.List;

import javax.print.attribute.standard.Media;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.driver.DriverManagementSystem.Entity.Driver;
import com.driver.DriverManagementSystem.service.GenericService;

@RestController
@RequestMapping(value="/driver",produces = {MediaType.APPLICATION_JSON_VALUE},consumes = {MediaType.APPLICATION_JSON_VALUE})
public class DriverController {

	
	@Autowired
	GenericService<Driver,Long> service;
	
	@GetMapping("/id/{id}")
	public Driver getById(@PathVariable("id") Long id) {
		return service.findById(id);
		
	}
	
	@PostMapping
	public Driver saveDriver(@RequestBody Driver driver) {
		return service.save(driver);
		
	}
	@PutMapping
	public Driver updateDriver(@RequestBody Driver driver) {
		return service.update(driver);
		
	}
	@DeleteMapping("/id/{id}")
	public Driver deleteDriver(@PathVariable("id") Long id) {
		return service.delete(id);
		
	}
	@GetMapping
	public List<Driver> getAllDriver(){
		return service.findAll();
		
	}
	@GetMapping("/name/{name}")
	public Driver getByName(@PathVariable("name") String name) {
		return service.findByName(name);
		
	}
	
}
