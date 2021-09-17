import java.util.*;
public class bus_travel {
    public static void main(String args[])
    {
        Scanner in= new Scanner (System.in);
        int n= in.nextInt(),m=in.nextInt();
        int a[]=new int [n];
        int bus=0;//bus count
        int flag =-1; 
        System.out.println("Enter the values ");
        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
            if(flag!=-1 && (a[i]+flag<=m))
            {
                flag=-1;
                continue;
            }
            else if(flag!=-1){
                flag=-1;
            }
            if(a[i]==m)
            {
                bus++;
                continue;
            }
            else if(a[i]<m)
            {
                flag = a[i];
                bus++;
                continue;
            }

        }
        System.out.println("Bus value : "+bus);
    }

}