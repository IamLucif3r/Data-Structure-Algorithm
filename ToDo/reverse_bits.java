import java.util.*;
class reverse_bitsss{
    public static int reverseBits(int n)
    {
        int ans = 0;
        for(int i = 0; i < 32; i++){
            ans = ans << 1;
            if((n & 1) == 1)
                ans++;
            n = n >>> 1;
        }
        return ans;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(reverseBits(x));

    }
}