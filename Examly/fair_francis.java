import java.util.*;
class fair_francis{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int a[] = new int[x];
        for(int i=0;i<x;i++)
        {
            a[i] = sc.nextInt();
        }
        int delete=0,move=0;
        for(int i=0;i<x;i++)
        {
            if(a[i]>x)
                delete++;
            else if(a[i]<x)
                move++;
            else if(a[i]==x)
                continue;
        }
        System.out.print(delete+" "+move);
    }
}