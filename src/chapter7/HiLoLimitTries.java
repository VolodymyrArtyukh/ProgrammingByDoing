package chapter7;

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


