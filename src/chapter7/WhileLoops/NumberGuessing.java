package chapter7.WhileLoops;

import java.util.Scanner;
/*
Modify your previous number-guessing game so that they can guess until they get it right
AND count the number of tries it takes them to guess it.
 */
public class NumberGuessing
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

        while (myGuess != chosenNumber)
        {
            System.out.print("That is incorrect. Guess again.\n ");
            System.out.print("\nYour guess: ");
            myGuess = keyboard.nextInt();
            numberOfTries++;
        }

        System.out.print("That's right! You're a good guesser.");
        System.out.print("\nYou've used that many: " + numberOfTries + " tries");
    }
}
