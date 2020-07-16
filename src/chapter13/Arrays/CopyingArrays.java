package chapter13.Arrays;
/*
Write a program that creates an array of ten integers.
It should put ten random numbers from 1 to 100 in the array.
It should copy all the elements of that array into another array of the same size.
Then display the contents of both arrays. To get the output to look like mine, you'll need a several for loops.

Create an array of ten integers
Fill the array with ten random numbers (1-100)
Copy the array into another array of the same capacity
Change the last value in the first array to a -7
Display the contents of both arrays
 */
import java.util.Random;

public class CopyingArrays
{
    public static void main(String[] args)
    {
        int[] myArray1 = new int[10];
        int[] myArray2 = new int[10];

        Random random = new Random();

        System.out.print("Array1: ");
        for (int i = 0; i < myArray1.length; i++)
        {
            myArray1[i] = 1 + random.nextInt(100);
            System.out.print(myArray1[i] + " ");
        }

        myArray2 = myArray1;
        myArray1 [myArray1.length - 1] = 7;
        System.out.println();

        System.out.print("Array 2: ");
        for (int j = 0; j < myArray2.length; j++)
        {
            System.out.print(myArray2[j] + " ");
        }
    }
}

