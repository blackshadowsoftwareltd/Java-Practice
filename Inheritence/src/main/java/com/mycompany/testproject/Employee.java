package com.mycompany.testproject;

public class Employee {
    String name;
    int age;
    double salery;

    public Employee(String name, int age, double salery) {
        this.name = name;
        this.age = age;
        this.salery = salery;
    }

    void showDetails() {
        System.out.println("Name: " + name + " Age: " + age + " Salery: " + salery);
    }

}
