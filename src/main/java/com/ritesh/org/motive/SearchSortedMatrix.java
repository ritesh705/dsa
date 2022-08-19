package com.ritesh.org.motive;

/*
Search in a row wise and column wise sorted matrix
* */
public class SearchSortedMatrix
{
    public static void main(String[] args)
    {
        int[][] ipMatrix =  { {10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 50},
                {36, 38, 42, 56}};
        for(int i = 0; i< 100; i++)
        {
            int[] result = searchMatrix(ipMatrix, i);
            System.out.println("Position Of "+i+" : ["+result[0]+"] ["+result[1]+"]");
        }
    }
    private static int[] searchMatrix(int[][] matrix, int searchNumber)
    {
        int[] result = new int[2];
        result[0] = -1;
        result[1] = -1;
        if(matrix == null)
        {
            return result;
        }
        int rowLength = matrix.length;
        int columnLength = matrix[0].length;
        if(searchNumber < matrix[0][0] || searchNumber > matrix[rowLength-1][columnLength-1])
        {
            return result;
        }
        int i = 0;
        int j = columnLength-1;
        while(i>=0 && i< rowLength && j>=0 && j<columnLength)
        {
            if(matrix[i][j] == searchNumber)
            {
                result[0] = i;
                result[1] = j;
                return result;
            }
            if(matrix[i][j] > searchNumber)
            {
                j--;
            }
            else
            {
                i++;
            }
        }
        return result;
    }
}
