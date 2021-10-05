import java.util.*;
public class switchstatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        char c = 'b';
        switch (x) {
           /* case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
        */
       //Example 2:
        case 'a':
        System.out.println("A");
        break;
        case 'b':
        System.out.println("B");
        break;
        case 'c':
        System.out.println("C");
            default:
                System.out.println("None");
                break;
        }
    }
}
