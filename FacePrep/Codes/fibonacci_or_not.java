    import java.util.*;

    public class fibonacci_or_not {
        public static void main(String[] args) {
            int n1=0,n2=1,i;    
            int n3=0;
            Scanner sc = new Scanner(System.in);
            int x =sc.nextInt();
            int count = x+1;      
            for(i=2;i<count;++i)
            {    
            n3=n1+n2;     
            n1=n2;    
            n2=n3;   
            }
            if(n3 == x ||n1 == x||n2 == x)
            {
                System.out.println("Yes");
            } 
            else
                System.out.println("No");
}}
    
    
