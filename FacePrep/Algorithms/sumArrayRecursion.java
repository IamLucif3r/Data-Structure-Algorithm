import java.util.*;

public class sumArrayRecursion {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 1, 2, 3, 4, 5 };
        System.out.println(calcSum(arr, arr.length));
    }
    static int calcSum(int A[], int N)
    {
        if (N <= 0)
            return 0;
        return (calcSum(A, N - 1) + A[N - 1]);
    }
}
