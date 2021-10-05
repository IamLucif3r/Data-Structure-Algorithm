public class output_finding4 {
    public static void main(String[] args) {
        int x = 2;
        char c= 'b';
        switch(x)
        {
        case 1:
        System.out.println("A");
        break;
        case 2:
        System.out.println("TWO");
        //break; // we remove break;
        case 'c':
        System.out.println("C");
      //  break;
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
    }
}
