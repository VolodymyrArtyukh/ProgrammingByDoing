package chapter5;

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
