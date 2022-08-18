// Given a matrix, your task is to rotate the matrix 90 degrees clockwise.
// Example 1:
// Input: [[1,2,3],[4,5,6],[7,8,9]]
// Output: [[7,4,1],[8,5,2],[9,6,3]]
// Explanation: Rotate the matrix simply by 90 degree clockwise and return the matrix.

// Example 2:
// Input: [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]]
// Output:[[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]
// Explanation: Rotate the matrix simply by 90 degree clockwise and return the matrix

import java.util.*;
class main{
    public static void rotateMarix(int a[][])
    {
        int r = a.length;
        int c = a[0].length;
        // Firstly make transpose of the matrix.
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                int temp =0;
                temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
        // Then reverse the rows
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<r/2;j++)
            {
                int temp =0;
                temp = a[i][j];
                a[i][j] = a[i][r-1-j];
                a[i][r-1-j] = temp;
            }
        }

       
    }
    public static void main(String args[])
    {
        int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
        rotateMarix(a);
       for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[0].length;j++)
            {
                System.out.print(a[i][j]+" ");
            }System.out.println();

        }
    }
}