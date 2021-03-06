package chapter8.DoWhileLoops;

import java.util.Random;

/*
Redo the Dice Doubles assignment (the dice program with a loop) so that it uses a do-while loop instead of a while loop.
Otherwise it should behave exactly the same.
 */

public class ShorterDoubleDice
{
    public static void main(String[] args)
    {
        Random random = new Random();
        int dice_1 = 1 + random.nextInt(6);
        int dice_2 = 1 + random.nextInt(6);
        int total = dice_1 + dice_2;

        System.out.print("HERE COMES THE DICE!");

        do
        {
            System.out.print("\nRoll #1: " + dice_1);
            System.out.print("\nRoll #1: " + dice_2);
            System.out.print("\nThe total is: " + total +". Try again"+"\n");
            dice_1 = 1 + random.nextInt(6);
            dice_2 = 1 + random.nextInt(6);
            total = dice_1 + dice_2;

        }
        while (dice_1 != dice_2);

        System.out.print("\nRoll #1: " + dice_1);
        System.out.print("\nRoll #1: " + dice_2);
        System.out.print("\nThe total is: " + total);

    }
}
