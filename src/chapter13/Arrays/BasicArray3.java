package chapter13.Arrays;
/*
Create an array that can hold 1000 integers.
Fill the array with random numbers in the range 10-99.
Then display the contents of the array on the screen. You must use a loop.

If you're careful to only pick random numbers from 10 to 99 and you put two spaces after each number,
then your output will line up like mine.
 */

import java.util.Random;

public class BasicArray3
{
    public static void main(String[] args)
    {
        Random random = new Random();

        int[] myArray = new int [1000];

        for (int i = 0; i < myArray.length; i++)
        {
            myArray[i] = 10 + random.nextInt(99);
            System.out.print(myArray[i] + "  ");
        }

    }
}
