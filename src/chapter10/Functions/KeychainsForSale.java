package chapter10.Functions;
/*
Write a program that pulls up a menu with 4 options.

You will need to create functions for each of the 4 menu options.
Entering the number will call the correct function.

This assignment does not require you to complete ANY of the functionality except for the working menu system.
There is no need for you to program the ability to add keychains, remove keychains, view orders or checkout.

The functions should be named add_keychains(), remove_keychains(), view_order() and checkout().

Each function should print a message that it has been called.

The user should be able to keep putting in choices until the checkout() function is called.
When checkout() is finished, the program should end.
 */
import java.util.Scanner;

public class KeychainsForSale
{
    public static void main(String[] args)
    {
        System.out.print("Ye Olde Keychain Shoppe\n");
        System.out.print("" +
                "\n1. Add Keychains to Order\n" +
                "2. Remove Keychains from Order\n" +
                "3. View Current Order\n" +
                "4. Checkout\n");

        Scanner keyboard = new Scanner(System.in);
        System.out.print("\nPlease enter your choice:");
        int enterChoice = keyboard.nextInt();

        for (int i = 0; i <= enterChoice; i++)
        {
            if (enterChoice == 1)
            {
                add_keychains();
            }
            if (enterChoice == 2)
            {
                remove_keychains();
            }
            if (enterChoice == 3)
            {
                view_order();
            }
            if (enterChoice  == 4)
            {
                checkout();
                break;
            }

            System.out.print("" +
                    "\n1. Add Keychains to Order\n" +
                    "2. Remove Keychains from Order\n" +
                    "3. View Current Order\n" +
                    "4. Checkout\n");

            System.out.print("\nPlease enter your choice:");
            enterChoice = keyboard.nextInt();
        }
    }

    public static void add_keychains()
    {
        System.out.print("\nADD KEYCHAINS\n");
    }

    public static void remove_keychains()
    {
       System.out.print("\nREMOVE KEYS\n");
    }

    public static void view_order()
    {
        System.out.print("\nVIEW ORDER\n");
    }

    public static void checkout()
    {
        System.out.print("\nCHECKOUT\n");
    }
}
