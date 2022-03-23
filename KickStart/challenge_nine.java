/*Problem 
Ada gives John a positive integer N. She challenges him to construct a new number (without leading zeros),that is a multiple of 9, by inserting exactly one digit (0 … 9) anywhere in the given number N. It is guaranteed that N does not have any leading zeros.

As John prefers smaller numbers, he wants to construct the smallest such number possible. Can you help John?

Input
The first line of the input gives the number of test cases, T. T test cases follow.

Each test case has a single line containing a positive integer N: the number Ada gives John.

Output
For each test case, output one line containing Case #x: y, where x is the test case number (starting from 1) and y is the new number constructed by John. As mentioned earlier, y cannot have leading zeros.

Limits
Memory limit: 1 GB.
1≤T≤100.

*/
import java.util.*;
public class challenge_nine {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int z=0;z<t;z++)
        {
            int n =sc.nextInt();
            String s = String.valueOf(n);
            int dSum = 0;
            for(int i=0;i<s.length();i++)
            {
                dSum = dSum+s.charAt(i)-'0';
            }       
            int flag = 0;
            System.out.print("Case #"+(z+1)+":");
            for(int i=0;i<s.length();i++)
            {
                if((n%10)>(9-dSum))
                {
                    System.out.print(9-dSum);
                    flag = 1;

                }
                if(dSum%9!=0)
                {
                    System.out.print(s.charAt(i));
                }  
            }
            if(flag ==0)
            {
                System.out.print(9-dSum+"\n");
            }
            
        }
    }
}
