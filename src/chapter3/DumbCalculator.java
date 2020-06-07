package chapter3;

import java.util.Scanner;

public class DumbCalculator
{
    public static void main(String[] args)
    {
        double firstNumber, secondNumber, thirdNumber, result;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("What is your first number? ");
        firstNumber = keyboard.nextDouble();

        System.out.print("What is your first second? ");
        secondNumber = keyboard.nextDouble();

        System.out.print("What is your first third? ");
        thirdNumber = keyboard.nextDouble();

        result = (firstNumber + secondNumber + thirdNumber) / 2;

        System.out.println("\n( " + firstNumber + " + " + secondNumber + " + " + thirdNumber + " )" + " / 2 is... " + result);


    }

}
