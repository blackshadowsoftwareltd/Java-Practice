package com.mycompany.testproject;

import java.util.Scanner;

public class TestProject {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String input = scanner.nextLine();
        scanner.close();

        int number = 0;
        if (input.startsWith("0")) {
            number = Integer.parseInt(input, 8); // Parse as octal number
        } else {
            number = Integer.parseInt(input);
        }
        System.out.println("You entered: ");
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
