import java.util.*;
public class printHello {
    static void printHello(int n){
        if(n==0)
        return ;
        System.out.println("Hello World !");
        printHello(n-1);
    }
    public static void main(String args[])
    {
        printHello(10);
    }
}
