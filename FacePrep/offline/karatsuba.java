import java.util.*;
class karatsuba{
    static int karu(int x, int y) {
        if(x<10 && y<10)
            return x*y;
        
        else{
            int xlen = Integer.toString(x).length();
            int ylen = Integer.toString(y).length();   
            int n = (xlen>=ylen)?xlen:ylen;
            int halfN = n/2;
            int a = x/(int)Math.pow(10,halfN);
            int b = x%(int)Math.pow(10,halfN);
            int c = y/(int)Math.pow(10,halfN);
            int d = y%(int)Math.pow(10,halfN);

            int ac = karu(a, c);
            int bd = karu(b, d);
            int ad_plus_bc = karu(a+b, c+d)-ac-bd;
            return ac*(int)Math.pow(10, 2*halfN)+(ad_plus_bc)*(int)Math.pow(10, halfN)+bd;
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("Product of "+x+" & "+y+"is : "+karu(x,y));
        
    }
}