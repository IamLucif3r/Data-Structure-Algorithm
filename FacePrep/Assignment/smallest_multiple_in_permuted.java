import java.util.*;
public class smallest_multiple_in_permuted
{
        static int least_multiple = -1;
static int flag = -1;
static int permute(int a[], int n, int d, int order[], int used[], int index, int least_multiple)
{
      int i;
    if(index == n)
    {
        int number = 0;
        for(i=0; i<n; i++)
        {
            number = number * 10 + a[order[i]];
        }
        if(number % d == 0)
        {
            least_multiple = number;
            System.out.print(least_multiple);
            flag = 1;
            return flag;
        }
        return flag;
    }
    for(i=0; i<n; i++)
    {
        if(used[i] == 1)
        {
            continue;
        }
        used[i] = 1;
        order[index] = i;
        if(1 == permute(a, n, d, order, used, index + 1, least_multiple))
        {
            return 1;
        }
        used[i] = 0;
    }
    return 0;
}
    static int get_least_permuted_multiple(int [] a, int n, int d)
    {
        int[] order = new int[15];
        int[] used = new int[15];
        int isSuccess = permute(a, n, d, order, used, 0, -1);
        if(isSuccess == 0)
        {
            System.out.print(flag);
            return 0;
        }
        return least_multiple;
    }
    public static void main(String[] args)
    {
        int N,d;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        d = sc.nextInt();
        int digits_cnt = 0;
        int temp = N;
        int[] digit_arr = new int[15];
        while(temp!=0)
        {
            digit_arr[digits_cnt] = temp%10;
            digits_cnt++;
            temp = temp/10;
        }
        for (int i = 0; i < digits_cnt; i++)
        {
            for (int j = i + 1; j < digits_cnt; j++) {
                if (digit_arr[i] > digit_arr[j])
                {
                    temp = digit_arr[i];
                    digit_arr[i] = digit_arr[j];
                    digit_arr[j] = temp;
                }
            }
        }
        int least_multiple_permuted = get_least_permuted_multiple(digit_arr, digits_cnt, d);
    }
    }

