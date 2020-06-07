package chapter7;

import java.util.Random;

public class DiceDoubles
{
    public static void main(String[] args)
    {
        Random random = new Random();
        int dice_1 = 1 + random.nextInt(6);
        int dice_2 = 1 + random.nextInt(6);
        int total = dice_1 + dice_2;

        System.out.print("HERE COMES THE DICE!");

        while (dice_1 != dice_2)
        {
            System.out.print("\nRoll #1: " + dice_1);
            System.out.print("\nRoll #1: " + dice_2);
            System.out.print("\nThe total is: " + total +". Try again"+"\n");
            dice_1 = 1 + random.nextInt(6);
            dice_2 = 1 + random.nextInt(6);
            total = dice_1 + dice_2;

        }

        System.out.print("\nRoll #1: " + dice_1);
        System.out.print("\nRoll #1: " + dice_2);
        System.out.print("\nThe total is: " + total);

    }
}
