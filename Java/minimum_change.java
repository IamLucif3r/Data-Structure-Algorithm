import java.util.*;
public class minimum_change {
    static int count,one,two,five,ten,fifty,hundred;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(); //2200
        
       if(x>=100)
       {
        hundred = x/100;
        int a = x%100; // a=22
       }
       if(x>=50)
       {
            fifty = x/50;   
            int b = x%50;   
       }
       if(x>=10)
       {
            ten = x/10;   
            int c = x%10;
       }
       if(x>=5)
       {
            five = x/5;   
            int c = x%5;
       }
       if(x>=2)
       {
            two = x/2;   
            int c = x%2;
       }
       if(x>=1)
       {
            one = x;   
       }
        count = hundred+fifty+ten+five+two+one;
        System.out.println(count);
        
    }
}
