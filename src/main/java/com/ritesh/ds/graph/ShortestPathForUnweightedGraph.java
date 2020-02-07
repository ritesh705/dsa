package com.ritesh.ds.graph;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class ShortestPathForUnweightedGraph
{
    private static void getShortestPath(int[][] graph, int s)
    {
        int v  = graph.length;
        boolean visited[] = new boolean[v];
        int[] distance = new int[v];
        for(int i=0; i<v; i++)
        {
            distance[i] = -1;
            visited[i] = false;
        }
        Queue<Integer> queue = new LinkedList<>();
        visited[s] = true;
        queue.add(s);
        distance[s] = 0;
        while(!queue.isEmpty())
        {
            int i = queue.poll();
            for(int j=0; j<v; j++)
            {
                if(graph[i][j]!=0 && !visited[j])
                {
                    int d = graph[i][j];
                    if(distance[i] != -1)
                    {
                        d = graph[i][j]+distance[i];
                    }
                    if(distance[j]==-1 || distance[j] >= d)
                    {
                        distance[j] = d;
                    }
                    visited[j] = true;
                    queue.add(j);
                }
            }
        }

        for(int i=0; i<v; i++)
        {
            System.out.println("Shortest distance from "+s+" to "+i+" is :"+distance[i]);
        }
    }

    public static void main(String[] args)
    {
        int[][] graph = {{0,1,0,1,0,0,0,0},
                        {1,0,1,0,0,0,0,0},
                        {1,0,0,0,1,0,0,1},
                        {1,0,0,0,1,0,0,1},
                        {0,0,0,1,0,1,1,1},
                        {0,0,0,0,1,0,1,0},
                        {0,0,0,0,1,1,0,1},
                        {0,0,0,1,1,0,1,0}};

        getShortestPath(graph, 0);
    }
}