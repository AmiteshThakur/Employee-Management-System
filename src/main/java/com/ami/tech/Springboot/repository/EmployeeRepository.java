package com.ami.tech.Springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.ami.tech.Springboot.entity.Employee;

// interface extending crud repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	
}
