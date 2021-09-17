package com.helloworldapackage;

public class try_catch {
    public static void main(String args[])
    {
        // Try - Catch in Exception Handling
        int[] marks = {92,93,94};
        System.out.println(marks[2]);
        try{
            System.out.println(marks[5]);;
        }
        catch (Exception exception)
        {
            System.out.println(marks[6]);
        }
    }
}
