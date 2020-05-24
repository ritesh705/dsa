package com.ritesh.ds.graph;

import java.util.Stack;

public class TopologicalSorting
{
    private static void sort(int[][] graph)
    {
        boolean[] visited = new boolean[graph.length];
        for(int i=0; i<graph.length; i++)
        {
            visited[i] = false;
        }
        Stack<Integer> stack = new Stack();
        for(int i=0; i<graph.length; i++)
        {
            if(!visited[i])
            {
                topologicalUtil(graph, visited, stack, i);
            }
        }
        while(!stack.isEmpty())
        {
            System.out.println(stack.pop());
        }
    }

    private static void topologicalUtil(int[][] graph, boolean[] visited, Stack stack, int s)
    {
        int i = s;
        visited[i] = true;
        for(int j=0; j<graph.length; j++)
        {
            if(graph[i][j] != 0 && !visited[j])
            {
                topologicalUtil(graph, visited, stack, j);
            }
        }
        stack.push(i);
    }

    public static void main(String[] args)
    {
        int[][] graph = new int[][]{{0,0,0,0,0,0},
                                    {0,0,0,0,0,0},
                                    {0,0,0,1,0,0},
                                    {0,1,0,0,0,0},
                                    {1,1,0,0,0,0},
                                    {1,0,1,0,0,0}};
        sort(graph);
    }
}
