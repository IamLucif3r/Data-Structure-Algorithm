/* Majority Element
Given an array A of N elements. Find the majority element in the array. A majority element in an array A of size N is an element that appears more than N/2 times in the array.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).
Constraints:
1 <= N <= 107
0 <= Ai <= 106

Example 1:
Input:
N = 3 
A[] = {1,2,3} 
Output:
-1
Explanation:
Since each element in {1,2,3} appears only once so there is no majority element.
Example 2:
Input:
N = 5 
A[] = {3,1,3,3,2} 
Output:
3
Explanation:
Since 3 is present more than N/2 times, so it is the majority element.

Case 1
Case 2
Input (stdin)
1
3
1 2 3
Output (stdout)
-1
 */

import java.util.*;
public class majority_wins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int count=0,flag=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[j]==a[i])
                    count++;
                    
                }
                if(count>n/2)
                    {System.out.println(a[i]);
                    flag=1;}              
        }    
    if(flag==0)
        System.out.println("-1");
}}
