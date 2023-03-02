package com.mycompany.testproject;

import java.util.Scanner;

public class Searching {
    boolean search() {
        String[] words = { "apple", "banana", "cherry", "date", "elderberry" };
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a search term: ");
        String searchTerm = scanner.nextLine();
        scanner.close();
        boolean found = false;
        for (String word : words) {
            if (word.equals(searchTerm)) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("The search term was found in the array.");
        } else {
            System.out.println("The search term was not found in the array.");
        }
        return found;
    }
}
