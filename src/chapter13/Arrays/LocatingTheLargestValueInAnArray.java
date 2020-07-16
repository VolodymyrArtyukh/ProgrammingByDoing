package chapter13.Arrays;
/*
Write a program that creates an array which can hold ten values.
Fill the array with random numbers from 1 to 100.
Display the values in the array on the screen.
Then use a linear search to find the largest value in the array, and display that value and its slot number
 */
import java.util.Random;

public class LocatingTheLargestValueInAnArray
{
    public static void main(String[] args)
    {
        Random random = new Random();
        int[] myArray = new int[10];
        int max = 0;
        int slot = 0;

        System.out.print("Array: ");
        for (int i = 0; i < myArray.length; i++)
        {
            myArray[i] = 1 + random.nextInt(100);
            System.out.print(myArray[i] + "  ");
        }

        for (int j = 0; j < myArray.length - 1; j++)
        {
            if (max < myArray[j])
            {
                max = myArray[j];
                slot = j;
            }
        }
        System.out.print("\nThe largest values is " + max);
        System.out.print("\nIt is in slot " + slot);

    }
}
