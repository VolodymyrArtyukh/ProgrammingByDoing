package chapter9.ForLoops;

import java.util.Random;

public class BabyBlackjack
{
    public static void main(String[] args)
    {
        Random random = new Random();
        System.out.print("Baby Blackjack!\n");

        for (int i = 1; i <= 1; i++)
        {
            int randomNumber_1 = 1 + random.nextInt(10);
            int randomNumber_2 = 1 + random.nextInt(10);
            int myTotal = randomNumber_1 + randomNumber_2;

            System.out.println("\nYou drew " + randomNumber_1 + " and " + randomNumber_2);
            System.out.println("Your total is: " + myTotal);

             randomNumber_1 = 1 + random.nextInt(10);
             randomNumber_2 = 1 + random.nextInt(10);
             int dealersTotal = randomNumber_1 + randomNumber_2;

            System.out.println("\nThe dealer has:  " + randomNumber_1 + " and " + randomNumber_2);
            System.out.println("Dealer's total is: " + dealersTotal);

            if (myTotal > dealersTotal)
            {
                System.out.println("\nYOU WIN");
            }
            else
            {
                System.out.println("\nDEALER WON");
            }
        }

    }
}
