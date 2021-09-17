package com.helloworldapackage;

import java.util.Scanner;

public class mini_project {
    public static void main(String args[])
    {
        Scanner sc =  new Scanner(System.in);
        int myNumber = (int) (Math.random()*100);
        int userNum = 0;
        do {
            System.out.println("Guess My Number .... ");
            userNum = sc.nextInt();
            if(userNum==myNumber)
            {
                System.out.println("WooooHooooo ... Correct Number");
                break;
            }
            else if(userNum>myNumber)
            System.out.println("Your Number is Large");
            else
                System.out.println("Your Number is Small");

        }while(userNum>=0);
        System.out.println("My NUmber was: "+myNumber);

    }
}
