/** Hollow Pyramid
Sample testcases

Input 1
4
Output 1

bbb*bbb
bb*i*bb
b*iii*b
*******
Input 2
5

Output 2

bbbb*bbbb
bbb*i*bbb
bb*iii*bb
b*iiiii*b
*********
 
*/
import java.io.*;
import java.util.*;
class hollow_pyrammid {
	public static void main(String [] args) {
	    int n,i,j,k;
	    Scanner sc = new Scanner(System.in);
	    n = sc.nextInt();
	    k=(2*n)-1;
	    for(i=n;i>0;i--)
	    {
	        for(j=1;j<=k;j++)
	        {
	            if((j==i)||(j==k-i+1)||(i==1)) { 
	            	System.out.print("*");
	            	}
	            else if((j<i)||(j>k-i)) { 
	            	System.out.print("b");
	            	}
	            else { 
	            	System.out.print("i");
	            	}
	        }
	        System.out.println();
	    }

	}
}