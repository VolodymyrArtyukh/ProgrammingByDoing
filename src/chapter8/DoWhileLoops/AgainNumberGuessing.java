package chapter8.DoWhileLoops;

/*
Redo the Number-Guessing with a Counter assignment using a do-while loop instead of a while loop.
Otherwise it should do exactly the same things (including the counter).

Make sure that it doesn't mess up if you guess it on the first try.
 */

import java.util.Scanner;

public class AgainNumberGuessing
{
    public static void main(String[] args)
    {
        int myGuess;
        int chosenNumber = 6;
        int numberOfTries = 0;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("I have chosen a number between 1 and 10. Try to guess it.");
        System.out.print("\nYour guess: ");
        myGuess = keyboard.nextInt();
        numberOfTries++;

        do
        {
            System.out.print("That is incorrect. Guess again.\n ");
            System.out.print("\nYour guess: ");
            myGuess = keyboard.nextInt();
            numberOfTries++;
        }
        while (myGuess != chosenNumber);

        System.out.print("That's right! You're a good guesser.");
        System.out.print("\nYou've used that many: " + numberOfTries + " tries");
    }
}
