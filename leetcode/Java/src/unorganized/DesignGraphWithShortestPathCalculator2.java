package unorganized;

import java.util.Arrays;

public class DesignGraphWithShortestPathCalculator2 {

    // interesting Floyd Warshall method, I think code is easier than greedy

    private int[][] graph;
    public Graph(int n, int[][] edges)
    {
        graph = new int[n][n];

        for(int i = 0; i < n; i++) {
            Arrays.fill(graph[i], (int)1e9);
            graph[i][i] = 0;
        }

        for(int[] edge: edges){
            int start = edge[0];
            int end = edge[1];
            int dis = edge[2];
            graph[start][end] = dis;
        }

        for(int a = 0; a < n; a++) {
            for(int b = 0; b < n; b++) {
                for(int c = 0; c < n; c++) {
                    graph[b][c] = Math.min(graph[b][c], graph[b][a] + graph[a][c]);
                }
            }
        }

    }

    public void addEdge(int[] edge)
    {
        int start = edge[0];
        int end = edge[1];
        int dis = edge[2];

        if(graph[start][end] < dis) {
            return;
        }

        graph[start][end] = dis;

        for(int b = 0; b < graph.length; b++) {
            for(int c = 0; c < graph.length; c++) {
                graph[b][c] = Math.min(graph[b][c], graph[b][start] + graph[end][c] + dis);
            }
        }


    }

    public int shortestPath(int node1, int node2)
    {
        int dis = graph[node1][node2];
        return dis == 1e9? -1 : dis;
    }
}
