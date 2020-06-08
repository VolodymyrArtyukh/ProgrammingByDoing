package chapter3.KeyboardInput;
/*
Make a simple numeric calculator.
It should prompt the user for three numbers.
Then add the numbers together and divide by 2.
Display the result.
Your program must support numbers with decimals and not just integers.
 */
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
