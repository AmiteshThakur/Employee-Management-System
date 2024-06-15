package com.ami.tech.Springboot.service;

import java.util.List;

import com.ami.tech.Springboot.entity.Department;
import com.ami.tech.Springboot.error.DepartmentNotFoundException;

public interface DepartmentService {

   public Department saveDepartment(Department department);
   public List<Department> fetchDepartmentList();
   public Department fetchDepartmentById(Long id) throws DepartmentNotFoundException;
   public void deleteDepartmentById(Long id);
   public Department updateDepartment(Long id, Department department);
   public Department fetchDepartmentByName(String name);
}
