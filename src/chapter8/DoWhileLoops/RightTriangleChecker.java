package chapter8.DoWhileLoops;
/*
Write a program to allow the user to enter three integers.
You must use do-while or while loops to enforce that these integers are in ascending order, though duplicate numbers are allowed.
Tell the user whether or not these integers would represent the sides of a right triangle.
 */

import java.util.Scanner;

public class RightTriangleChecker
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        int side1, side2, side3;
        double triangle_test;

        System.out.println( "Enter three integers:" );
        System.out.print( "Side 1: " );
        side1 = keyboard.nextInt();

        do
        {
            System.out.print( "Side 2: " );
            side2 = keyboard.nextInt();

            if ( side1 > side2 )
                System.out.println( side2 + " is smaller than " + side1 + ". Try again." );
        } while ( side1 > side2);

        do
        {
            System.out.print( "Side 3: " );
            side3 = keyboard.nextInt();

            if ( side2 > side3 )
                System.out.println( side3 + " is smaller than " + side2 + ". Try again." );
        } while ( side2 > side3 );

        System.out.println( "Your three sides are " + side1 + " " + side2 + " " + side3 );

        triangle_test = Math.sqrt( (side1 * side1 ) + (side2 * side2) );

        if (triangle_test == side3 )
            System.out.println( "These sides *do* make a right triangle. Yippy-skippy!" );
        else
            System.out.println( "NO! These sides do not make a right triangle!" );
    }
}