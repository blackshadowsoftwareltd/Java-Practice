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

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Algorithms {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (true) {
      int n = scanner.nextInt();
      int m = scanner.nextInt();

      if (n == 0 && m == 0) {
        break;
      }

      int[] inDegree = new int[n + 1];
      ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

      for (int i = 0; i <= n; i++) {
        graph.add(new ArrayList<>());
      }

      for (int i = 0; i < m; i++) {
        int u = scanner.nextInt();
        int v = scanner.nextInt();
        graph.get(u).add(v);
        inDegree[v]++;
      }

      ArrayList<Integer> result = topologicalSort(graph, inDegree, n);
      printResult(result);

    }

    scanner.close();
  }

  static ArrayList<Integer> topologicalSort(ArrayList<ArrayList<Integer>> graph, int[] inDegree, int n) {
    ArrayList<Integer> result = new ArrayList<>();
    Queue<Integer> queue = new LinkedList<>();

    for (int i = 1; i <= n; i++) {
      if (inDegree[i] == 0) {
        queue.add(i);
      }
    }

    while (!queue.isEmpty()) {
      int u = queue.poll();
      result.add(u);

      for (int v : graph.get(u)) {
        inDegree[v]--;
        if (inDegree[v] == 0) {
          queue.add(v);
        }
      }
    }

    return result;
  }

  static void printResult(ArrayList<Integer> result) {
    for (int i = 0; i < result.size(); i++) {
      System.out.print(result.get(i));
      if (i < result.size() - 1) {
        System.out.print(" ");
      }
    }
    System.out.println();
  }
}
