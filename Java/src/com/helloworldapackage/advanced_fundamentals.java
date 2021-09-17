package com.helloworldapackage;

import java.util.Scanner;

public class advanced_fundamentals {
    public static void main(String args[])
    {
        int i =0;
        Scanner sc = new Scanner(System.in);
        while(true) // While true mtlb loop infinite Time chalega
        {
            i = sc.nextInt();
            System.out.println(i);

            if(i>5)
                break; //Break will break the loop once input is greater tha 5
            //Concept of Continue: Used to Skip current line
            if(i==3)
            {
                System.out.println("This is Not a Good Number, printed your num +1");
                i++;
                continue;
            }
        }
    }
}
