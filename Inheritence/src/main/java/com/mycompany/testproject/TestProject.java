package com.mycompany.testproject;

public class TestProject {
    public static void main(String[] args) {
        Employee e1 = new Employee("John", 25, 1000);
        e1.showDetails();
        Admin a1 = new Admin("Jane", 1000);
        a1.showDetails();
    }
}
