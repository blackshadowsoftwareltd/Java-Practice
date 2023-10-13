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
public class DFS_Graph {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] inputGraph = takeUserInput();
        dfs(inputGraph);
    }

    static void start() {
        int visited[], level[];

    }

    static int[][] takeUserInput() {
        Random random = new Random();
        int[][] inputGraph = new int[5][5];
        for (int i = 0; i < inputGraph.length; i++) {
            for (int j = 0; j < inputGraph[i].length; j++) {
                inputGraph[i][j] = random.nextInt(2);
            }
        }
        return inputGraph;
    }

    static void dfs(int[][] inputGraph) {
        int source = 0;
        int[][] graph = new int[inputGraph.length][inputGraph.length];
        int[] visited = new int[100];
        int[] level = new int[100];
        List<Integer> queue = new ArrayList<>();
        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[i].length; j++) {
                graph[i][j] = 0;
            }
        }
        visited[source] = 1;
        level[source] = 0;
        queue.add(source);

        while (queue.size() != 0) {
        
        }
    }
}
