package com.example.EmployeeManagementSystem.entity;



import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long employeeId;
    private String firstName;
    private String lastName;
    private String birthDate;
    private String cellPhone;
    @ManyToOne(cascade= CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name="fk_department_id",referencedColumnName="departmentId")
   // @JsonBackReference

    private Department department;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Project> projects;

    public Employee() {
    }

    public Employee(Long employeeId, String firstName, String lastName, String birthDate, String cellPhone, Department department, List<Project> projects) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.cellPhone = cellPhone;
        this.department = department;
        this.projects = projects;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
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

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", cellPhone='" + cellPhone + '\'' +
                ", department=" + department +
                ", projects=" + projects +
                '}';
    }

    public Employee(String firstName, String lastName, String birthDate, String cellPhone) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.cellPhone = cellPhone;
    }
}
