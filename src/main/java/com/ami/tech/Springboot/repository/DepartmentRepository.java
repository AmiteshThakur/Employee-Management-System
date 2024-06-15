package com.ami.tech.Springboot.repository;

import javax.swing.Spring;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ami.tech.Springboot.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department ,Long> {
// isme hum jpa ka use karenge because usme already build in methods hai and for that we extends jpaRepsitory and pass it our object type and primary key data type
public Department findByDepartmentName(String name);
// findBy ke baad jo bhi field name ho same dena hai ye implementation khud hi likh lega. hume kuch nhi karna hai.
public Department findByDepartmentNameIgnoreCase(String name);


}

