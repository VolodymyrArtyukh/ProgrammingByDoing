package chapter4.If_Else;

/*
Julio Cesar Chavez Mark VII is an interplanetary space boxer,
who currently holds the championship belts for various weight categories on many different planets within our solar system.
However, it is often difficult for him to recall what his "target weight" needs to be on earth in order to make the weight class on other planets.
Write a program to help him keep track of this.

It should ask him what his earth weight is, and to enter a number for the planet he wants to fight on.
It should then compute his weight on the destination planet based on the table below:

-----------------------------------+
#	Planet |	Relative gravity   |
---------- |-----------------------|
1	Venus  |    0.78               |
---------- |-----------------------|
2	Mars   |    0.39               |
---------- |-----------------------|
3	Jupiter|	2.65               |
-----------|-----------------------|
4	Saturn |	1.17               |
---------- |-----------------------|
5	Uranus |	1.05               |
-----------|-----------------------|
6	Neptune|	1.23               |
-----------------------------------+

 */
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
