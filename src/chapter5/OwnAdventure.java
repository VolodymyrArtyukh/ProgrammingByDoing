package chapter5;

import java.util.Scanner;

public class OwnAdventure
{
    public static void main(String[] args)
    {
        String creepyHouse;
        String upstairs = "upstairs";
        String kitchen = "kitchen";
        String countertop;
        String refrigerator = "refrigerator";
        String cabinet = "cabinet";
        String food;
        String yes = "yes";
        String no = "no";
        String call;
        String hallway;
        String bedroom = "bedroom";
        String bathroom = "bathroom";
        String openCloset;
        String jacuzziChoise;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("WELCOME TO MITCHELL'S TINY ADVENTURE!\n");

        System.out.print("You are in a creepy house!  Would you like to go \"upstairs\" or into the \"kitchen\"?" +
                "\n> ");
        creepyHouse = keyboard.next();

        //kitchen selected
        if (creepyHouse.equals(kitchen))
        {
            System.out.print("There is a long countertop with dirty dishes everywhere.  Off to one side\n" +
                    "there is, as you'd expect, a refrigerator. You may open the \"refrigerator\"\n" +
                    "or look in a \"cabinet\"." + "\n> ");
            countertop = keyboard.next();


            //refrigerator selected
            if (countertop.equals(refrigerator))
            {
                System.out.print("Inside the refrigerator you see food and stuff.  It looks pretty nasty.\n" +
                        "Would you like to eat some of the food? (\"yes\" or \"no\")" + "\n> ");
                food = keyboard.next();

                //answered "no"
                if (food.equals(no))
                {
                    System.out.print("You die of starvation... eventually.\n");
                }
                //answered "yes"
                else if (food.equals(yes))
                {
                    System.out.print("Yes! you've survived");
                }
            }
            //cabinet selected
            else if (countertop.equals(cabinet))
            {
                System.out.print("Inside the cabinet there is a phone." +
                        " Will you call for help? (\"yes\" or \"no\")" + "\n> ");
                call = keyboard.next();

                //answered "yes"
                if (call.equals(yes))
                {
                    System.out.print("\nYou've reached the police!");
                }
                //answered "no"
                else if (call.equals(no))
                    {
                        System.out.print("\nYou can play tetris ;)");
                    }
            }
        }

        else if (creepyHouse.equals(upstairs))
        {
            System.out.print("Upstairs you see a hallway.  At the end of the hallway is the master\n" +
                    "\"bedroom\".  There is also a \"bathroom\" off the hallway.  Where would you like to go?" +
                    "\n> ");
            hallway = keyboard.next();

            if (hallway.equals(bedroom))
            {
                System.out.print("You are in a plush bedroom, with expensive-looking hardwood furniture.  The\n" +
                        "bed is unmade.  In the back of the room, the closet door is ajar.  Would you\n" +
                        "like to open the door? (\"yes\" or \"no\")" + "\n> ");
                openCloset = keyboard.next();

                if (openCloset.equals(yes))
                {
                    System.out.print("Yeeeah. You've found the blanket" +
                            " Go and sleep buddy. You've deserved it ;)\n");
                }
                else if (openCloset.equals(no)) {
                    System.out.print("\n" +
                            "Well, then I guess you'll never know what was in there.  Thanks for playing,\n" +
                            "I'm tired of making nested if statements.\n");
                }
            }
            else if (hallway.equals(bathroom))
            {
                System.out.print("You are in the bathroom. You see there is a jacuzzi" +
                        " Do you wanna go in ? :)" + " (\"yes\" or \"no\")" + "\n>");
                jacuzziChoise = keyboard.next();

                if (jacuzziChoise.equals(yes))
                {
                    System.out.print("Cool! Let's invite girls :)\n");
                }
                else if (jacuzziChoise.equals(no))
                {
                    System.out.print("Boooooooring\n");
                }
            }
        }

        else
        {
            System.out.print("\nFuck this game. I'm going home :D");
        }

    }
}
