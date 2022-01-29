/** 
 * Maximum Element In Each Row
There are some students in the class. The class Adviser needs a recruitment's process for above 60% students. In each and every row there was a student above 60% . Help your adviser to find the students in each row.


Input Format:

The input consists of (m*n+2) integers. The first integer corresponds to m, the number of rows in the matrix and the second integer corresponds to n, the number of columns in the matrix. The remaining integers correspond to the elements in

Maximum Element In Each Row
There are some students in the class. The class Adviser needs a recruitment's process for above 60% students. In each and every row there was a student above 60% . Help your adviser to find the students in each row.


Input Format:

The input consists of (m*n+2) integers. The first integer corresponds to m, the number of rows in the matrix and the second integer corresponds to n, the number of columns in the matrix. The remaining integers correspond to the elements in
The elements are read in row wise order, first row first, then second row and so on. Assume that the maximum value of m and n is 10.
Sample Input:

3
2
4 5
6 9
0 3
 Sample Output:
5
9
3
 */
import java.util.*;
public class max_ele_row {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int mat[][] = new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {   
                mat[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c-1;j++)
            {   
                int temp = mat[i][j];
                if(mat[i][j]<mat[i][j+1])
                {
                    temp=mat[i][j+1];
                }
                System.out.println(temp);
            }
        }
        
    }
}
