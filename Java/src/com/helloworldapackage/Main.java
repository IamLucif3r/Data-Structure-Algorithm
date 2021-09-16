package com.helloworldapackage;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello World");
        System.out.println("THis was printed using SOUT+tab");
        byte age = 30;
        System.out.println(age);
      // [+] Primitive Types
        int phone = 1234567909; //Limit of Int Length
        long phone2 = 1234338734L; // Adding L in last tells Compiler that variable is Long
        float pi = 3.14F; // Similarily F for float
        char letters = '@';
        boolean isAdult = true;
        System.out.println(phone2);
        // Non-Primitive Types:
        String name = "Anmol";
        System.out.println(name.length());
        // New is used to define NPT.
        String name2 = new String("Anmol");
        System.out.println(name2);
        //Operations on Strings
        // Concatenation
        String n1 = "Anmol";
        String n2 = "Singh";
        String n3 = "Yadav";
        String name3 = n1+" "+n2+" "+n3;
        System.out.println(name3);
        //Char At
        System.out.println(name3.charAt(0)); // Java is 0 indexed base lang. i.e. 0 is the first index;
        System.out.println(name3.charAt(6));
        System.out.println(name3.charAt(12));
        // String length
        System.out.println(name3.length());
        // String: Replace Function: Used to replace characters
        //Strings in Java are immutable.
        String n4 = n1.replace('a','b');
        System.out.println(n4);
        // SubString Function
        // Also, we are not performing operations on actual string variable but returning a particular part.
        System.out.println(name3.substring(0,11)); // The Second Index passed here is not included. 4 tkk ki string chaiye toh 5 do
        // ARRAYS: Can be int, String, Char, Boolean etc
        int[] marks = new int[3];
        marks[0] = 92;
        marks[1] = 100;
        marks[2] = 80;
        // Now Print Marks
        System.out.println(marks[0]);// Access data using square bracckets
        // Functions of Array : length & Sort
        System.out.println(marks.length);// To Print the Length; No need of adding () after length
        // Sorting Array: Arrays is a class name (Every Class name has 1st ch uppercase;
        Arrays.sort(marks);
        System.out.println(marks[0]);
        // if elements are already known, don't use new:
        int[] marks2 = {92,79,99}; // Storing array values directly
        // 2D Array
        int[][] finalmMarks = {{97,98,95},{88,89,100} };
        System.out.println(finalmMarks[0][1]);
        // CASTING: Ek type se Doosre Type me Conversion: Can be Explicit or Implicit
        double price = 100.00;
        double finalPrice = price + 18;
        System.out.println(finalPrice);
        // But
        int p = 100;
        int finalPrices = p + (int)18.0;
        // Consants:
        float pi2 = 3.14F;
        // You can make a constant Final :
        final float PI = 3.14F;




    }
}
