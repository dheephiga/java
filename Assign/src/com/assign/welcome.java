//Take name as input and print a greeting message for that particular name.
package com.assign;
import java.util.Scanner;
public class welcome {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String a = in.nextLine();
        System.out.println("Welcome "+ a);
    }
}
