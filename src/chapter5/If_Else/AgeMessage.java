package chapter5.If_Else;
/*
Using if statements with compound conditions (like &&), make a program that displays a single message depending on the age given.
----------------------------------------------------+
age	          |      message                        |
----------------------------------------------------|
less than 16  |	"You can't drive."                  |
--------------|-------------------------------------|
16 to 17	  |  "You can drive but not vote."      |
--------------|-------------------------------------|
18 to 24	  |  "You can vote but not rent a car." |
--------------|-------------------------------------|
25 or older	  |  "You can do pretty much anything." |
----------------------------------------------------+
 */
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
