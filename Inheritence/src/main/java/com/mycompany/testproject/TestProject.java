package com.mycompany.testproject;

import java.time.LocalDateTime;

public class TestProject {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime start = now.withHour(9),
                end = now.withHour(17);

        Employee e1 = new Employee("John", 25, 1000);
        e1.showDetails();

        Admin a1 = new Admin("Jane", 1000,
                start,
                end);
        a1.showDetails();
    }
}
