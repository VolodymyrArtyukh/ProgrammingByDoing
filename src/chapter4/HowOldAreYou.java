package chapter4;

import java.util.Scanner;

public class HowOldAreYou
{
    public static void main(String[] args)
    {
        String name;
        int age;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Hey, what's your name? ");
        name = keyboard.next();

        System.out.print("\nOk, " + name + ",how old are you? ");
        age = keyboard.nextInt();


        if (age <= 16)
        {
            System.out.print("You can't drive.");
        }

        if (age <= 18)
        {
            System.out.print("\nYou can't vote, " + name  + ".");
        }

        if (age <= 25)
        {
            System.out.print("\nYou can't rent a car, " + name  + ".");
        }

        if (age > 25)
        {
            System.out.print("You can do anything that's legal");
        }
    }
}