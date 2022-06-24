import java.util.*;
public class uniqueDigits {
     public static boolean isUniqueNumber(int number)   
     {  
         int digits = countDigits(number);  
         int[] arr = new int[digits];  
         for(int i=0; i<digits; i++)   
         {  
                 arr[i] = (int)number%10;  
                 number = number/10;  
        }  
        for(int i=0; i<digits; i++)   
            {  
             for(int j=0; j<digits; j++)   
                    {  
                        if(i!=j && arr[i]==arr[j])  
                        return false;  
                    }
                }  
            return true;  
        }  
    public static int countDigits(int number)   
    {  
        int count = 0;  
        while(number != 0)   
        {  
        count++;  
        number= number/10;  
    }  
    return count;  
    }  
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int lb = sc.nextInt();
        int ub = sc.nextInt();
        int count =0;
        for(int i=lb;i<=ub;i++)
        {
            if(isUniqueNumber(i))
            count++;
        }
        System.out.println(count);
    }
}
