public class swap_nibble {
    public static void main(String[] args) {
        
        int a=100;
        System.out.println("Original Number : "+Integer.toBinaryString(a));
        int leftNibble=a&240;
        int rightNibble=a&15;
        System.out.println("Left Nibble : "+leftNibble+" : "+Integer.toBinaryString(leftNibble));
        System.out.println("Right Nibble : "+rightNibble+" : "+Integer.toBinaryString(rightNibble));
        leftNibble=leftNibble>>4;
        rightNibble=rightNibble<<4;
        System.out.println("After Nibble Swap : "+ (leftNibble|rightNibble));
    }
}
