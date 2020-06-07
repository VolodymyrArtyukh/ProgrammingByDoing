package chapter7;

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
