package chapter9.ForLoops;
/*
Write a program that gets three integers from the user.
Count from the first number to the second number in increments of the third number.
Use a for loop to do it.
 */


import java.util.Scanner;

public class CountingMachineRevisited
{
    public static void main(String[] args)
    {
        int countFrom, countTo, countBy;

        Scanner keyword = new Scanner(System.in);

        System.out.print("Count from: ");
        countFrom = keyword.nextInt();

        System.out.print("Count to: ");
        countTo = keyword.nextInt();

        System.out.print("Count by: ");
        countBy = keyword.nextInt();

        for (int numbers = countFrom; numbers <= countTo; numbers= numbers + countBy)
        {
            System.out.print(" " + numbers);
        }


    }
}
