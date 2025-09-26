package com.shahin.lld.rokomari;

import java.util.*;

public class BFSShortestPath {
    static void bfsShortestPath(List<List<Integer>> graph, int start) {
        int n = graph.size();
        int[] dist = new int[n];
        Arrays.fill(dist, -1); // -1 means not visited
        Queue<Integer> q = new LinkedList<>();

        dist[start] = 0;
        q.add(start);

        while (!q.isEmpty()) {
            int u = q.poll();
            for (int v : graph.get(u)) {
                if (dist[v] == -1) {
                    dist[v] = dist[u] + 1;
                    q.add(v);
                }
            }
        }

        System.out.println("Shortest distances from node " + start + ": " + Arrays.toString(dist));
    }

    public static void main(String[] args) {
        int n = 6; // number of nodes
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        // Example edges
        graph.get(0).add(1);
        graph.get(0).add(2);
        graph.get(1).add(3);
        graph.get(2).add(4);
        graph.get(3).add(5);
        graph.get(4).add(5);

        bfsShortestPath(graph, 0);
    }
}
