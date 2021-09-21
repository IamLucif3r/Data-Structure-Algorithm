import java.util.*;

public class marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int flag=1;
        int marks=0;
        while(true)
        {
            flag=sc.nextInt();
            if(flag==1)
            {
                System.out.println("Enter your Marks");
                marks = sc.nextInt();
                if(marks>=90)
                System.out.println("GOOD");
                else if(marks<=89 && marks >=60)
                System.out.println("ALSO GOOD");
                else if(marks<59 && marks >=0)
                System.out.println(" FAIL");
            }
           
            else if(flag==0)
           
            break;       
            
        }
        
       
    }
    
}
