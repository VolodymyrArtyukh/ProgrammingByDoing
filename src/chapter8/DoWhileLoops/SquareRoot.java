package chapter8.DoWhileLoops;
/*
Write a program to take the square root of a number typed in by the user.
Your program should use a loop to ensure that the number they typed in is positive.
If the number is negative, you should print out some sort of warning and make them type it in again.

Note that it is possible to do this program with either a while loop or a do-while loop.
(Though personally, I think this one is easier with a while loop.)

You can get the square root of a number n with Math.sqrt(n).
Make sure you don't do this until the loop is done and you know for sure you've got a positive number.
 */

import java.util.Scanner;

public class SquareRoot
{
    public static void main(String[] args)
    {
        double enteredNumber;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("SQUARE ROOT!\n");
        System.out.print("Enter a number: ");
        enteredNumber = keyboard.nextDouble();


        while (enteredNumber < 0.0)
        {
            System.out.println("You can't take the square root of a negative number, silly.\n");

            System.out.print("Enter a number: ");
            enteredNumber = keyboard.nextDouble();
        }

        System.out.println("The square root of " + enteredNumber + " is " + Math.sqrt(enteredNumber));

    }

}
