//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
package com.assign;
import java.util.Scanner;

public class SInterest {
    public static void main(String[] args)
    {
    System.out.println("Program to calculate Simple Interest\n");
    Scanner in = new Scanner(System.in);

    System.out.println("Principal amount: ");
    float amt = in.nextFloat();

    System.out.println("Time period in months: ");
    int months = in.nextInt();

    System.out.println("Rate of Interest: ");
    float rate = in.nextFloat();

    float si =( amt*months*rate)/100;

    System.out.println("The Simple interest for the amount " + amt + " over the period of " + months + " with a rate of interest of " + rate + " is " + si);

}
}
