package chapter3.KeyboardInput;
/*
Ask the user for their name.
Then display their name to prove that you can recall it.
Ask them for their age. Then display that.
Finally, ask them for how much they make and display that.
You should use the most appropriate data type for each variable.
 */
import java.util.Scanner;

public class NameAgeSalary
{
    public static void main(String[] args)
    {
        String name;
        int age;
        double salary;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Hello.  What is your name?");
        name = keyboard.next();

        System.out.println("\nHi," + name +"!" + "   How old are you?");
        age = keyboard.nextInt();

        System.out.println("\nSo you're " + age + ", eh?  That's not old at all!" +
                "\nHow much do you make, " + name + "?");
        salary = keyboard.nextDouble();

        System.out.println("\n" + salary + "  I hope that's per hour and not per year! LOL!");

    }
}
