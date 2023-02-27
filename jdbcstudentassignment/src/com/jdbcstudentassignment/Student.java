package com.jdbcstudentassignment;

public class Student {
  
	Integer studentId;
    String   studentName;
    Double   studentFess;
    public Student() {
        super();
    }
    public Student(Integer studentId, String studentName, Double studentFess) {
        super();
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentFess = studentFess;
    }
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
    public Double getStudentFess() {
        return studentFess;
    }
    public void setStudentFess(Double studentFess) {
        this.studentFess = studentFess;
    }
    @Override
    public String toString() {
        return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentFess=" + studentFess
                + "]";
    }
}
