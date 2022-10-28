//to reverse the given number
import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = scan.nextInt();

        int ans = 0;

        while(a > 0)
        {
            int rem = a%10;
            a /= 10;

            ans = ans * 10 + rem;
        }
        System.out.println("The reverse is "+ans);
    }
}
