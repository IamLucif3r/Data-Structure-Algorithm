import java.io.*;
import java.util.*;
class fair_francis2 {
	public static void main(String [] args) {
		int n,i,j=0,k,l,m=0;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
	    int a[] = new int[n];
	    for(i=0;i<n;i++)
	    {
	        a[i] = sc.nextInt();
	        j=j+a[i]; 
	    }
	    k=j/n; //k = total/4
	    l=j-(k*n); // 
	    for(i=0;i<n;i++)
	    {
	        if(a[i]<k){
                a[i]=0;
            }
	        else{
                a[i]=a[i]-k;
            }
	        m=m+a[i];
	    }
	    m=m-l;
	    System.out.println(l+" "+m);

	}
}