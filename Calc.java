import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ans = 0;

        while(true) {
            System.out.print("Enter a operator: ");
            char op = scan.next().trim().charAt(0);

            if(op == '+' || op == '-' || op == '*' || op == '%' || op == '/')
            {
                //get two numbers
                System.out.print("Enter two numbers: ");
                int a = scan.nextInt();
                int b = scan.nextInt();

                if(op=='+') {
                    ans = a + b;
                }

                if(op == '-') {
                    ans = a - b;
                }

                if(op == '*') {
                    ans = a * b;
                }
                if(op == '/') {
                    ans = a / b;
                }

                if(op == '%') {
                    ans = a % b;
                }
                }
            else if(op == 'X' || op == 'x') {
                break;
            }
            else {
                System.out.println("Invalid Operation");
            }
            System.out.println("The answer is "+ans);
        }
    }
}
