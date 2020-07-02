package chapter10.Functions;
/*
Write a program to calculate the multiples of a given number.
Have the user enter a number, and then use a for loop to display all the multiples of that number from 1 to 12.
It is not necessary to use a function.

You must use a for loop.
 */
import java.util.Scanner;

public class DisplayingSomeMultiples
{
    public static void main(String[] args)
    {
        int number;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Choose a number:");
        number = keyboard.nextInt();

        for (int i = 1; i <= 12; i++)
        {
            int total = number * i;
            System.out.println(number + "x" + i + " = " + total);
        }
    }
}
