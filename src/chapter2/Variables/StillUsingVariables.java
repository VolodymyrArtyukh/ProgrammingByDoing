package chapter2.Variables;

/*
Write a program that stores your name and year of graduation into variables, and displays their values on the screen.

Make sure that you use two variables, and that the variable that holds your name is the best type for such a variable,
and that the variable that holds the year is the best type for that variable.

Also make sure that your variable names are good: the name of a variable should always relate to its contents.
 */
public class StillUsingVariables
{
    public static void main(String[] args)
    {
        String myFullName = "Volodymyr Artyukh";
        int graduationYear = 2015;

        System.out.println("My full name is " + myFullName + " and I've graduated at " + graduationYear + " year");
    }
}
