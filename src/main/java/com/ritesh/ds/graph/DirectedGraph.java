package com.ritesh.ds.graph;

import java.util.ArrayList;
import java.util.List;

public class DirectedGraph
{
    private static int numberOfVertex;
    public static List<List<Integer>> adjList;

    DirectedGraph(int numberOfVertex)
    {
        this.numberOfVertex = numberOfVertex;
        createGraph(numberOfVertex);
    }

    private void createGraph(int numberOfVertex)
    {
        adjList = new ArrayList<>();
        for(int i=0; i<numberOfVertex; i++)
        {
            adjList.add(new ArrayList<>());
        }
    }

    public void addEdge(int u, int v)
    {
        adjList.get(u).add(v);
    }

    public void printGraph()
    {
        for(int i=0; i<numberOfVertex; i++)
        {
            System.out.print("Vertex : "+i);
            List<Integer> innerList = adjList.get(i);
            for(int j : innerList)
            {
                System.out.print(" -> "+j);
            }
            System.out.println();
        }
    }
}
