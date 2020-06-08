package chapter7.WhileLoops;
/*
Write a program that gets several integers from the user.
Sum up all the integers they give you.
Stop looping when they enter a 0.
Display the total at the end.

You must use a while loop.
 */

import java.util.Scanner;

public class LoopValues
{
    public static void main(String[] args)
    {
        int userInput = 0;
        int total = 0;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("I will add up the numbers you give me.\n");
        System.out.print("Number: ");
        userInput = keyboard.nextInt();

        while (userInput != 0)
        {
            total = userInput+total;

            System.out.print("The total is so far: " + total);
            System.out.print("\nNumber: ");
            userInput = keyboard.nextInt();

        }

        System.out.print("The total is " + total );

    }
}
