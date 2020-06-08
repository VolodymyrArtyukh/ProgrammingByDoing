package chapter7.WhileLoops;

/*
Write a program that picks a random number from 1-100.
The user keeps guessing as long as their guess is wrong, and they've guessed less than 7 times.
If their guess is higher than the number, say "Too high."
If their guess is lower than the number, say "Too low."
When they get it right, the game stops.
Or, if they hit seven guesses, the game stops even if they never got it right.
This means your while loop will have a compound condition using &&.
 */

import java.util.Random;
import java.util.Scanner;

public class HiLoLimitTries
{
    public static void main(String[] args)
    {
        Random random = new Random();
        int randomNumber = 1 + random.nextInt(10);
        int myGuess;
        int triesUsed;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("I'm thinking of a number between 1-100.  Try to guess it." +
                "\n> ");
        System.out.print("First guess: ");
        myGuess = keyboard.nextInt();
        triesUsed = 1;

        while (myGuess != randomNumber && triesUsed < 7)
        {
            randomNumber = 1 + random.nextInt(10);


            if (myGuess > randomNumber)
            {
                System.out.print("Sorry, that guess is too high. " + randomNumber + "\n");
            }
            else if (myGuess < randomNumber) {
                System.out.print("Sorry, you are too low. " + randomNumber + "\n");
            }
            triesUsed++;

            if (myGuess == randomNumber)
                break;

            System.out.print( "Guess #" + triesUsed + ":" );
            myGuess = keyboard.nextInt();
        }

        if (myGuess == randomNumber)
        {
            System.out.print("You guessed it!  What are the odds?!?\n " + randomNumber);
        }
        else if (myGuess >= 7)
        {
                System.out.print("Sorry, you didn't guess it in 7 tries.  You lose.\n" + randomNumber );
        }
    }
}


