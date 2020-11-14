package com.ritesh.ds.backtracking;

/*
* Backtracking Program
* */
public class RatInAMaze
{
    int maze[][] = null;
    int solMaze[][] = null;
    int N;

    private boolean solveMaze(int[][] maze)
    {
        this.maze = maze;
        N = maze.length;
        solMaze = new int[N][N];
        if(solveMaze(0,0))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    private boolean solveMaze(int i, int j)
    {
        if(i == N-1 && j == N-1)
        {
            solMaze[i][j] = 1;
            return true;
        }
        else if(i < N && j < N)
        {
            if(isSafe(i,j)) //  Backtracking
            {
                solMaze[i][j] = 1;
                if(solveMaze(i+1, j))
                {
                    return true;
                }
                else if(solveMaze(i, j+1) )
                {
                    return true;
                }
                solMaze[i][j] = 0;
            }
        }
        return false;
    }

    private boolean isSafe(int i, int j)
    {
       if(maze[i][j] == 1)
       {
           return true;
       }
       return false;
    }

    private void printSolMatrix()
    {
        if(solMaze != null && solMaze.length > 0)
        {
            for(int i=0; i<solMaze.length; i++)
            {
                for(int j=0; j<solMaze.length; j++)
                {
                    System.out.print(solMaze[i][j]+" ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args)
    {
        RatInAMaze ratInAMaze = new RatInAMaze();
        int maze[][] = {{1,0,1},
                        {1,1,1},
                        {1,1,1}};
        System.out.println(ratInAMaze.solveMaze(maze));
        ratInAMaze.printSolMatrix();
    }
}
