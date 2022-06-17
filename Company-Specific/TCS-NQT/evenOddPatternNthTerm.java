import java.util.*;
public class evenOddPatternNthTerm {
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        if(n == 1|| n==2)
        System.out.println("0");
        else{
            if(n%2==1) // Even position
            {
                int a= 0,d=2;
                int t_s1 = (n+1)/2;
                int n_term = a+(t_s1-1)*d;
                System.out.println(n_term);
            }   
            else{
                int a= 0,d=1;
                int t_s1 = (n)/2;
                int n_term = a+(t_s1-1)*d;
                System.out.println(n_term);;
            }             
        }
       
    }
}
