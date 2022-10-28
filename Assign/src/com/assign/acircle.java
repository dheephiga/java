package com.assign;
import java.util.Scanner;

public class acircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter radius of the circle: ");
        int rad = in.nextInt();

        double area = 3.14*rad*rad;
        System.out.println("The area of the circle is "+ area);

    }
}
