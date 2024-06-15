package com.ami.tech.Springboot.service;

import com.ami.tech.Springboot.entity.Department;
import com.ami.tech.Springboot.error.DepartmentNotFoundException;
import com.ami.tech.Springboot.repository.DepartmentRepository;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService {

  @Autowired
  private DepartmentRepository departmentRepository;

  @Override
  public Department saveDepartment(Department department) {
    // TODO Auto-generated method stub

    return departmentRepository.save(department);
  }

  @Override
  public List<Department> fetchDepartmentList() {
    // TODO Auto-generated method stub
    return departmentRepository.findAll();
  }

  @Override
  public Department fetchDepartmentById(Long id) throws DepartmentNotFoundException {
    // TODO Auto-generated method stub
      Optional<Department> department=departmentRepository.findById(id);
      if(!department.isPresent()){
        throw new DepartmentNotFoundException("Deparment not available");
        
      }
      return department.get();
    // we change this code for exception handling.
    // return departmentRepository.findById(id).get();
  }

  @Override
  public void deleteDepartmentById(Long id) {
    // TODO Auto-generated method stub
    departmentRepository.deleteById(id);
  }

  @Override
  public Department updateDepartment(Long id, Department department) {
    // TODO Auto-generated method stub
    Department depDB=departmentRepository.findById(id).get();
    if(Objects.nonNull(department.getDepartmentName()) && !"".equalsIgnoreCase(department.getDepartmentName()))
    {
      // input check karenge ke null or empty to nhi hai
      depDB.setDepartmentName(department.getDepartmentName());
    }
    if(Objects.nonNull(department.getDepartmentCode()) && !"".equalsIgnoreCase(department.getDepartmentCode()))
    {
      // input check karenge ke null or empty to nhi hai
      depDB.setDepartmentCode(department.getDepartmentCode());
    }
    if(Objects.nonNull(department.getDepartmentAddress()) && !"".equalsIgnoreCase(department.getDepartmentAddress()))
    {
      // input check karenge ke null or empty to nhi hai
      depDB.setDepartmentAddress(department.getDepartmentAddress());
    }
      return departmentRepository.save(depDB);

  }

  @Override
  public Department fetchDepartmentByName(String name) {
    // TODO Auto-generated method stub
    
    return departmentRepository.findByDepartmentNameIgnoreCase(name);
  }

  
  
  
  
}
