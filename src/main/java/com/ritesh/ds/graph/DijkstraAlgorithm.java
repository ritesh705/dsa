package com.ritesh.ds.graph;

import java.util.Comparator;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

/*
* @author: Ritesh Kumar | ritesh705@gmail.com
* @since: 03rd February, 2020
*
* */
public class DijkstraAlgorithm
{
    public static void main(String[] args)
    {
        int[][] graph = new int[][]{{0,9,6,5,3},
                                    {9,0,2,0,0},
                                    {6,2,0,4,0},
                                    {5,0,4,0,0},
                                    {3,0,0,0,0,}};

        getShortestPath(graph, 0);
    }

    public static void getShortestPath(int[][] graph, int s)
    {
        int numOfVertex = graph.length;
        int[] distanceArray = new int[numOfVertex];
        initializeDistanceArray(distanceArray);
        Set settled = new HashSet<Integer>();
        PriorityQueue<PQNode> pq = getPriorityQueue(numOfVertex);
        pq.add(new PQNode(s, 0));
        distanceArray[s] = 0;
        while(settled.size() != numOfVertex)
        {
            int i = pq.remove().vertex;
            settled.add(i);
            for(int j=0; j<numOfVertex; j++)
            {
                if(graph[i][j]!=0 && !settled.contains(j))
                {
                    int d = graph[i][j];
                    if(distanceArray[i] != -1)
                    {
                        d = d+distanceArray[i];
                    }
                    if(distanceArray[j] == -1 || distanceArray[j] > d)
                    {
                        distanceArray[j] = d;
                        pq.add(new PQNode(j, d));
                    }
                }
            }
        }

        for(int i=0; i<numOfVertex; i++)
        {
            System.out.println("Shortest Path From Source "+s+" to "+i+" is "+distanceArray[i]);
        }
    }

    private static PriorityQueue getPriorityQueue(int numOfVertex)
    {
        PriorityQueue<PQNode> pq = new PriorityQueue<PQNode>(numOfVertex, new PQNode());
        return pq;
    }

    private static void initializeDistanceArray(int[] distanceArray)
    {
        for(int i=0; i<distanceArray.length;i++)
        {
            distanceArray[i] = -1;
        }
    }

    static class PQNode implements Comparator<PQNode>
    {
        int vertex;
        int cost;

        PQNode() { }

        PQNode(int vertex, int cost)
        {
            this.vertex = vertex;
            this.cost = cost;
        }


        @Override
        public int compare(PQNode o1, PQNode o2)
        {
            if(o1.cost > o2.cost)
            {
                return 1;
            }
            if(o1.cost < o2.cost)
            {
                return -1;
            }
            return 0;
        }
    }
}
