import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        // fill your code
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int key1=1,k=1,key2=n*n+1;
      for(int i=n;i>=1;i--)
      {
        for (k = n; k > i; k--)   
        {
                System.out.print(" ");
        }
        for(int j=1;j<=i;j++)
        {
          System.out.print(key1+"*");
          key1++;
        }
        for (int j = 1; j <= i; j++)
            {
                System.out.print(key2);
                if (j < i)
                {
                    System.out.print("*");
                }
                key2++;
            }
        key2 = key2 - (i - 1) * 2 - 1;
        System.out.println();
      }
    }
}