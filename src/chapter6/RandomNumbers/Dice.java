package chapter6.RandomNumbers;
/*
Write a program that simulates a dice roll by picking a random number from 1-6 and then picking a second random number from 1-6.
Add the two values together, and display the total.
 */
import java.util.Random;

public class Dice
{
    public static void main (String[] args)
    {
        Random randomNumber = new Random();
        int myRandomNumber_1 = 1 + randomNumber.nextInt(6);
        int myRandomNumber_2 = 1 + randomNumber.nextInt(6);
        int total;

        System.out.print("HERE COMES THE DICE!\n");

        System.out.print("\nRoll #1: " + myRandomNumber_1);
        System.out.print("\nRoll #2: " + myRandomNumber_2);

        total = myRandomNumber_1 + myRandomNumber_2;

        System.out.print("\nThe total is " + total + "!");
    }
}
