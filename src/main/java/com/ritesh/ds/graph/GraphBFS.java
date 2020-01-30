package com.ritesh.ds.graph;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
* @author: Ritesh Kumar | ritesh705@gmail.com
* */
public class GraphBFS
{
    public static void bfs(Graph graph, int sourceNode)
    {
        List<List<Integer>> adjacencyList = graph.adjacencyList;
        int v = adjacencyList.size();
        Boolean[] visited = new Boolean[v+1];
        initializeVisited(visited);
        Queue<Integer> queue = new LinkedList<>();
        visited[sourceNode] = true;
        queue.add(sourceNode);
        while(!queue.isEmpty())
        {
            sourceNode = queue.poll();
            System.out.println(sourceNode);
            for(int j=0; j<adjacencyList.get(sourceNode).size(); j++)
            {
                int nextNode = adjacencyList.get(sourceNode).get(j);
                if(!visited[nextNode])
                {
                    visited[nextNode] = true;
                    queue.add(nextNode);
                }
            }
        }
    }

    private static void initializeVisited(Boolean[] visited)
    {
        for(int i=0; i<visited.length; i++)
        {
            visited[i] = false;
        }
    }
}
