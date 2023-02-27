package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Employe> emps=new ArrayList<>();
        emps.add(new Employe("Bisal","12345567",12));
        emps.add(new Employe("Bisal1","12345568",13));
        emps.add(new Employe("Bisal2","12345569",14));

        System.out.println(emps);

        //compareble

        System.out.println(emps);
    }
}