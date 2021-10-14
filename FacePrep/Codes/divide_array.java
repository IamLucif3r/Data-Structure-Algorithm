/* Divide Array
Given an array A of size N with Q operations, each operation contains an integer D. In each operation you 
have to divide all the elements of the array by D.
For example, for each operation with a given D, the new array A would be:
A[0] / D, A[1] / D, A[2] / D, ..... , A[N-1] / D
Finally, after processing all the operations you have to print the final array, after Q operations.
Note: The result of each division will be an integer.
Format:
Input:
The first line of input contains a single integer N, denoting the number of elements in an array A.
The next line of input contains N space-separated integers, denoting the elements of the array A. 
The next line contains the integer Q, denoting the number of operations. Next, Q lines contain a 
single integer D, which divides the elements of the array.
Output:
Print in the single line, which contains N space-separated integers after processing Q operations.

Constraints:
1 <= N <= 100000
1 <= A[i] <= 1000000
1 <= Q <= 100000
1 <= D <= 1000
Example:
Input:
5
50 20 18 27 19
3
2
3
2
Output:
4 1 1 2 1
Explanation:
In operation 1 after dividing the whole array by D=2, the resultant array will be: [25, 10, 9, 13, 9]. 
In operation 2 after dividing the array from operation 1 by 3, the resultant array will be: [8, 3, 3, 4, 3]. 
In operation 3 after dividing the array from operation 2 by 2, the resultant array will be: [4, 1, 1, 2, 1]. 
Hence, the resultant array will be [4, 1, 1, 2, 1].
Case 1
Case 2
Input (stdin)
5
50 20 18 27 19
3
2
3
2
Output (stdout)
4 1 1 2 1
*/
import java.util.*;
public class divide_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int q = sc.nextInt();
        int pr = 1;
        for(int i=0;i<q;i++)
        {
            int x = sc.nextInt();
            pr = pr*x;
        }
        for(int i=0;i<n;i++)
        {
            arr[i]=arr[i]/pr;
            System.out.println(arr[i]+" ");
        }
    }
}
