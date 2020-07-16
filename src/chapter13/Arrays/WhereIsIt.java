package chapter13.Arrays;
/*
Create an array that can hold ten integers, and fill each slot with a different random value from 1-50.
Display those values on the screen, and then prompt the user for an integer.
Search through the array, and if the item is present, give the slot number where it is located.
If the value is not in the array, display a single message saying so.
If the value is present more than once, you may either display the message as many times as necessary,
or display a single message giving the last slot number in which it appeared.
 */
import java.util.Random;
import java.util.Scanner;

public class WhereIsIt
{
    public static void main(String[] args)
    {
        Random random = new Random();
        Scanner keyboard = new Scanner(System.in);

        int slot = 0;
        boolean found = false;
        int[] myArray = new int[10];

        System.out.print("Array: ");
        for (int i = 0; i < myArray.length; i++)
        {
            myArray[i] = 1 + random.nextInt(50);
            System.out.print(myArray[i] + "  ");
        }

        System.out.print("\nValue to find: ");
        int valueToFind = keyboard.nextInt();
        System.out.println();

        for (int j = 0; j < myArray.length; j++)
        {
            if (valueToFind == myArray[j] && !found)
            {
                slot = j;
                found = true;
            }

        }
        System.out.println();
            if (found)
                System.out.println(valueToFind + " is in slot. " + slot);

            else
                System.out.println(valueToFind + " is not in the array.");
    }
}

