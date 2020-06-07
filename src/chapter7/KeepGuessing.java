package chapter7;

import java.util.Scanner;

public class KeepGuessing
{
    public static void main(String[] args)
    {
        int myGuess;
        int chosenNumber = 6;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("I have chosen a number between 1 and 10. Try to guess it.");
        System.out.print("\nYour guess: ");
        myGuess = keyboard.nextInt();

        while (myGuess != chosenNumber)
        {
            System.out.print("That is incorrect. Guess again.\n ");
            System.out.print("\nYour guess: ");
            myGuess = keyboard.nextInt();
        }

        System.out.print("That's right! You're a good guesser.");


    }
}
