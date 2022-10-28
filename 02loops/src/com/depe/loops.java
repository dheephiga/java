package com.depe;

public class loops {
    public static void main(String[] args)
    {
        int n = 5;
        //for loop
        for (int i = 0; i <= n; i++)
            System.out.println(i);
        System.out.println();
        //while loop
        int j = 1;
        while(j<=8)
        {
            System.out.print(j + " ");
            j++;
        }

        System.out.println();
        //do while loop

        int num = 1;
        do{
            System.out.print(num+" ");
            num++;
        }while(num <=11);
    }
}
