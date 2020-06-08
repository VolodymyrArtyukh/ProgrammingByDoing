package chapter6.RandomNumbers;
/*
Write a program that picks a random number from 1-100.
Give the user a chance to guess it. If they get it right, tell them so.
If their guess is higher than the number, say "Too high."
If their guess is lower than the number, say "Too low."
Then quit. (They don't get any more guesses for now.)
 */
import java.util.Random;
import java.util.Scanner;

public class OneShot
{
    public static void main(String[] args)
    {
        int myGuess;

        Random randomNumber = new  Random();
        int myRandomNumber = 1 + randomNumber.nextInt(100);

        Scanner keyboard = new Scanner(System.in);

        System.out.print("I'm thinking of a number between 1-100.  Try to guess it." +
                "\n> ");
        myGuess = keyboard.nextInt();

        if (myRandomNumber <= 50)
        {
            System.out.print("Sorry, you are too high. I was thinking of " + myRandomNumber);
        }
        else if (myRandomNumber > 51)
        {
            System.out.println("Sorry, you are too low. I was thinking of " + myRandomNumber);

        }
        else if (myGuess == myRandomNumber)
        {
            System.out.println("You guessed it!  What are the odds?!?");
        }


    }
}
