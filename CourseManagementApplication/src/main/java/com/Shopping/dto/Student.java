package com.Shopping.dto;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor

public class Student {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer studentId;
    private String studentName;
    private String course;
    private String studentAddress;
   @OneToMany( fetch = FetchType.EAGER, cascade = CascadeType.ALL)  // mapped to line 18 category variable in product
//   @JoinColumn(name ="categoryId",referencedColumnName = "categoryId")
    private List<Course> course1;

   @OneToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
   private FinalProject finalProject;

//    @OneToMany(mappedBy = "student",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
////    @JsonManagedReference
//    private List<Course> courses;
//
//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "projectId")
//    private FinalProject project;


    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    public List<Course> getCourse1() {
        return course1;
    }

    public void setCourse1(List<Course> course1) {
        this.course1 = course1;
    }

    public FinalProject getFinalProject() {
        return finalProject;
    }

    public void setFinalProject(FinalProject finalProject) {
        this.finalProject = finalProject;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", course='" + course + '\'' +
                ", studentAddress='" + studentAddress + '\'' +
                ", course1=" + course1 +
                ", finalProject=" + finalProject +
                '}';
    }
}

