package com.mycompany.testproject;

public class Admin extends Employee {

    public Admin(String name, double salery) {
        super(name, 0, salery);
    }

    void showDetails() {
        System.out.println("Name: " + name + " Salery: " + salery);
    }

}
