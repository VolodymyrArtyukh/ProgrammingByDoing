package chapter6;

import java.util.Random;

public class Randomness
{
    public static void main(String[] args)
    {
        Random randomNumber = new Random();

        int myRandomNumber = 1 + randomNumber.nextInt(10);
        System.out.print("My random number is: " + myRandomNumber);

        System.out.println( "Here are some numbers from 1 to 5!" );
        System.out.print( 3 + randomNumber.nextInt(5) + " " );
        System.out.print(  randomNumber.nextInt(5) + " " );
        System.out.print(  randomNumber.nextInt(5) + " " );
        System.out.print(  randomNumber.nextInt(5) + " " );
        System.out.print(  randomNumber.nextInt(5) + " " );
        System.out.print(  randomNumber.nextInt(5) + " " );
        System.out.println();

        System.out.println( "Here are some numbers from 1 to 100!" );
        System.out.print(  randomNumber.nextInt(100) + "\t" );
        System.out.print(  randomNumber.nextInt(100) + "\t" );
        System.out.print(  randomNumber.nextInt(100) + "\t" );
        System.out.print(  randomNumber.nextInt(100) + "\t" );
        System.out.print(  randomNumber.nextInt(100) + "\t" );
        System.out.print(  randomNumber.nextInt(100) + "\t" );
        System.out.println();

        int num1 = 1 + randomNumber.nextInt(10);
        int num2 = 1 + randomNumber.nextInt(10);

        if ( num1 == num2 )
        {
            System.out.println( "The random numbers were the same! Weird." );
        }
        if ( num1 != num2 )
        {
            System.out.println( "The random numbers were different! Not too surprising, actually." );
        }
    }

}
