package com.ritesh.ds.graph;

import java.util.ArrayList;
import java.util.List;

public class Graph
{
    public List<List<Integer>> adjacencyList = new ArrayList<>();
    private int numberOfVertex;

    Graph(int numberOfVertex)
    {
        this.numberOfVertex = numberOfVertex;
        createGraph();
    }

    private void createGraph()
    {
        for(int i=0;i<numberOfVertex; i++)
        {
            adjacencyList.add(new ArrayList<>());
        }
    }

    public void addEdge(int u, int v)
    {
        adjacencyList.get(u).add(v);
        adjacencyList.get(v).add(u);
    }

    public void printGraph()
    {
        for(int i=0; i<numberOfVertex; i++)
        {
            System.out.print("Vertex "+i);
            List<Integer> innerList = adjacencyList.get(i);
            for (Integer j : innerList)
            {
                System.out.print(" -> "+j);
            }
            System.out.println();
        }
    }
}