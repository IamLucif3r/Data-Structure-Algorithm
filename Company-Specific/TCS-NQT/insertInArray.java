import java.util.*;

import javax.net.ssl.SSLProtocolException;
public class insertInArray {
    public static int[] insertStart(int a[], int target)
    {
        int size = a.length+2;
        int b[] = new int[size];
        b[0] = target;
        for(int i=1;i<size;i++)
        b[i] = a[i];

        return b;

    }

    public static void Display(int a[])
    {
        System.out.println("Your Array:");
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }

    }
    public static void main(String arsg[])
    {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] =sc.nextInt();
        }
        int x = 1;
        while(x != 0) 
        {
            System.out.println("Choose 1:");
            System.out.println("1. Insert in Beginning");
            System.out.println("2. Insert in Ending");
            System.out.println("3. Insert at Position");
            System.out.println("4. Display Array");
            x  = sc.nextInt();
            int b[] = new int[n+1];
            switch (x){
                case 1:
                System.out.println("Enter an element to add in starting");
                int temp = sc.nextInt();
                b = insertStart(a,temp);
                break;    
                case 4:
                Display(b);
                break;
            }
            
        }
    }
}
