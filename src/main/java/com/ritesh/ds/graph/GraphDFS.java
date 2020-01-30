package com.ritesh.ds.graph;

import java.util.List;
import java.util.Stack;

public class GraphDFS
{
    public static void dfs(Graph graph, int sourceNode)
    {
        List<List<Integer>> adjacencyList = graph.adjacencyList;
        int v = adjacencyList.size();
        boolean[] visited = new boolean[v+1];
        initializeVisited(visited);
        Stack<Integer> stack = new Stack<>();
        visited[sourceNode] = true;
        stack.push(sourceNode);
        while(!stack.empty())
        {
            sourceNode = stack.pop();
            System.out.println(sourceNode);
            for(int i=0; i<adjacencyList.get(sourceNode).size(); i++)
            {
                int newNode = adjacencyList.get(sourceNode).get(i);
                if(!visited[newNode])
                {
                    visited[newNode]=true;
                    stack.push(newNode);
                }
            }
        }
    }

    public static void recursiveDFS(Graph graph, int sourceNode)
    {
        List<List<Integer>> adjacencyList = graph.adjacencyList;
        boolean visited[] = new boolean[adjacencyList.size()+1];
        initializeVisited(visited);
        recursiveDFS(adjacencyList, sourceNode, visited);
    }

    private static void recursiveDFS(List<List<Integer>> adjacencyList,
                                     int sourceNode,
                                     boolean[] visited)
    {
        System.out.println(sourceNode);
        visited[sourceNode] = true;
        for(int i=0; i<adjacencyList.get(sourceNode).size(); i++)
        {
            int newNode = adjacencyList.get(sourceNode).get(i);
            if(!visited[newNode])
            {
                visited[newNode] = true;
                recursiveDFS(adjacencyList, newNode, visited);
            }
        }
    }

    private static void initializeVisited(boolean[] visited)
    {
        for(int i=0; i<visited.length; i++)
        {
            visited[i] = false;
        }
    }
}
