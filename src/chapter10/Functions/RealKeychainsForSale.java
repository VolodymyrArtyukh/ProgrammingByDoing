package chapter10.Functions;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.Scanner;

/*

You will need 2 new variables in main, one to store the current number of keychains,
and one to store the price per keychain.

The price should be $10 per keychain.

add_keychains() will need to be passed one int, and have a return type of int.
It will ask the user for the number of keychains to add to the order, and then return the new number of keychains.

remove_keychains() will need to be passed one int, and have a return type of int.
It will ask the user for the number of keychains to remove from the order, and then return the new number of keychains.

view_order() will need to be passed two ints, and have a return type of void.
It will display, on three different lines, the number of keychains in the order, the price per keychain,
and the total cost of the order.

checkout() will need to be passed two ints, and have a return type of void.
It will ask the user for his/her name in order to deliver them correctly, display the order information,
and then thank the user, by name, for ordering.
 */
public class RealKeychainsForSale
{
        public static void main(String[] args)
        {
            int keychains = 0;
            int keychainPrice = 10;

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
                    keychains = add_keychains(keychains);
                }
                if (enterChoice == 2)
                {
                   keychains = remove_keychains(keychains);
                }
                if (enterChoice == 3)
                {
                   view_order(keychains);
                }
                if (enterChoice  == 4)
                {
                    System.out.print("\nCHECKOUT");
                    System.out.print("\nWhat is your name?");
                    String name = keyboard.next();
                    view_order(keychains);
                    System.out.print("\nThanks for your order, " + name);
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

        public static int add_keychains(int keychain)
        {
            Scanner keyboard = new Scanner(System.in);

            System.out.print("\nYou have " + keychain + " keychains.");
            System.out.print(" How many to add? " );
            int addedKeychains = keyboard.nextInt();

            keychain = keychain + addedKeychains;

            System.out.print("You now have " + addedKeychains + " keychains\n");

            return keychain;
        }

        public static int remove_keychains(int keychain)
        {
            Scanner keyboard = new Scanner(System.in);

            System.out.print("\nYou have " + keychain + " keychains.");
            System.out.print(" How many to remove? " );
            int removedKeychains = keyboard.nextInt();
            int remain = keychain - removedKeychains;
            System.out.println("You now have "+remain+" keychains.");
            return remain;
        }

        public static int view_order(int keychain)
        {
            System.out.println("You now have "+keychain+" keychains.");
            System.out.println("Keychains cost $10 each.");
            int keychainPrice = keychain*10;
            System.out.println("Total cost is $"+keychainPrice+".");
            return keychainPrice;
        }
}