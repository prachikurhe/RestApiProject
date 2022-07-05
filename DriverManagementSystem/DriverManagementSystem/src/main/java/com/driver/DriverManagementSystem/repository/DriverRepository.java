package com.driver.DriverManagementSystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.driver.DriverManagementSystem.Entity.Driver;


@Repository
public interface DriverRepository extends JpaRepository<Driver, Long>{
	 Driver findByName(String name);

}
