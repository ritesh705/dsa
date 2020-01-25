package com.ritesh.ds.bfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
Problem Statement:

    The lot is covered with trenches and has a single obstacle that needs to be
    taken down before the foundation is prepared for the building.
    The demolition robot must remove the obstacle before the progress
    can be made on the building.
    Write an algorithm to determine the minimum distance required for
    the demolition robot to remove the obstacle.

Assumptions:

    The lot is flat, except the trenches and can be represented by a 2D grid.

    The demolition robot must start at the top left corner of the lot,
    which is always flat, and can move on block up, down, right, left

    The demolition robot cannot enter trenches and cannot leave the lot.

    The flat areas are indicated by 1,
    areas with trenches are indicated by 0,
    and the obstacle is indicated by 9

    Input: The input of the function has 3 arguments:

        numRows – number of rows
        numColumns – number of columns
        lot – 2d grid of integers
    Output:
        Return an integer that indicated the minimum distance traversed to remove the obstacle else return -1

    Constraints: 1<= numRows, numColumns <= 1000

Example:

    numRows = 3,
    numColumns = 3
    lot = [
        [1, 0, 0],
        [1, 0, 0],
        [1, 9, 1]
    ]
    Output: 3
*/
public class ShortestPath
{
    static class Node
    {
        public int x;
        public int y;
        public int distance;

        Node(int x, int y, int distance)
        {
            this.x = x;
            this.y = y;
            this.distance = distance;
        }
    }
    static int removeObstacle(int numRows, int numColumns, List<List<Integer>> lot)
    {
        boolean[][] visited = new boolean[numRows][numColumns];

        for(int i=0; i<numRows; i++)
        {
            for(int j=0; j<numColumns; j++)
            {
                if(lot.get(i).get(j)==0)
                {
                    visited[i][j] = true;
                }
                else
                {
                    visited[i][j] = false;
                }
            }
        }

        Queue<Node> queue = new LinkedList<>();
        Node sourceNode = new Node(0,0,0);
        queue.add(sourceNode);
        visited[sourceNode.x][sourceNode.y]=true;

        while(!queue.isEmpty())
        {
            Node top = queue.poll();

            System.out.println("Vertex - Value: "+lot.get(top.x).get(top.y));
            // Destination
            if(lot.get(top.x).get(top.y)==9)
            {
                return top.distance;
            }
            // Down Movement
            if(top.x+1 < numRows
                    && !visited[top.x+1][top.y])
            {
                queue.add(new Node(top.x+1, top.y, top.distance+1));
                visited[top.x+1][top.y] = true;
            }
            // Up Movement
            if(top.x-1 >= 0
                    && !visited[top.x-1][top.y])
            {
                queue.add(new Node(top.x-1, top.y, top.distance+1));
                visited[top.x-1][top.y] = true;
            }
            // Left Movement
            if(top.y-1 > 0
                    && !visited[top.x][top.y-1])
            {
                queue.add(new Node(top.x, top.y-1, top.distance+1));
                visited[top.x][top.y-1] = true;
            }
            // Right Movement
            if(top.y+1 < numColumns
                    && !visited[top.x][top.y+1])
            {
                queue.add(new Node(top.x, top.y+1, top.distance+1));
                visited[top.x][top.y+1] = true;
            }
        }
        return -1;
    }

    public static void main(String args[])
    {
        List<List<Integer>> list2d = new ArrayList<>();
        List<Integer> list01 = new ArrayList<>();
        list01.add(1);
        list01.add(1);
        list01.add(1);
        List<Integer> list02 = new ArrayList<>();
        list02.add(1);
        list02.add(0);
        list02.add(1);
        List<Integer> list03 = new ArrayList<>();
        list03.add(1);
        list03.add(9);
        list03.add(1);
        list2d.add(list01);
        list2d.add(list02);
        list2d.add(list03);
        System.out.println("Distance: "+removeObstacle(3,3, list2d));
    }
}