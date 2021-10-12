/*Minimum Change Sequence
Given a number N, generate bit patterns from "0 to 2^N-1". 
Such that, successive patterns differ by one bit. 
Constraint:
1 <= N <= 16
Example 1:
Input:
2
Output: 
00 01 11 10
Explanation: 
00 and 01 differ by one bit.
01 and 11 differ by one bit.
11 and 10 also differ by one bit.
Example 2:
Input:
3
Output:
000 001 011 010 110 111 101 100
Explanation:
000 and 001 differ by one bit.
001 and 011 differ by one bit.
011 and 010 differ by one bit.
Similarly, every successive pattern differs by one bit.
Case 1
Case 2
*/
import java.util.*;
public class min_change_seq {
    static int binaryToGray(int n)
        {
            return n ^ (n >> 1);
        }


    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i = 0;i<=Math.pow(2,n)-1;i++) {
            int g = binaryToGray(i);
            String b = Integer.toBinaryString(g);
            if(b.length()< n) {
                while(b.length()!=n) b = "0"+b;
            }
        
            System.out.println(b);
        }
  

 

 

 

    
    }
}
