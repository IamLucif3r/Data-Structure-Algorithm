import java.util.*;
class main{
    public static int mooreAlgo(int a[], int n)
    {
        int count =0 ;
        int ele = 0;
        for(int num:a)
        {
            if(count==0)
                ele = num;
            if(num == ele)
                count++;
            else
                count--;
        }
        return ele;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
            a[i] = sc.nextInt();
        
        System.out.print(mooreAlgo(a,n));
    }
}