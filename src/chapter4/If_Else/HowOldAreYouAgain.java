package chapter4.If_Else;

/*
Using if statements, else if, and else statements, make a program which displays a different message depending on the age given.

--------------------------------------------------+
age	         |          message                   |
-------------|----------------------------------- |
less than 16 |	"You can't drive."                |
-------------|----------------------------------- |
16 to 17	 | "You can drive but not vote."      |
-------------|----------------------------------- |
18 to 24	 | "You can vote but not rent a car." |
-------------|----------------------------------- |
25 or older	 | "You can do pretty much anything." |
--------------------------------------------------+

 */
import java.util.Scanner;

public class HowOldAreYouAgain
{

    public static void main(String[] args) {
        String name;
        int age;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Hey, what's your name? (Sorry, I keep forgetting.) ");
        name = keyboard.next();

        System.out.print("\nOk, " + name + ",how old are you? ");
        age = keyboard.nextInt();

        if (age <= 16)
        {
            System.out.print("You can't drive.");
        }

        else if (age <= 18)
        {
            System.out.print("\nYou can't vote, " + name  + ".");
        }

       else if (age <= 25)
        {
            System.out.print("\nYou can't rent a car, " + name  + ".");
        }

        else
        {
            System.out.print("You can do anything that's legal");
        }
    }
}
