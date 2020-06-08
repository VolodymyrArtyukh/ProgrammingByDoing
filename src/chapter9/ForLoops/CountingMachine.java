package chapter9.ForLoops;
/*
Write a program that gets an integer from the user.
Count from 0 to that number. Use a for loop to do it.
 */

import java.util.Scanner;

public class CountingMachine
{
    public static void main(String[] args)
    {
        int message;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Count to: ");
        message = keyboard.nextInt();

        for (int numbers = 0; numbers <= message; numbers++)
        {
            System.out.print(" " + numbers);
        }
    }
}
