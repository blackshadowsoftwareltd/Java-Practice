package com.mycompany.testproject;
import java.util.Scanner;

public class TestProject {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();
        System.out.println("You entered: " + number);
        switch (number) {
            case 100:
                System.out.println("Red");
                break;
            case 010:
                System.out.println("Green");
                break;
            case 001:
                System.out.println("Blue");
                break;
            case 011:
                System.out.println("Cyan");
                break;
            case 101:
                System.out.println("Magenta");
                break;
            case 110:
                System.out.println("Yellow");
                break;
            case 111:
                System.out.println("White");
                break;
            case 000:
                System.out.println("Black");
                break;
            default:
                System.out.println("Invalid number");
                break;
        }
    }
}
