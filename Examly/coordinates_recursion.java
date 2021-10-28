/*Given coordinates of a source point (x1, y1), write a recursive method to determine if it is possible to reach the destination point (x2, y2). 

Note: From any point (x, y) there only two types of valid movements: (x, x + y) and (x + y, y).

Hence create a class named Reachable with the following method.
Input format
First line of the input contains the source point (x1, y1).﻿

Second line of the input contains the source point (x2, y2).

Output format
Output "True" (without quotes) if the given source point will reach the destination point. Print "False" (without quotes) otherwise.

Sample testcases
Input 1
2 10
26 12
Output 1
True
Input 2
20 10
6 12
Output 2
False

*/
import java.util.*;
public class coordinates_recursion {

    public static int isReachable(int x1, int y1, int x2, int y2) {
	    int x=0,y=0;
	    if((x1>x2)||(y1>y2))
	    {
	        return 0;
	    }
	    else if((x1==x2)&&(y1==y2))
	    {
	        return 1;
	    }
	    else if((x1<=x2)&&(y1<=y2))
	    {
	        x= isReachable(x1,y1+x1,x2,y2);
	        y= isReachable(x1+y1,y1,x2,y2);
	    }
	    if((x==1)||(y==1))
	    {
	    return 1;
	    }
	    return 0;
	}

    public static void main(String[] args) {
        int x1,y1,x2,y2,i;
		Scanner sc = new Scanner(System.in);
		x1 = sc.nextInt();
		y1 = sc.nextInt();
		x2 = sc.nextInt();
		y2 = sc.nextInt();
		i = isReachable(x1,y1,x2,y2);
		if(i == 1) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
    }
}
