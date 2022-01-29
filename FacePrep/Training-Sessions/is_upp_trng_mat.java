/** 
 * Upper Triangular Matrix
An upper triangular matrix is a square matrix in which all the elements below the diagonal are zero. That is, all the non-zero elements are in the upper triangle: Write a JAVA program to find whether a given matrix is an upper triangular matrix or not.
Input Format:

The input consists of (n*n+1) integers. The first integer corresponds to the number of rows/columns in the matrix. The remaining integers correspond to the elements in the matrix. The elements are read in rowwise order, first row first, then second row and so on. Assume that the maximum value of m and n is 5.

 Output Format:

Print "yes" if it is an upper triangular matrix . Print "no" if it is not an upper triangular matrix.
 
Sample Input 1:
2
1 2
0 3
Sample Output 1:
yes
 */
import java.util.*;
public class is_upp_trng_mat {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int flag = 0;
        int mat[][] = new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                mat[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i>j)
                {
                    if(mat[i][j]==0)
                    flag =1;
                }
            }
        }
        if(flag==1)
        System.out.println("Yes");
        else
        System.out.println("No");
    }
}
