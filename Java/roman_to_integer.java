import java.util.*;
public class roman_to_integer {
    public static int romanToint(String s)
    {
        int num = 0;
        int len = s.length();
        int last = 0,n=0;
        //Starting from the smallest value:
        for(int i=len-1;i>=0;i--)
        {
            char c = s.charAt(i);
            switch(c){
                case 'I':
                n = 1; break;
                case 'V':
                n = 5; break;
                case 'X':
                n = 10; break;
                case 'L':
                n = 50; break;
                case 'C':
                n = 100; break;
                case 'D':
                n = 500; break;
                case 'M':
                n = 1000; break;
                default:
                n = 0;
            }
            if(last>n)
            {
                num = num - n;
            }
            else 
                num = num+n;
            last = n;
            
        }   return num;   
        
        
    }
    public static void main(String[] args) {
        String roman = "IX";
        System.out.println(romanToint(roman));
    }
}
