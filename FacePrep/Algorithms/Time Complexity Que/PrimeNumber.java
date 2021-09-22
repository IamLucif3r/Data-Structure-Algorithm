// Write a Program to check a number is prime or not with time complex: O(sqrt(n))
import java.io.*;
import java.util.Scanner;
public class PrimeNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int flag=0;
        int n=sc.nextInt();
        for(int i=0;i<n/2;i++)
        {
            if(n%i==0)
            {   System.out.println("Not a Prime");
                flag=1;
                break;
            } 
        }
        if(flag==0)
        System.out.println("Number is Prime");   
    }
}