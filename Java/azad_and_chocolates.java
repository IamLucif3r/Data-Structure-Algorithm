/*  
Azad and Chocolates

Azad’s mother gave him Rs 100, so he decided to buy some chocolates. 
He went to a shop and that shop only has chocolates of Rs 3 and 7,
 so it now depends on Azad’s mood that how many chocolates he will buy. 
Maybe he will not buy single chocolate. Can you tell whether he has visited the same shop,
 from the remaining amount?
  If N (0 ≤ N ≤ 100) is equal to the possible remaining amount he has after he came from that shop,
   then print 1 or else 0.

Format:
Input:

The first line of the input contains a single integer T denoting the number of test cases.
 The first line of each test case contains N, denoting the remaining amount.

Output:
For each test case, the output is 0 or 1. 
Constraints: 
1 ≤ T ≤ 101 

0 ≤ N ≤ 100
Example:
Input: 
4
93
97
94
99
Output: 
1
1
1
0
Explanation:
100 - (0 * 3 + 1 * 7) = 93, so the output is 1.
100 - (1 * 3 + 0 * 7) = 97, so the output is 1.
100 - (2 * 3 + 0 * 7) = 94, so the output is 1.
It is not possible, so the output is 0.	
Case 1	
Case 2
Input (stdin)
4
93
97
94
99
Output (stdout)
1
1
1
0
*/
import java.util.*;
public class azad_and_chocolates {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            if(100-n<3){
                System.out.println(0);
            }else {
                System.out.println(1);
            }
        }
    }

}
