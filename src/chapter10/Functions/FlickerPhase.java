package chapter10.Functions;
/*
Finish the program provided. You'll need to write five if statements and some function calls.
If you do it right it should display a phrase in an interesting way.


 */
import java.util.Random;

public class FlickerPhase
{
    public static void main(String[] args) throws InterruptedException
    {

        Random random = new Random();
        int randomNumber;

        for ( int i=0; i<1; i++ )
        {
            randomNumber = 1 + random.nextInt(5);
            if (randomNumber == 1)
            {
                first();
            }
            if (randomNumber == 2)
            {
                second();
            }
            if (randomNumber == 3)
            {
                third();
            }
            if (randomNumber == 4)
            {
                fourth();
            }
            if (randomNumber == 5)
            {
                fifth();
            }
            // Write five if statements here.
            // If randomNumber is 1, then call the function named 'first'.
            // If randomNumber is 2, then call the function named 'second', and so on.

            // Optional: after the if statements are over, add in a slight delay.
        }

        Thread.sleep(5000);
        System.out.println("I pledge allegiance to the flag.");
    }

    public static void first()
    {
        System.out.print("I                               \r");
    }

    public static void second()
    {
        System.out.print("  pledge                        \r");
    }

    public static void third()
    {
        System.out.print("         allegiance             \r");
    }

    public static void fourth()
    {
        System.out.print("                    to the      \r");
    }

    public static void fifth()
    {
        System.out.print("                           flag.\r");
    }
}

