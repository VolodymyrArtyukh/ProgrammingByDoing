package chapter6;

import java.util.Random;
import java.util.Scanner;

public class ThreeCardMonte
{

    public static void main(String[] args)
    {
        int myGuess;
        Random randomNumber = new Random();
        int myRandomNumber = 1 + randomNumber.nextInt(3);

        Scanner keyboard = new Scanner(System.in);

        System.out.print("You slide up to Fast Eddie's card table and plop down your cash.\n" +
                "He glances at you out of the corner of his eye and starts shuffling.\n" +
                "He lays down three cards.");

        System.out.print("Which one is the ace?\n" +
                "\n" +
                "\t##  ##  ##\n" +
                "\t##  ##  ##\n" +
                "\t1   2   3");

        System.out.print("\n> ");
        myGuess = keyboard.nextInt();


            //1
            if (myGuess == myRandomNumber && myRandomNumber == 1)
            {
                System.out.print("You nailed it! Fast Eddie reluctantly hands over your winnings, scowling.\n" +
                        "\n" +
                        "\tAA  ##  ##\n" +
                        "\tAA  ##  ##\n" +
                        "\t1   2   3" +
                    "\n " + myRandomNumber);
            }

            else if (myGuess != myRandomNumber && myRandomNumber == 1)
            {
                System.out.print("Ha! Fast Eddie wins again! The ace was card number 1.\n" +
                        "\n" +
                        "\tAA  ##  ##\n" +
                        "\tAA  ##  ##\n" +
                        "\t1   2   3"+
                        "\n " + myRandomNumber);
            }

            else if (myGuess == myRandomNumber && myRandomNumber == 2)
            {
                System.out.print("You nailed it! Fast Eddie reluctantly hands over your winnings, scowling.\n" +
                    "\n" +
                    "\t##  AA  ##\n" +
                    "\t##  AA  ##\n" +
                    "\t1   2   3"+
                    "\n " + myRandomNumber);
            }

           else if (myGuess != myRandomNumber && myRandomNumber == 2)
            {
                System.out.print("Ha! Fast Eddie wins again! The ace was card number 2.\n" +
                    "\n" +
                    "\t##  AA  ##\n" +
                    "\t##  AA  ##\n" +
                    "\t1   2   3"+
                    "\n " + myRandomNumber);
            }

          else if (myGuess == myRandomNumber && myRandomNumber == 3)
            {
                System.out.print("You nailed it! Fast Eddie reluctantly hands over your winnings, scowling.\n" +
                    "\n" +
                    "\t##  ##  AA\n" +
                    "\t##  ##  AA\n" +
                    "\t1   2   3"+
                    "\n " + myRandomNumber);
            }

          else if (myGuess != myRandomNumber && myRandomNumber == 3)
            {
                System.out.print("Ha! Fast Eddie wins again! The ace was card number 3.\n" +
                    "\n" +
                    "\t##  ##  AA\n" +
                    "\t##  ##  AA\n" +
                    "\t1   2   3"+
                    "\n " + myRandomNumber);
            }
    }

}



