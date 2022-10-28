package loop;
import java.util.Scanner;

public class loop {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Pleas enter the temperature: ");
        float n = input.nextFloat();
        float res = (n * 9/5 )+ 32;
        System.out.println(res);


    }
}
