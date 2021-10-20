/* Remove balls

A box contains a number of balls that can only be removed 1 at a time or 3 at a time. How many ways can 
the box be emptied? The answer can be very large so return it as modulo of 10^9+7.

For example, there are n=7 balls initially .They can be removed nine ways, as follows:

1.(1,1,1,1,1,1,1)
2.(1.1.1.1.3)
3.(1,1,1,3,1)
4.(1,1,3,1,1)
5.(1,3,1,1,1)
6.(3,1,1,1,1)
7.(1,3,3)
8.(3,1,3)
9.(3,3,1)
Input Format:
Single line represents the no of balls in the box.
Output Format:
The number of ways of removing the balls modulo 10^9+7
Constraints
1<=n<=10^9
Sample test Case :
Input:
1
Output:
1
Explanation:
1
There is only 1 way to move 1 ball. Answer=(1%1000000007)=1

Case 2
Input (stdin)
3
Output (stdout)
2
*/
import java.util.*;
public class remove_balls {
    public static int fun(int n)
    {
        if(n==1||n==2)
            return 1;
        if(n==3)
            return 2;
        return fun(n-3)+fun(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(fun(x));
    }
}
