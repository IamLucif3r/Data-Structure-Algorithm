/**Problem
Let us call an integer interesting if the product of its digits is divisible by the sum of its digits. You are given two integers A and B. Find the number of interesting integers between A and B (both inclusive).

Input
The first line of the input gives the number of test cases, T. T lines follow.

Each line represents a test case and contains two integers: A and B.

Output
For each test case, output one line containing Case #x: y, where x is the test case number (starting from 1) and y is the number of interesting integers between A and B (inclusive).

Limits
Time limit: 20 seconds.
Memory limit: 1 GB.
1≤T≤100.
Test Set 1
1≤A≤B≤105.
Test Set 2
1≤A≤B≤1012.
 * 
 */
import java.util.*;
public class interesting_digits {
    public static boolean isInteresting(int a,int b)
    {
        if(a%b==0)
            return true;

        return false;
    }
    public static int calSum(int x)
    {
        int digit = 0;
        int sum = 0;
        while(x>0)
        {
            digit = x%10;
            sum+=digit;
            x = x/10;
        }
        return sum;
    }
    public static int calPro(int n)
    {
        int product = 1;
 
        while (n != 0) {
            product = product * (n % 10);
            n = n / 10;
        }
 
        return product;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int ans[] = new int[t];

        for(int i=0;i<t;i++)
        {
            int count =0;
            int a = sc.nextInt();
            int b = sc.nextInt();
    
            for(int j=a;j<=b;j++)
            {
                String A = String.valueOf(j);   
                if(A.length()==1)
                count++;
                else if(isInteresting(calPro(a), calSum(b)))
                count++;
            }
            ans[i] = count;
        }
        for(int i=0;i<ans.length;i++)
        {
            System.out.println("Case #"+(i+1)+": "+ans[i]);
        }

    }
}
