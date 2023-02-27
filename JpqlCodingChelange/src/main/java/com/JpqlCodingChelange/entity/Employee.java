package com.JpqlCodingChelange.entity;


import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
 

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Integer employeeId;
   private String firstName;
   private String lastName;
   private String birthdate;
   private  Long cellphone;
  
   @ManyToOne(cascade = CascadeType.ALL)
  // @JoinColumn(name="fk_department_id",referencedColumnName="departmentId")
   @JsonBackReference
   private Department department;
 

   public Employee() {
   }

   public Employee(Integer employeeId, String firstName, String lastName, String birthdate, Long cellphone, Department department) {
      super();
      this.employeeId = employeeId;
      this.firstName = firstName;
      this.lastName = lastName;
      this.birthdate = birthdate;
      this.cellphone = cellphone;
      this.department = department;
      
   }

   public Integer getEmployeeId() {
      return employeeId;
   }

   public void setEmployeeId(Integer employeeId) {
      this.employeeId = employeeId;
   }

   public String getFirstName() {
      return firstName;
   }

   public void setFirstName(String firstName) {
      this.firstName = firstName;
   }

   public String getLastName() {
      return lastName;
   }

   public void setLastName(String lastName) {
      this.lastName = lastName;
   }

   public String getBirthdate() {
      return birthdate;
   }

   public void setBirthdate(String birthdate) {
      this.birthdate = birthdate;
   }

   public Long getCellphone() {
      return cellphone;
   }

   public void setCellphone(Long cellphone) {
      this.cellphone = cellphone;
   }

   public Department getDepartment() {
      return department;
   }

   public Department setDepartment(Department department) {
       return this.department = department;
  
   }

   

   @Override
   public String toString() {
      return "Employee{" +
              "employeeId=" + employeeId +
              ", firstName='" + firstName + '\'' +
              ", lastName='" + lastName + '\'' +
              ", birthdate='" + birthdate + '\'' +
              ", cellphone=" + cellphone +
              ", department=" + department +
          
              '}';
   }

   

}

