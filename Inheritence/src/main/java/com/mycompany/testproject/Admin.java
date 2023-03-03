package com.mycompany.testproject;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Admin extends Employee {
    LocalDateTime startTime, endTime;

    public Admin(String name, double salery, LocalDateTime startTime, LocalDateTime endTime) {
        super(name, 0, salery);
        this.startTime = startTime;
        this.endTime = endTime;
    }

    void showDetails() {
        super.showDetails();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println("Start time: " + startTime.format(formatter) + " End time: " + endTime.format(formatter));
    }

}
