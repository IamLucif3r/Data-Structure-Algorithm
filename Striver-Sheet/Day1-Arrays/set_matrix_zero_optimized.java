// Problem 1:
// Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.
// You must do it in place.
// Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
// Output: [[1,0,1],[0,0,0],[1,0,1]]
// Input: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
// Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]
import java.util.*;
class main{
    public static void setMatrixZero(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int d1[] = new int[row];
        int d2[] = new int[col];
        Arrays.fill(d1,-1);
        Arrays.fill(d2,-1);
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(matrix[i][j] == 0)
                {
                    d1[i] = 0;
                    d2[j] = 0;
                }
            }
        }
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(d1[i] == 0 || d2[j] ==0)
                    matrix[i][j] = 0;
                else
                    continue;
            }
        }
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }System.out.println();
        }
        
    
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int a[][] = new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j] =  sc.nextInt();
            }
        }
        setMatrixZero(a);
    }
}