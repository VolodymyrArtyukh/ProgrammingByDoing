package chapter5.If_Else;
/*
Type in the following code, and get it to compile. Run it, and see what it does.

 */
import javax.swing.*;

public class Swing {
    public static void main(String[] args)
    {
    String name = JOptionPane.showInputDialog("What is your name?");

    String input = JOptionPane.showInputDialog("How old are you?");
    int age = Integer.parseInt(input);
    System.out.print(name);
    System.out.print(age + 1);

    }
}
