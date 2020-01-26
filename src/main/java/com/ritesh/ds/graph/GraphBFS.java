package com.ritesh.ds.graph;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
* @author: Ritesh Kumar | ritesh705@gmail.com
* */
public class GraphBFS
{
    public static void BFS(Graph graph, int sourceNode)
    {
        List<List<Integer>> adjacencyList = graph.adjacencyList;
        int v = adjacencyList.size();
        Boolean[] visited = new Boolean[v+1];
        for(int i=0; i<v+1; i++)
        {
            visited[i] = false;
        }
        Queue<Integer> queue = new LinkedList<>();
        queue.add(sourceNode);
        visited[sourceNode] = true;
        while(!queue.isEmpty())
        {
            sourceNode = queue.poll();
            System.out.println(sourceNode);
            for(int j=0; j<adjacencyList.get(sourceNode).size(); j++)
            {
                int nextNode = adjacencyList.get(sourceNode).get(j);
                if(!visited[nextNode])
                {
                    queue.add(nextNode);
                    visited[nextNode] = true;
                }
            }
        }
    }
}
