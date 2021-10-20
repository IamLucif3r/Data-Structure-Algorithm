
import java.util.*;
public class pappu {
  public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int t =in.nextInt();
      int arr[]= new int[t]; 
      for(int i=0;i<t;i++)
      {

        int n=in.nextInt();
        int r = (n/10)*10+9;
        arr[i]=(r-n);
      }
      System.out.println(Arrays.toString(arr));
  }  
}