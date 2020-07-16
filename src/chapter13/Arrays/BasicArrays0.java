package chapter13.Arrays;
/*
Create an array that can hold ten integers. Fill up each slot of the array with the number -113.
Then display the contents of the array on the screen.

Do not use a loop. Also, do not use any variable for the index;
you must use literal numbers to refer to each slot.
 */
public class BasicArrays0
{
    public static void main(String[] args)
    {
        int[] myArray = {-113, -113,-113, -113,-113, -113,-113, -113,-113, -113,};
        System.out.println("Slot 0 contains a " + myArray[0]);
        System.out.println("Slot 1 contains a " + myArray[1]);
        System.out.println("Slot 2 contains a " + myArray[2]);
        System.out.println("Slot 3 contains a " + myArray[3]);
        System.out.println("Slot 4 contains a " + myArray[4]);
        System.out.println("Slot 5 contains a " + myArray[5]);
        System.out.println("Slot 6 contains a " + myArray[6]);
        System.out.println("Slot 7 contains a " + myArray[7]);
        System.out.println("Slot 8 contains a " + myArray[8]);
        System.out.println("Slot 9 contains a " + myArray[9]);

    }
}
