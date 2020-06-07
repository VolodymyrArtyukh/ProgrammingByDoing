package chapter3;

import java.util.Scanner;

public class ForgetfulMachine
{
    public static void main(String[] args)
    {
        String firstWord;
        String secondWord;
        int firstNumber;
        int secondNumber;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Give me a word");
        firstWord = keyboard.next();

        System.out.println("Give me a second word!");
        secondWord = keyboard.next();

        System.out.println("\nGreat, now your favorite number?");
        firstNumber = keyboard.nextInt();

        System.out.println("And your second-favorite number...");
        secondNumber = keyboard.nextInt();

        System.out.println("\nWhew!  Wasn't that fun?");




    }
}
