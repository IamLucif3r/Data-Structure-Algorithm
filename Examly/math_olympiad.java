/*The KISA Math Olympiad is held annually across all the Schools to identify and encourage the mathematical creativity of children of all grades. Samuel is a little genius in math of Grade 5 who was participating in the contest.

The question bank of the contest contains 35 questions and lasts for duration of 1 hour. Samuel was so confident of all the questions but he was seemed stuck at one question. He needs your help in answering that question so that he could score full marks and get a Gold medal in the event. The question that needs your assistance is as follows:

Write a recursive method to find the m-th summation of first n natural numbers. m-th summation of first n natural numbers is defined as following.

If m > 1

SUM(n, m) = SUM(SUM(n, m - 1), 1)

Else

SUM(n, 1) = Sum of first n natural numbers.

We are given m and n, we need to find SUM(n, m).
*/
import java.util.*;
public class math_olympiad {
    public static int summation(int n,int m) {
		if(m==0)
		    return n;
		    if(m!=0)
		    {
		        n=n*(1+n)/2;
		        n=summation(n,m-1);
		    }
		    return n;
	}
    public static void main(String[] args) {
        int n,m;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		int res = summation(n,m);
		System.out.println(res);
    }
}
