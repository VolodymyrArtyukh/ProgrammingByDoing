package chapter3.KeyboardInput;
/*
Ask the user for two words and two numbers,
and let the person at the keyboard type in some values,
but don't bother storing their responses into any variables.

Again, there is no need to create any variables, except for the Scanner variable typically named keyboard.
 */
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
