/*Mrs.Bhulbhul is a miser to the core. She saves money even on petite things. One day she heard a discount offer announced in a mall. She wants to purchase a lot of items to save her money. The discount is given only when at least two items are bought. Since each item has different discount prices, she finds it difficult to check the amount she has saved. So she approaches you to device an automated discount calculator to make her easy while billing.

INPUT FORMAT:
Input consists of two floating point values denoting price of item1 and item2.
The third input denotes the discount value in percentage.
OUTPUT FORMAT:
The output consists of three floating values denoting total amount, discounted price and amount saved.

SAMPLE INPUT: 
20.5
45.4
10 

SAMPLE OUTPUT: 
65.9
59.31
6.59 
*/
import java.util.*;
public class misners_discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float p1 = sc.nextFloat();
        float p2 = sc.nextFloat();
        float discount = sc.nextInt();
        float total = p1+p2;
        float disc = (total*(discount/100));
        System.out.println(total);
        System.out.println(total-disc);
        System.out.println(disc);
    }
}
