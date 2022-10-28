//Input currency in rupees and output in USD
package com.assign;
import java.util.Scanner;

public class inrtousd {
    public static void main(String[] args)
    {
        System.out.println("Program to convert INR to USD");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the amount in INR");

        float inr = in.nextFloat();
        float usd = inr*82;

        System.out.println(usd + " dollars is the USD value to " + inr +" rupees");
    }
}
