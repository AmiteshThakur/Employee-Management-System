package com.ami.tech.Springboot.Controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ami.tech.Springboot.entity.Department;
import com.ami.tech.Springboot.error.DepartmentNotFoundException;
import com.ami.tech.Springboot.service.DepartmentService;

import jakarta.validation.Valid;

@RestController
public class DepartmentController {

  private final Logger LOGGER=LoggerFactory.getLogger(DepartmentController.class);

  @Autowired
  private DepartmentService departmentService;

  // this object will automatically came from spring continer
  @PostMapping("/departments")
  public Department savDepartment(@Valid @RequestBody Department department) {
    // with the help of RequestBody it convert the JSON Data into Department.
    LOGGER.info("Inside saveDepartment of DepartmentController");
    // we get the logger info when someone access this method 
    return departmentService.saveDepartment(department);
  }

  @GetMapping("/departments")
  public List<Department> fetchDepartmentList() {
    LOGGER.info("Inside fetchDepartmentList of DepartmentController");
    return departmentService.fetchDepartmentList();
  }

  @GetMapping("/departments/{id}")
//   id is known as path variable it is dynamic
// PathVariable ki help se hum id department id me pass karenge.

  public Department fetchDepartmentById(@PathVariable("id") Long departmentid) throws DepartmentNotFoundException
  {
    return departmentService.fetchDepartmentById(departmentid);
  }

  @DeleteMapping("/departments/{id}")
  public String deleteDepartmentById(@PathVariable("id") Long departmentid)
  {
    departmentService.deleteDepartmentById(departmentid);      
    return "Data is successfully deleted";
  }

  @PutMapping("/departments/{id}")
  public Department updateDepartment(@PathVariable("id") Long departmentId,@RequestBody Department department)
  {
    return departmentService.updateDepartment(departmentId,department);
  }
  @GetMapping("/departments/name/{name}")
  public Department fetchDepartmentByName(@PathVariable("name") String departmentName){
    return departmentService.fetchDepartmentByName(departmentName);
  }
}
