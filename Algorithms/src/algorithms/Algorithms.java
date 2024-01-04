/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algorithms;

import java.util.*;

// /**
//  *
//  * @author remon
//  */
// public class Algorithms {

//     /**
//      * @param args the command line arguments
//      */
//     public static void main(String[] args) {
//         System.out.println("Hello World");
//         try {
//             Scanner scanner = new Scanner(System.in);

//             while (scanner.hasNext()) {
//                 int n = scanner.nextInt();
//                 int[] arr = new int[n];

//                 for (int i = 0; i < n; i++) {
//                     arr[i] = scanner.nextInt();
//                 }

//                 int flips = countFlips(arr);
//                 System.out.println("Minimum exchange operations : " + flips);
//             }
//             scanner.close();
//         } catch (Exception e) {
//             e.printStackTrace();
//         }
//     }

//     private static int countFlips(int[] arr) {
//         int flips = 0;
//         for (int i = 0; i < arr.length - 1; i++) {
//             for (int j = i + 1; j < arr.length; j++) {
//                 if (arr[i] > arr[j]) {
//                     // If the current pair is out of order, flip the elements
//                     int temp = arr[i];
//                     arr[i] = arr[j];
//                     arr[j] = temp;
//                     flips++;
//                 }
//             }
//         }
//         return flips;
//     }

// }

// import java.util.Scanner;

// public class Main {

//   static int n;

//   static int bublSort(int arr[]) {
//     int i, j, temp, swap = 0;

//     for (i = 1; i < n; i++) {
//       for (j = 0; j<n-1; j++) {
//         if (arr[j]> arr[j + 1]) {
//           temp = arr[j];
//           arr[j] = arr[j + 1];
//           arr[j + 1] = temp;
//           swap++;
//         }
//       }
//     }

//     return swap;
//   }

//   public static void main(String[] args) {
//     int arr[];

//     Scanner sc = new Scanner(System.in);

//     while (sc.hasNext()) {
//       n = sc.nextInt();
//       arr = new int[n];
//       arr[i] = sc.nextInt();

//       for (int i = 0; i < n; i++) {
//       }

//       int numberOfSwap bublSort(arr);

//       System.out.println("Minimum exchange operations: " + numberOfSwap);

//     }
//   }
// }

import java.util.Scanner;

public class Algorithms {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (scanner.hasNext()) {
      String s1 = scanner.nextLine();
      String s2 = scanner.nextLine();

      int result = longestCommonSubsequence(s1, s2);
      System.out.println(result);
    }

    scanner.close();
  }

  static int longestCommonSubsequence(String s1, String s2) {
    int m = s1.length();
    int n = s2.length();

    int[][] dp = new int[m + 1][n + 1];

    for (int i = 0; i <= m; i++) {
      for (int j = 0; j <= n; j++) {
        if (i == 0 || j == 0) {
          dp[i][j] = 0;
        } else if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
          dp[i][j] = dp[i - 1][j - 1] + 1;
        } else {
          dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
        }
      }
    }

    return dp[m][n];
  }
}
