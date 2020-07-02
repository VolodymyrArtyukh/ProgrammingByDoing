package chapter10.Functions;
/*
Just a short program to refresh your memory about how to program.
Write a program that prompts the user for a name.
Then display that name ten times.
You must use a loop. If the name given is "Mitchell", display it only five times.
 */
import java.util.Scanner;

public class Refresher
{
    public static void main(String[] args)
    {
        String name;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("What is your name: ");
        name = keyboard.next();

        if (name.equals("Mitchell"))
        {
            for (int j = 0; j <5; j++)
            {
                System.out.println(name);
            }
        }

        else
            {
            for (int i = 0; i < 10; i++)
            {
                System.out.println(name);
            }
        }

    }
}
