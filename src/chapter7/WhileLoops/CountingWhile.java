package chapter7.WhileLoops;
/*
Type in the following code, and get it to compile.
This assignment shows you how we can abuse a while loop to make something repeat an exact number of times.
 */
import java.util.Scanner;

public class CountingWhile
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println( "Type in a message, and I'll display it five times." );
        System.out.print( "Message: " );
        String message = keyboard.nextLine();
        System.out.print("How many times?");
        //starts from 0
        int numberIteration = 0;
        int times = keyboard.nextInt();

        //will get to 100
        while ( numberIteration < times )
        {

            System.out.println( ((numberIteration+1)*10) + ". " + message );
            numberIteration ++;
        }
    }
}
