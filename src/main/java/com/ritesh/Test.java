package com.ritesh;

import java.io.IOException;
import java.util.*;

public class Test {

    // Complete the shortestReach function below.
    static int[] shortestReach(int n, int[][] edges, int s)
    {
        int[][] graph = new int[n][n];
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                graph[i][j] = 0;
            }
        }
        for(int i=0; i<edges.length; i++)
        {
            int row = edges[i][0];
            int column = edges[i][1];
            int cost = edges[i][2];
            graph[row-1][column-1] = cost;
            graph[column-1][row-1] = cost;
        }
        s = s-1;
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
            for(int j=0; j<graph[0].length; j++)
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
        distanceArray = finalizeDistanceArray(distanceArray);
        return distanceArray;
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

    private static int[] finalizeDistanceArray(int[] distanceArray)
    {
        int[] finalArray = new int[distanceArray.length-1];
        int j=0;
        for(int i=0; i<distanceArray.length;i++)
        {
            if(distanceArray[i] != 0)
            {
                finalArray[j] = distanceArray[i];
                j++;
            }
        }
        return finalArray;
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

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {


        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] nm = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nm[0]);

            int m = Integer.parseInt(nm[1]);

            int[][] edges = new int[m][3];

            for (int i = 0; i < m; i++) {
                String[] edgesRowItems = scanner.nextLine().split(" ");
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                for (int j = 0; j < 3; j++) {
                    int edgesItem = Integer.parseInt(edgesRowItems[j]);
                    edges[i][j] = edgesItem;
                }
            }

            int s = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] result = shortestReach(n, edges, s);




        }



        scanner.close();
    }
}
