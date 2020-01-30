package com.ritesh.ds.graph;

public class App
{
    public static void main(String args[])
    {
        Graph graph = new Graph(7);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(2, 5);
        graph.addEdge(3, 5);
        graph.addEdge(4, 5);
        graph.addEdge(4, 6);
        graph.addEdge(5, 6);
        graph.printGraph();
        System.out.println("BFS Traversal");
        GraphBFS.bfs(graph,1);
        System.out.println("DFS Traversal");
        GraphDFS.dfs(graph,1);
        System.out.println("Recursive DFS Traversal");
        GraphDFS.recursiveDFS(graph, 1);
    }
}
