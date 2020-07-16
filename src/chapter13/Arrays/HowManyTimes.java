package chapter13.Arrays;
/*
Create an array that can hold ten integers, and fill each slot with a different random value from 1-50.
Display those values on the screen, and then prompt the user for an integer.
Search through the array, and count the number of times the item is found.
 */
import java.util.Random;
import java.util.Scanner;

public class HowManyTimes
{
    public static void main(String[] args)
    {
        Random random = new Random();
        Scanner keyboard = new Scanner(System.in);

        int foundTimes = 0;
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
            if (valueToFind == myArray[j])
            {
                foundTimes++;
            }
        }

        System.out.println(valueToFind + " was found " + foundTimes + " times.");
    }
}

