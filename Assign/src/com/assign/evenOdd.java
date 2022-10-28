//1. //Write a program to print whether a number is even or odd, also take input from the user.
package com.assign;
import java.util.Scanner;

public class evenOdd {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        if (a % 2 == 0) //if divisible 2 then the number is an even number
        {
            System.out.println(a + " is an even number"); //concatenation is performed to provide better output
        } else {
            System.out.println(a + " is an odd number");
        }

    }

}