package chapter8.DoWhileLoops;
/*
Flip a coin, so it gets HEAD or TAILS
 */
import java.util.Random;
import java.util.Scanner;

public class FlipAgain
{
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);
        Random random = new Random();

        String again;

        do {
            int flip = random.nextInt(2);
            String coin;

            if ( flip == 1 )
                coin = "HEADS";
            else
                coin = "TAILS";

            System.out.println( "You flip a coin and it is... " + coin );

            System.out.print( "Would you like to flip again (y/n)? " );
            again = keyboard.next();
        }
        while ( again.equals("y") );

    }
}
