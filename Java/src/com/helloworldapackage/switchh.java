package com.helloworldapackage;

import java.util.Scanner;

public class switchh {
    public static void main(String args[])
    {
        //Working of Switch;
        //int day= 1 ;// Let 1 = Monday, 2 = Tuesday ..
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("There are only 7 Days in a Week");
        }


    }
}
