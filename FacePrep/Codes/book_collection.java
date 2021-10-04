/*Book fair - Coupon Collection
It is the Annual Book Fair. There are thousands of book stalls and this year the organizers introduced a new scheme.
 In every stall either you can collect a coupon bearing a number but then you must skip next k stalls or you can simply go
to the next stall without collecting the coupon. At the end, your prize is free books worth the sum of the numbers on
 the coupon you have collected.
Input Format:
The first line has two positive integers, N (the number of stalls) and k (the number of stalls to skip if you collect a coupon).
The next N lines have 1 positive integer each, which is the value of the coupons you collect from the corresponding stall.
Output Format:
The output is one number that is the maximum value of the sum of coupons collected according to the rules. 
Constraints:
N<50 
Number on the coupon <1000
Sample Input:
10,2 
4 
5 
8 
7 
5 
4 
3 
4 
6 
5
Sample Output: 
19
Explanation 
N =10, k=2
The highest value is obtained if you pick the stall numbers 1,4,7,10, giving a value of 4+7+3+5=19.
Sample Input:
10,2
1.50
2.70 
3.40 
4.50 
5.90 
6.70 
7.60 
8.40 
9.70
10.50
Sample Output:
230
Explanation 
There are 10 stalls, and k=2. The coupon values are as shown. If you visit stalls 2, 5 and 8, you get a total value of 230, which is the maximum possible. The output is 230.
Input (stdin)
10,2 
4 
5 
8 
7 
5 
4 
3 
4 
6 
5
Output (stdout)
19
*/
import java.util.*;
public class book_collection {
    public static void main(String[] args) {
                
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++) {
             a[i] = sc.nextInt();
        }
        int max = a[0];
        int x = 0;
        while(x<n)
        {
            int sum = 0;
            for(int i = x; i < n; i=i+1+k)
            {
            sum = sum + a[i];
            }
            if(sum > max)
            max = sum;
            x++;
        }
        System.out.println(max);

    }
}
