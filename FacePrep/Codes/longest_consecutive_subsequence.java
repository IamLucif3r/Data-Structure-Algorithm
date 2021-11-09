/*Given an array of positive integers. Find the length of the longest sub-sequence such that elements in the subsequence are consecutive integers, the consecutive numbers can be in any order.

Constraints:
1 <= N <= 105
0 <= a[i] <= 105 
Example 1:
Input:
N = 7
a[] = {2,6,1,9,4,5,3}
Output:
6

Explanation:
The consecutive numbers here are 1, 2, 3, 4, 5, 6. These 6 numbers form the longest consecutive subsquence.

Example 2:
Input:
N = 7
a[] = {1,9,3,10,4,20,2}
Output:
4
Explanation:
1, 2, 3, 4 is the longest consecutive subsequence.
*/

import java.util.*;
class longest_consecutive_subsequence{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        int count1=1;
        for(int j=0;j<t;j++)
        {
            int n = sc.nextInt();
            int a[] = new int[n];
            
            for(int i=0;i<n;i++)
            {
                a[i]= sc.nextInt();
            }
            Arrays.sort(a);
            for(int i=0;i<a.length;i++)
            {
                if(a[i]!=a[i-1]){
                    if(a[i]==a[i-1]+1){
                        count1++;
                    }
                   
                }
            }
            System.out.println(count1-1);


        }
    }
}