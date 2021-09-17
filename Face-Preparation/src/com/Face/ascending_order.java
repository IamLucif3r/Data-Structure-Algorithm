package com.Face;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ascending_order {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int size;
        size = sc.nextInt();
        int[] marks =new int[size];
        for(int i=0;i<size;i++)
        {
            marks[i]=sc.nextInt();
        }
       // int[] sorted = new int[size];
        Arrays.sort(marks);
        for (int i=0;i<size;i++)
        {
            System.out.println(marks[i]);
        }
    }
}
