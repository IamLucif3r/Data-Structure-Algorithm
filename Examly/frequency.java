import java.util.*;
public class frequency {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String x = sc.nextLine();
        int count=0;
        for(int i=0;i<x.length();i++)
        {
            if(x.charAt(i)=='u')
                count++;
        }
        System.out.println("Freq of U : "+count);
    }
}
