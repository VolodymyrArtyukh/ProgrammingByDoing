package chapter4;

import java.util.Scanner;

public class SpaceBoxing
{
    public static void main(String[] args)
    {
        double earthWeight;
         int   planetVisiting;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please enter your current earth weight: ");
        earthWeight = keyboard.nextDouble();

        System.out.println("\nI have information for the following planets: " +
                "\n 1. Venus" + "   2. Mars" + "   3. Jupiter" +
                "\n 4. Saturn" + "  5. Uranus" + " 6. Neptune");

        System.out.println("\n Which planet are you visiting? ");
        planetVisiting = keyboard.nextInt();

            if (planetVisiting == 1)
            {
                System.out.println("Your weight would be " + earthWeight * 0.78 + " pounds on that planet.");
            }
            else if (planetVisiting == 2)
            {
                System.out.println("Your weight would be " + earthWeight * 0.39 + " pounds on that planet.");
            }
            else if (planetVisiting == 3)
            {
                System.out.println("Your weight would be " + earthWeight * 2.65 + " pounds on that planet.");
            }
            else if (planetVisiting == 4)
            {
                System.out.println("Your weight would be " + earthWeight * 1.17 + " pounds on that planet.");
            }
            else if (planetVisiting == 5)
            {
                System.out.println("Your weight would be " + earthWeight * 1.05 + " pounds on that planet.");
            }
            else if (planetVisiting == 6)
            {
                System.out.println("Your weight would be " + earthWeight * 1.23 + " pounds on that planet.");
            }

    }
}
