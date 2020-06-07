package chapter8;

import java.util.Scanner;

public class Adventure2
{
    public static void main(String[] args)
    {

        String choice = "";
        int nextRoom = 1;
        Scanner keyboard = new Scanner(System.in);


        while (nextRoom !=0)
        {
            if (nextRoom == 1)
            {
                System.out.print("MITCHELL'S TINY ADVENTURE 2!\n");
                System.out.print("You are in a creepy house!  Would you like to go \"upstairs\" or into the\n" +
                        "\"kitchen\"?\n");
                choice = keyboard.next();

                if (choice.equals("kitchen")) //covered
                {
                    nextRoom = 2;
                }
                else if (choice.equals("upstairs")) //covered
                {
                    nextRoom = 4;
                }
                else
                {
                    System.out.println( choice + " wasn't one of the options. Try again." );
                }
            }
            //kitchen
            if (nextRoom == 2)
            {
                System.out.print("There is a long countertop with dirty dishes everywhere.  Off to one side\n" +
                        "there is, as you'd expect, a refrigerator.  You may open the \"refrigerator\"\n" +
                        "or go \"back\".\n");
                choice = keyboard.next();

                if (choice.equals("back"))
                {
                    nextRoom = 1;
                }
                else if (choice.equals("refrigerator"))
                {
                    nextRoom = 3;
                }
                else
                {
                    System.out.println( choice + " wasn't one of the options. Try again." );
                }
            }

            if (nextRoom == 3)
            {
                System.out.print("Inside the refrigerator you see food and stuff.  It looks pretty nasty.\n" +
                        "Would you like to eat some of the food? (\"yes\" or \"no\")\n");
                choice = keyboard.next();

                if (choice.equals("yes"))
                {
                    System.out.print("The food is slimy and foul, but you manage to choke it down. Your stomach\n" +
                            "starts jumping like a frog in hot water.  You feel faint. Sliding to the\n" +
                            "floor, the darkness closes in.\n" +
                            "\n" +
                            "You have died.\n");
                    break;
                }
                else if (choice.equals("no"))
                {
                    System.out.print("visit Pyszne.pl :D");
                    break;
                }
                else
                {
                    System.out.println( choice + " wasn't one of the options. Try again." );
                }
            }

            if (nextRoom == 4)
            {
                System.out.print("Upstairs you see a hallway.  At the end of the hallway is the master\n" +
                        "\"bedroom\".  There is also a \"bathroom\" off the hallway.  Or, you can\n" +
                        "go back \"downstairs\". Where would you like to go\n");
                choice = keyboard.next();

                if (choice.equals("bedroom"))
                {
                    nextRoom = 5;
                }
                else if (choice.equals("bathroom"))
                {
                    nextRoom = 6;
                }
                else if (choice.equals("downstairs"))
                {
                    nextRoom = 1;
                }
                else
                {
                    System.out.println( choice + " wasn't one of the options. Try again." );
                }
            }

            if (nextRoom == 5)
            {
                System.out.print("\nYou are in the bedroom. Would you like to take a \"nap\" or go \"back\" ?\n");
                choice = keyboard.next();

                if (choice.equals("nap"))
                {
                    System.out.print("Sweet dreams...zzzz");
                    break;
                }
                else if (choice.equals("back"))
                {
                    nextRoom = 4;
                }
                else
                {
                    System.out.print(choice + " wasn't one of the options. Try again.");
                }
            }

            if (nextRoom == 6)
            {
                System.out.print("You are in the bathroom. Would you like to \"clean\" yourself or move back to \" hallway\" ?\n");
                choice = keyboard.next();

                if (choice.equals("clean"))
                {
                    System.out.print("Yuupiii. Hop on dirty :D");
                    break;
                }
                else if (choice.equals("hallway"))
                {
                    nextRoom = 4;
                }
                else
                {
                    System.out.print(choice + " wasn't one of the options. Try again.");
                }
            }

        }

        System.out.print("\nTHE END");

    }
}
