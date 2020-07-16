package chapter13.Arrays;
/*
Create an array that can hold ten integers, and fill each slot with a different random value from 1-50.
Display those values on the screen, and then prompt the user for an integer.
Search through the array, and if the item is present, say so.
It is not necessary to display anything if the value was not found.
If the item is in the array multiple times, it's okay if the program prints the message more than once.
 */

import java.util.Random;
import java.util.Scanner;

public class FindingValueInArray
{
    public static void main(String[] args)
    {
        int valueToFind;
        int[] myArray = new int[10];

        Random random = new Random();
        Scanner keyboard = new Scanner(System.in);



        System.out.print("Array: ");
        for (int i = 0; i < myArray.length; i++)
        {
            myArray[i] = 1 + random.nextInt(100);
            System.out.print(myArray[i] + " ");
        }

        System.out.print("\nValue to find: ");
        valueToFind = keyboard.nextInt();
        for (int i = 0; i < myArray.length; i++)
        {
            if (valueToFind == myArray[i])
            {
                System.out.print("\n" + valueToFind + " is in the array");
            }

        }

    }
}
