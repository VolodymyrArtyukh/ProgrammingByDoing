package chapter13.Arrays;

import java.util.Random;
import java.util.Scanner;

public class IsItThereOrNot
{
    public static void main(String[] args)
    {
        Random random = new Random();
        Scanner keyboard = new Scanner(System.in);

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
                found = true;
        }

        if (found)
            System.out.println( valueToFind + " is in the array." );
        else
            System.out.println( valueToFind + " is not in the array." );


    }
}
