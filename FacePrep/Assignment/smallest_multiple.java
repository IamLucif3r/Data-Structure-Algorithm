
    import java.util.Scanner;

    public class smallest_multiple {
        static final int INT_BITS = 32; 
    
    static int leftRotate(int n, int d) { 
        return (n << d) | (n >> (INT_BITS - d)); 
    } 

    static int rightRotate(int n, int d) { 
        return (n >> d) | (n << (INT_BITS - d)); 
    } 

    public static void main(String arg[])  
    { 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int d = sc.nextInt(); 
        System.out.println("Left Rotation of " + n + " by " + d + " is "); 
        System.out.println(leftRotate(n, d));       
        System.out.println("Right Rotation of " + n +" by " + d + " is "); 
        System.out.println(rightRotate(n, d)); 
    }
    }
