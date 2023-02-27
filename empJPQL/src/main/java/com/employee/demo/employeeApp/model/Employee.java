package com.employee.demo.employeeApp.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int employeeId;
    private String firstName;
    private String lastName;
    private String birthdate;
    private String cellphone;
    @ManyToOne(cascade = CascadeType.ALL)
    //@JsonBackReference
    //@JoinColumn(name = "fk_dept_id")
    @JsonIgnore
    private Department department;

}
