// You are using Java
import java.util.*;
class gain_percentage{
public static void main(String args[])
{
    Scanner sc = new Scanner(System.in);
    int p = sc.nextInt();
    int rc = sc.nextInt();
    int sp = sc.nextInt();
    float gain = sp-(p+rc);
    float gp = (gain / p)*100;
    System.out.println(gp);
}}