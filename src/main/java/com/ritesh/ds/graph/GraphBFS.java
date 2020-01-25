package com.ritesh.ds.graph;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class GraphBFS
{
    public static void BFS(Graph graph, int s)
    {
        List<List<Integer>> adjacencyList = graph.adjacencyList;
        int v = adjacencyList.size();
        Boolean[] visited = new Boolean[v+1];
        for(int i=0; i<v+1; i++)
        {
            visited[i] = false;
        }
        Queue<Integer> queue = new LinkedList<>();
        queue.add(s);
        visited[s] = true;
        for(int i=0; i<adjacencyList.size(); i++)
        {
            while(!queue.isEmpty())
            {
                s = queue.poll();
                System.out.println(s);
                for(int j=0; j<adjacencyList.get(s).size(); j++)
                {
                    if(!visited[adjacencyList.get(s).get(j)])
                    {
                        queue.add(adjacencyList.get(s).get(j));
                        visited[adjacencyList.get(s).get(j)] = true;
                    }
                }
            }
        }
    }
}
