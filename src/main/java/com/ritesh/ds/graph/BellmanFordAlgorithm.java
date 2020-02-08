package com.ritesh.ds.graph;

/*
* author: Ritesh Kumar | ritesh705@gmail.com
* since: 08th February, 2020
*
* Explanation:
* https://www.programiz.com/dsa/bellman-ford-algorithm
*   Note - Implementation of code is different since I have used adjacency matrix.
*
* */
public class BellmanFordAlgorithm
{
    private static void getShortestPath(int[][] graph, int source)
    {
        int numberOfVertex = graph.length;
        int distance[] = new int[numberOfVertex];
        for(int i=0; i<numberOfVertex; i++)
        {
            distance[i] = Integer.MAX_VALUE;
        }
        distance[source] = 0;
        for(int k=0; k<numberOfVertex-2; k++)
        {
            for(int i=0; i<numberOfVertex; i++)
            {
                for(int j=0; j<numberOfVertex; j++)
                {
                    if(graph[i][j] != 0 && j!=source)
                    {
                        int tempDistance = distance[i]+graph[i][j];
                        if(distance[j] > tempDistance)
                        {
                            distance[j] = tempDistance;
                        }
                    }
                }
            }
        }

        for(int i=0; i<numberOfVertex; i++)
        {
            for(int j=0; j<numberOfVertex; j++)
            {
                if(graph[i][j] != 0 && j!=source)
                {
                    int tempDistance = distance[i]+graph[i][j];
                    if(distance[j] > tempDistance)
                    {
                        System.out.println("Graph still has negative edge.");
                    }
                }
            }
        }

        for(int i=0; i<distance.length; i++)
        {
            if(distance[i] != Integer.MAX_VALUE)
            {
                System.out.println("Shortest Path From Source "+source+" To Destination "+i+" is "+distance[i]+".");
            }
        }
    }

    public static void main(String[] args)
    {
       int [][] graph = {{0,4,0,0,-1},
                       {4,0,2,0,2},
                       {0,2,0,6,0},
                       {0,0,6,0,2},
                       {-1,2,0,2,0}};
       getShortestPath(graph,0);
    }
}
