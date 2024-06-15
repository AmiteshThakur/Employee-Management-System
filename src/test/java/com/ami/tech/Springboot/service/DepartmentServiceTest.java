package com.ami.tech.Springboot.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.ami.tech.Springboot.entity.Department;
import com.ami.tech.Springboot.repository.DepartmentRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest
public class DepartmentServiceTest {

  @Autowired
  private DepartmentService departmentService;

  @MockBean
  private DepartmentRepository departmentRepository;

  // humne ise mock kar diya hai

  @BeforeEach
  public void setup() {
    Department department = Department
      .builder()
      .departmentName("IT")
      .departmentAddress("Ahemdabad")
      .departmentCode("IT-07")
      .departmentId(1L)
      .build();

    //   humne set kar diya hai ki jab bhi findByDepartmentNameIgnoreCase("IT") method chale to use department return karna hai.
      Mockito.when(departmentRepository.findByDepartmentNameIgnoreCase("IT")).thenReturn(department);
  }

  @Test
  @DisplayName("Get data based on Valid Department Name")
  public void whenValidDepartmentName_thenDepartmentShouldFound() {
    String departmentName = "IT";
    Department found = departmentService.fetchDepartmentByName(departmentName);
    // this is the validation if the object we gets is name is equlas to our provided department name then our test is successful .
    assertEquals(departmentName, found.getDepartmentName());
  }
}
