package com.mycompany.testproject;

import java.util.Scanner;

public class Series {
    void series() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms in the series: ");

        int n = scanner.nextInt();
        scanner.close();
        int a = 0, b = 1, c;
        System.out.print("The series is: " + a + " " + b);
        for (int i = 3; i <= n; i++) {
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
        System.out.println();

    }
}
