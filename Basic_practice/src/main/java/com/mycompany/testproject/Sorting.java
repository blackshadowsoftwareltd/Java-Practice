package com.mycompany.testproject;

import java.util.Arrays;
import java.util.Scanner;

public class Sorting {
    int[] sort() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();
        Arrays.sort(array);
        System.out.print("The sorted array is: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        return array;
    }
}
