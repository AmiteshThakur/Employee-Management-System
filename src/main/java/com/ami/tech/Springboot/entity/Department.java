package com.ami.tech.Springboot.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
// import jakarta.validation.constraints.Email;
// import jakarta.validation.constraints.Future;
// import jakarta.validation.constraints.FutureOrPresent;
// import jakarta.validation.constraints.Negative;
// import jakarta.validation.constraints.NegativeOrZero;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
// import jakarta.validation.constraints.Past;
// import jakarta.validation.constraints.Positive;
// import jakarta.validation.constraints.PositiveOrZero;
// import jakarta.validation.constraints.Size;
// import org.hibernate.validator.constraints.Length;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
// this data annotation is from lombok it has all getter and setter and toString also 
// if we need only getter so we can use @Getter and for setter @Setter 
@NoArgsConstructor
// this is from lombok and is used for defaul constructor
@AllArgsConstructor
// for the constructor of all data tyeps
@Builder
// for implementing Builder patter?
public class Department {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long departmentId;

  // ise humne primary key banaya hai or gneration auto rakaha hai
  @NotBlank(message = "Please Add Department Name")
  /*some more validation we can apply
   */
  // @Length(max=5, min=1)
  // @Size(max = 10, min = 0, message = "this is not allowed")
  // @Email
  // @Positive
  // @Negative
  // @PositiveOrZero
  // @NegativeOrZero
  // This three are for date validation
  // @Future
  // @FutureOrPresent
  // @Past
  private String departmentName;

  // we make department name compulsory by using spring starter validation and we use NotBlank annotation and if it is blank we passes the message to
  private String departmentAddress;
  private String departmentCode;

  // hum lombok ka use karenge is liye we comment out all the getter setter and construtor.


  // public Department() {}

  // public Department(
  //   Long departmentId,
  //   String departmentName,
  //   String departmentAddress,
  //   String departmentCode
  // ) {
  //   this.departmentId = departmentId;
  //   this.departmentName = departmentName;
  //   this.departmentAddress = departmentAddress;
  //   this.departmentCode = departmentCode;
  // }

  // public Long getDepartmentId() {
  //   return departmentId;
  // }

  // public void setDepartmentId(Long departmentId) {
  //   this.departmentId = departmentId;
  // }

  // public String getDepartmentName() {
  //   return departmentName;
  // }

  // public void setDepartmentName(String departmentName) {
  //   this.departmentName = departmentName;
  // }

  // public String getDepartmentAddress() {
  //   return departmentAddress;
  // }

  // public void setDepartmentAddress(String departmentAddress) {
  //   this.departmentAddress = departmentAddress;
  // }

  // public String getDepartmentCode() {
  //   return departmentCode;
  // }

  // public void setDepartmentCode(String departmentCode) {
  //   this.departmentCode = departmentCode;
  // }

  // @Override
  // public String toString() {
  //   return (
  //     "Department [departmentId=" +
  //     departmentId +
  //     ", departmentName=" +
  //     departmentName +
  //     ", departmentAddress=" +
  //     departmentAddress +
  //     ", departmentCode=" +
  //     departmentCode +
  //     "]"
  //   );
  // }
}
