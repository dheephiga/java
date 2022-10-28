//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
package com.assign;
import java.util.Scanner;

public class operator {
    public static void main(String[] args)
    {
        System.out.println("enter two numbers: ");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println("Operator: ");
        char opr = in.next().charAt(0);

        if(opr == '+')
        {
            System.out.println("The sum of the numbers is " + (a+b));
        }
        else if(opr == '-')
        {
            System.out.println("The difference of the numbers is " + (a-b));
        }
        else if(opr == '*')
        {
            System.out.println("The product of the numbers is " + (a*b));
        }
        else if(opr == '/')
        {
            System.out.println("The quotient of the numbers is " + (a/b));
        }

    }
}
