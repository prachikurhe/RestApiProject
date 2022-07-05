package com.example.RestApiProject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.RestApiProject.Entity.Person;
@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

}
