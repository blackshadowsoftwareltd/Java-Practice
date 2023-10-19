/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dfs_graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author remon
 */
public class BFS_Graph {
    int n = 8;
    char[] c = { 's', 'a', 'b', 'c', 'd', 'e', 'f', 'g' };
    int list[][] = { { 1, 2, 3 }, { 0, 4 }, { 0, 5 }, { 0, 6 }, { 1, 7 }, { 2, 7 }, { 3, 7 }, { 4, 5, 6 } };
    int[] color = new int[n];
    int[] prev = new int[n];
    int[] f = new int[n];
    int[] d = new int[n];
    int time = 0;

    public void startDFS() {
        for (int i = 0; i < n; i++) {
            color[i] = 0;
            prev[i] = -1;
            d[i] = f[i] = 999999;
        }
        for (int i = 0; i < n; i++) {
            if (color[i] == 0) {
                runDFS(i);
            }
        }
    }

    public void runDFS(int u) {
        System.out.println(c[u] + " ");
        color[u] = 1;
        time++;
        d[u] = time;
        for (int i = 0; i < list[u].length; i++) {
            int v = list[u][i];
            if (color[v] == 0) {
                prev[v] = u;
                runDFS(v);
            }
        }
        color[u] = 2;
        time++;
        f[u] = time;
    }
}
