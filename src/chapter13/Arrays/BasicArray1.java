package chapter13.Arrays;
/*
Create an array that can hold ten integers. Fill up each slot of the array with the number -113.
Then display the contents of the array on the screen.

This time, you must use a loop, to put the values in the array and also to display them.
Also, in the condition of your loop, you should not count up to a literal number.
Instead you should use the length field of your array.
 */
public class BasicArray1
{
    public static void main(String[] args)
    {
        int[] myArray = {-113,-113,-113,-113,-113,-113,-113,-113,-113,-113};

        for (int i = 0; i<myArray.length; i++)
        {
            System.out.println("Slot " + i +" contains a " + myArray[i]);
        }
    }
}
