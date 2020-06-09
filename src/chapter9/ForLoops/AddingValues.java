package chapter9.ForLoops;

import java.util.Scanner;

public class AddingValues
{
    public static void main(String[] args)
    {
        int enteredNumber = 0;
        int sum = 0;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Number: ");
        enteredNumber = keyboard.nextInt();

        for (int number = 1; number <= enteredNumber; number++)
        {
           sum = enteredNumber + sum;

            System.out.print(" " + number);

        }
        System.out.println("\nThe sum is: " + sum);
    }
}
