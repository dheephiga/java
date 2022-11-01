package com.assign;
import javax.swing.JOptionPane;
public class input {
    public static void main(String[] args)
    {
     //  String input = JOptionPane.showInputDialog("Type something: ");
       int input = Integer.parseInt(JOptionPane.showInputDialog("Type a number: ")) + 1;
       System.out.println("This is the incremented value: "+ input);
    }
}
