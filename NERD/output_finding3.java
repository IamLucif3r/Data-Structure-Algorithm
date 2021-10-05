// We can have combination of Char & Integer in switch Cases
//Floating point values are not possible in switch cases.
// Expressions also work in Switch Cases
// Duplicate values should not exist in case 
import java.util.*;
public class output_finding3 {
    public static void main(String[] args) {
        int x = 3;
        char c= 'b';
        switch(x)
        {
        case 1:
        System.out.println("A");
        break;
        case 'b':
        System.out.println("B");
        break;
        case 'c':
        System.out.println("C");
        break;
        /*case 3:
        System.out.println("Duplicate case works??");
        break;*/
        case 1+2:
        System.out.println("Expression Working");
        break;
        default:
            System.out.println("None");
            break;
    }
    }}