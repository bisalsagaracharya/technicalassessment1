package org.example;

import java.util.ArrayList;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {


        Employee emp2 = new Employee(1, "bisal1", 30000.0);

        Predicate<Employee> e1 = (emp1) -> emp2.getSalary() >= 25000.0;
        System.out.println(e1.test((Employee) emp2));


        // write a lambda to increase emp sal by given 10%
        BiFunction<Employee, Double, Employee> hikeEmployeeSalary = (emp, hike) -> {

            Double salary = emp.getSalary();
            salary = salary + (salary * (hike / 100.0));
            emp.setSalary(salary);
            return emp;
        };
        Employee emp = new Employee(1, "Bisal", 10000.0);
        System.out.println("emp after sal hike :" + hikeEmployeeSalary.apply(emp, 10.0));


        Employee[] employees = new Employee[4];
        employees[0] = new Employee(1, "Bisal", 30000.0);
        employees[1] = new Employee(1, "Bisal1", 40000.0);
        employees[2] = new Employee(1, "Bisal2", 50000.0);
        employees[3] = new Employee(1, "Bisal3", 10000.0);

        employePrice(employees, 25000.0);

    }

    public static void employePrice(Employee[] employees, Double salary) {
        BiFunction<Employee[], Double, ArrayList> giveemployes = (empl, sal) -> {
            ArrayList arr = new ArrayList();
            for (int i = 0; i < empl.length; i++) {
                if (empl[i].getSalary() >= sal) {
                    arr.add(employees[i]);
                }
            }
            return arr;
        };
        ArrayList arr = giveemployes.apply(employees, salary);
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i).toString());
        }
    }
}














