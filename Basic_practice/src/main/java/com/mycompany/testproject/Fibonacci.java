package com.mycompany.testproject;

import java.util.Scanner;

public class Fibonacci {
    int fibonacci() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();
        sc.close();
        int fib = fibonacciCalculate(n);
        System.out.println("The " + n + "th Fibonacci number is " + fib);
        return fib;
    }

    int fibonacciCalculate(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacciCalculate(n - 1) + fibonacciCalculate(n - 2);
        }
    }
}
