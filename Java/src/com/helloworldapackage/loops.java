package com.helloworldapackage;

import java.util.Scanner;

public class loops {
    public static void main(String args[])
    {
        // Loops
        // 1. For Loops: for(initialization ; conditional_Statement ; increment/decrement)
        System.out.println("For Loop:");
        for(int i=0;i<5;i++)
        {
            System.out.println(i);
        }
        //2. While Loop: while(condition)
        System.out.println("While Loop: ");
        int i=0;
        while(i<5)
        {
            System.out.println(i);
            i++;
        }
        // 3. Do While Loop:.
        System.out.println("Do-While Loop");
        int k=5;
        do{
            System.out.println(k);
            k--;
        }while(k>=0);
    // How to Take Inputs continuously:
        Scanner sc = new Scanner(System.in);
        int number=0;
        do{
            System.out.println("Enter a Positive Number ");
            number = sc.nextInt();
            System.out.println("Positive Number: "+number);
            System.out.println(number);

        }while (number>=0);
    }

}
