package org.example;

//public class Employe implements Comparable<Employe> {
public class Employe

    private String name;
    private String phone;
    private int empId;

 //   @Override
//    public int compareTo(Employe employe) {
//
//        return this.name.compareTo(employe.getName());
//    }
    public Employe(String name, String phone, int empId) {
        this.name = name;
        this.phone = phone;
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", empId='" + empId + '\'' +
                '}';
    }


}
