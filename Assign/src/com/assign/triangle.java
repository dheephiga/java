package com.assign;
import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter base and height of the triangle: ");

        float base = scan.nextFloat();
        float height = scan.nextFloat();

        float area = (float) ((0.5) * base * height);

        System.out.println("The area of the triangle with base "+base+ " and height "+height+" is "+area);
    }
}
