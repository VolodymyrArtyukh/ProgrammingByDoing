package chapter6.RandomNumbers;
/*
Modify your incredibly stupid number-guessing game to actually pick a random number from 1 to 10 and have the user try to guess that.
Tell them if they get it right or wrong, and if they get it wrong, show them what the random number was.
 */
import java.util.Random;
import java.util.Scanner;

public class GuessingGame
{
    public static void main(String[] args)
    {
        Random myRandomNumber = new Random();
        int myRandomChoice = 1 + myRandomNumber.nextInt(10);


        Scanner keyboard = new Scanner(System.in);
        System.out.println("I'm thinking of a number from 1 to 10.\n");

        System.out.print("Your guess: ");
        int numberSelected = keyboard.nextInt();

        if(numberSelected == myRandomChoice){
            System.out.print("That's right!  My secret number was " + myRandomChoice);
        }
        else System.out.println("Sorry, but I was really thinking of "+ myRandomChoice +'!');
    }
}
