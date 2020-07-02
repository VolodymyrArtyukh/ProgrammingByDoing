package chapter10.Functions;
/*
This assignment is almost the same as A Refresher.

Write a program that prompts the user for a name.
Then display that name ten times using a loop.
However, if the name given is "Mitchell", display it only five times.

So here's the challenge: write the program using only one if statement (no else) and one for loop.
 */
import java.util.Scanner;

public class RefresherChallenge
{
    public static void main(String[] args)
    {
        String name;
        String mitchell = "Mitchell";
        Scanner keyboard = new Scanner(System.in);
        System.out.print("What is your name: ");
        name = keyboard.next();

        for (int i = 0; i < 10; i++)
        {
            System.out.println(name);
        }

        if (name.equals(mitchell))
        {
            for (int j = 0; j <5; j++)
            {
                System.out.println(name);
            }
        }
    }
}
