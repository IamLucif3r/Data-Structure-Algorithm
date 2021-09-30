import java.util.*;
class event{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        double be = sc.nextDouble();
        double te = sc.nextDouble();
        double fe = sc.nextDouble();
        double le = sc.nextDouble();
        double total = be+te+fe+le;
        float bp = (float)(be/total)*100;
        float tp = (float)(te/total)*100;
        float fp = (float)(fe/total)*100;
        float lp = (float)(le/total)*100;
        System.out.println("Total expenses : Rs."+total);
        System.out.printf("Branding expenses percentage :"+bp+"%");
        System.out.printf("Travel expenses percentage :"+tp+"%");
        System.out.printf("Food expenses percentage :"+fp+"%");
        System.out.printf("Logistics expenses percentage :"+lp+"%");
        
    }
}