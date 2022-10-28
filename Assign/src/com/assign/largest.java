//Take 2 numbers as input and print the largest number
package com.assign;
import java.util.Scanner;

public class largest {
    public static void main(String[] args)
    {
        System.out.println("Program to find largest of two");
        System.out.println("Enter two numbers: ");
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();

        if(a>b)
        {
            System.out.println(a + " is the largest number");
        }
        else
        {
            System.out.println(b + " is the largest number");
        }
    }
}
