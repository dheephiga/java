package dheep;
import java.util.Scanner;

public class add {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int res = num1 + num2;

        System.out.println("Sum = " + res);
    }
}
