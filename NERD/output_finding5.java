// If you don't include default keyword in switch -- No Error in compiling, but 
// no output will be printed
// Continue cannot be used in Switch
import java.util.*;
public class output_finding5{
    public static void main(String[] args) {
        int x = 3;
        char c= 'b';
        switch(x)
        {
           default:
            System.out.println("Default at starting works");
            break;
        case 1:
        System.out.println("A");
        break;
        case 'b':
        System.out.println("B");
        break;
        case 'c':
        System.out.println("C");
        break; 
    }
}}