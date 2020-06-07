package chapter6;

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
