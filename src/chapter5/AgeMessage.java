package chapter5;

import java.util.Scanner;

public class AgeMessage
{
    public static void main(String[] args)
    {
        String name;
        int age;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Your name? ");
        name = keyboard.next();

        System.out.print("Your age ");
        age = keyboard.nextInt();

        if (age < 16)
        {
            System.out.print("You can't drive. " + name);
        }
        if (age >= 16 && age <= 17)
        {
            System.out.print("You can drive but not vote. " + name);
        }
        if (age >= 18 && age <=24)
        {
            System.out.print("You can vote but not rent a car. " + name);
        }
        if (age >= 25)
        {
            System.out.print("You can do pretty much anything. " + name);
        }
    }
}
