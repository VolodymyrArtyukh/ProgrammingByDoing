package chapter7.WhileLoops;
/*
Modify your previous number-guessing game so that they can guess until they get it right.
That means it will keep looping as long as the guess is different from the secret number. Use a while loop.
 */
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
