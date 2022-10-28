//to count the number of occurrences of a digit in a number
import java.util.Scanner;

public class occurences {
    public static void main(String[] args) {
        System.out.println("Enter number: ");

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int count = 0;
        System.out.println("Check the digit: ");
        int b = scan.nextInt();

        while(a > 0)
        {
            int rem =a%10;
            if(rem == b)
            {
             count++;
            }
            a = a/10;
        }
        System.out.println(count);
    }
}