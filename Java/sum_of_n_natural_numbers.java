import java.util.*;
public class sum_of_n_natural_numbers {
    public static int sumN(int n){
        int sum = n*(n+1)/2;
        return sum;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();
        int sum = sumN(r) - sumN(l-1);
        System.out.println(sum);
    }
}
