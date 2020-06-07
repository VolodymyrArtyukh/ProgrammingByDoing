package chapter8;

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
