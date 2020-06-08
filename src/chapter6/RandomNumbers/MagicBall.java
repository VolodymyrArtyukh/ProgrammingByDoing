package chapter6.RandomNumbers;
/*
Magic ball 8
 */
import java.util.Random;

public class MagicBall
{
    public static void main ( String[] args )
    {
        Random randomNumber = new Random();

        int myChoice = 1 + randomNumber.nextInt(15);
        String response = "";

        if ( myChoice == 1 )
            response = "It is certain";
        else if ( myChoice == 2 )
            response = "It is decidedly so";
        else if ( myChoice == 3 )
            response = "Without a doubt";
        else if ( myChoice == 4 )
            response = "Yes - definitely";
        else if ( myChoice == 5 )
            response = "You may rely on it";
        else if ( myChoice == 6 )
            response = "As I see it, yes";
        else if ( myChoice == 7 )
            response = "Most likely";
        else if ( myChoice == 8 )
            response = "Outlook good";
        else if ( myChoice == 9 )
            response = "Signs point to yes";
        else if ( myChoice == 10 )
            response = "Yes";
        else if ( myChoice == 11 )
            response = "Reply hazy, try again";
        else if ( myChoice == 12 )
            response = "Ask again later";
        else if ( myChoice == 13 )
            response = "Better not tell you now";
        else if ( myChoice == 14 )
            response = "Cannot predict now";
        else if ( myChoice == 15 )
            response = "Concentrate and ask again";
        else if (myChoice == 16)
            response = "Don't count on it";
        else if (myChoice == 17)
            response = "My reply is no";
        else if (myChoice == 18)
            response = "My sources say no";
        else if (myChoice == 19)
            response = "Outlook not so good";
        else if (myChoice == 20)
            response = "Very doubtful";
        else
            response = "8-BALL ERROR!";

        System.out.println( "MAGIC 8-BALL SAYS: " + " " +response );
    }
}
