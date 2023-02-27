package com.Shopping.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class FinalProject {
    @Id
    private Integer projectId;
    private String projectName;
    private String domain;
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Student student;

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "FinalProject{" +
                "projectId=" + projectId +
                ", projectName='" + projectName + '\'' +
                ", domain='" + domain + '\'' +
                ", student=" + student +
                '}';
    }
}
