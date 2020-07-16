package chapter13.Arrays;
/*

1.The first array only has three values in it. Add two more, for a total of five.
2. Create a second array of ints, and give it five starting values, too.
3. Print the second array.
 */
public class GivingAnArrayABunchOfValuesAtOnce
{
    public static void main( String[] args )
    {
        String[] arr1 = { "alpha", "bravo", "charlie", "delta", "echo" };
        int[] arr2 = {11, 23, 37, 41, 53};

        System.out.print("The first array is filled with the following values:\n\t");
        for ( int i=0; i<arr1.length; i++ )
            System.out.print( arr1[i] + " " );

        System.out.print("\n The second array is filled with the following values:\n\t");

        for (int j = 0; j < arr2.length; j++)
                System.out.print(arr2[j] + " ");

    }
}
