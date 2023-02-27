package com.employee.demo.employeeApp.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "department")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int departId;
    private String deptName;
    @OneToMany(mappedBy = "department",cascade = CascadeType.ALL,orphanRemoval = true)
    //@JsonManagedReference
    @JsonIgnore
    private List<Employee> employees;
}
