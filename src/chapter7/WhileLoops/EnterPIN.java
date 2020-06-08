package chapter7.WhileLoops;

/*
Type in the following code, and get it to compile.
This assignment will help you learn how to make a loop, so that you can repeat a section of code over and over again!
 */
import java.util.Scanner;

public class EnterPIN
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int pin = 12345;

        System.out.println("WELCOME TO THE BANK OF MITCHELL.");
        System.out.print("ENTER YOUR PIN: ");
        int entry = keyboard.nextInt();

        while ( entry != pin )
        {
            System.out.println("\nINCORRECT PIN. TRY AGAIN.");
            System.out.print("ENTER YOUR PIN: ");
             entry = keyboard.nextInt();
        }

        System.out.println("\nPIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");
    }

}
