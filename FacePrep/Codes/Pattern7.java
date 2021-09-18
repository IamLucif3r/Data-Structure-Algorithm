/* Print X pattern of size entered for odd entries*/
import java.util.*;
public class Pattern7 {
public static void main(String args[])
{
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            if(i==j)
            {
                System.out.print("*");
            }
            if(i+j==n+1)
            {
                System.out.println("*");
            }
            else 
            System.out.print(" ");
        }
    } 
}
}
