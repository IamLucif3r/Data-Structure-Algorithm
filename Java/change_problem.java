// You are using Java
import java.util.*;
class main{
    public static void change(int n)
    {
        int sum=0;
        int note[] = new int[]{100,50,10,5,2,1};
        int[] noteCounter = new int[6];
        for(int i=0;i<6;i++)
        {
            if(n>note[i])
            {
                noteCounter[i] = n/note[i];
                n = n - noteCounter[i]*note[i];
            }
        }
        for(int i=0;i<6;i++)
        {
            if(noteCounter[i]!=0)
            {
                sum = sum+noteCounter[i];
            }
        }System.out.println(sum);
    }
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        change(N);
    }
    
}