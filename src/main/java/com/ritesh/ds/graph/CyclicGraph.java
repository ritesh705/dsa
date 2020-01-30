package com.ritesh.ds.graph;

import java.util.List;

/*
@author: Ritesh Kumar | ritesh705@gmail.com

Algorithm:
    1.Do DFS from every vertex.
    2.During DFS, for any current vertex ‘x’ (currently visiting vertex)
    if there an adjacent vertex ‘y’ is present which is already visited
    and ‘y’ is not a direct parent of ‘x’ then there is a cycle in graph.

    WHY NOT PARENT:
    Let’s assume, vertex ‘x’ and ‘y’ and we have edge between them. x—-y.
    Now do DFS from ‘x’, once you reach to ‘y’, will do the DFS from ‘y’ and adjacent vertex is ‘x’ and
    since its already visited so there should be cycle but actually there is no cycle since ‘x’ is a
    parent of ‘y’. That is why we will ignore visited vertex if it is parent of current vertex.
*/
public class CyclicGraph
{
    public static boolean isCyclic(Graph graph)
    {
        boolean response = false;
        List<List<Integer>> adjList = graph.adjacencyList;
        int pNode = -1;
        boolean visited[] = new boolean[graph.adjacencyList.size()+1];
        initializeBooleanArray(visited);
        for(int i=0; i< adjList.size(); i++)
        {
            if(!visited[i])
            {
                if(isCyclic(adjList, visited, i, pNode))
                {
                    response = true;
                }
            }
        }
        return response;
    }

    public static boolean isCyclic(DirectedGraph graph)
    {
        boolean response = false;
        List<List<Integer>> adjList = graph.adjList;
        boolean visited[] = new boolean[adjList.size()+1];
        initializeBooleanArray(visited);
        boolean recTrack[] = new boolean[adjList.size()+1];
        initializeBooleanArray(recTrack);
        for(int i=0; i<adjList.size(); i++)
        {
             if(isDirectedGraphCyclic(adjList, visited, recTrack, i))
             {
                 response = true;
                 break;
             }
        }
        return response;
    }

    private static boolean isDirectedGraphCyclic(List<List<Integer>> adjList, boolean[] visited, boolean[] recTrack, int sNode)
    {
        boolean response = false;
        if(recTrack[sNode])
        {
            response = true;
        }
        else if(visited[sNode])
        {
            response = false;
        }
        else
        {
            visited[sNode] = true;
            recTrack[sNode] = true;
            for(int i=0; i<adjList.get(sNode).size(); i++)
            {
                int nNode = adjList.get(sNode).get(i);
                if(isDirectedGraphCyclic(adjList, visited, recTrack, nNode))
                {
                    response = true;
                    break;
                }
            }
            recTrack[sNode] = false;
        }
        return response;
    }

    private static boolean isCyclic(List<List<Integer>> adjList, boolean[] visited, int sNode, int pNode)
    {
        boolean response = false;
        if(sNode != pNode && visited[sNode])
        {
            response = true;
        }
        else
        {
            visited[sNode] = true;
            for(int i=0; i<adjList.get(sNode).size(); i++)
            {
                int nNode = adjList.get(sNode).get(i);
                if(isCyclic(adjList, visited, nNode, sNode))
                {
                    response = true;
                    break;
                }
            }
        }
        return response;
    }

    private static void initializeBooleanArray(boolean[] visited)
    {
        for(int i=0; i<visited.length; i++)
        {
            visited[i] = false;
        }
    }
}
