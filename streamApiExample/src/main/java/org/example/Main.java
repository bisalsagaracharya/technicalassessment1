package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Employee> list=new ArrayList<Employee>();
        list.add(new Employee(1,"bisal",20000.0));
        list.add(new Employee(2,"sam",30000.0));
        list.add(new Employee(3,"sibu",300.0));
        list.add(new Employee(4,"raj",400.0));

        list.stream().filter(emp->emp.getSalary()>25000).sorted((emp1,emp2)->emp1.getName().compareTo(emp2.getName())).forEach(System.out::println);

        list.stream().sorted((emp1,emp2)->emp1.getName().compareTo(emp2.getName())).forEach(System.out::println);

        Optional<Employee> emp=list.stream().max(Comparator.comparing(Employee::getSalary));
        System.out.println(emp);

        Optional<Employee> emp1=list.stream().min(Comparator.comparing(Employee::getSalary));
        System.out.println(emp1);

        Optional<Employee> emp2=list.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(1).findFirst();
        System.out.println(emp2);


//        List<Integer>list=new ArrayList<Integer>();
//        list.add(5);
//        list.add(34);
//        list.add(56);
//        list.add(58);
//        list.add(3);
//        System.out.println(list);
//        //filter method only even number
//        List<Integer> newList=list.stream().filter(x->x%2==0).collect(Collectors.toList());
//        System.out.println(newList);
//        //map method use for some mathmetical function
//        List<Integer> newList1=list.stream().map(x->x/5).collect(Collectors.toList());
//        System.out.println(newList1);
//        //sorted method integer
//        List<Integer> newList2=list.stream().sorted().collect(Collectors.toList());
//        System.out.println(newList2);
//
//        List<String>list1=new ArrayList<String>();
//        list1.add("bisal");
//        list1.add("raj");
//        list1.add("kaju");
//        list1.add("rani");
//        list1.add("mina");
//        System.out.println(list1);
//
//        //sorted method string also
//        List<String> newList3=list1.stream().sorted().collect(Collectors.toList());
//        System.out.println(newList3);
//
//




    }
}