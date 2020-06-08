package chapter2.Variables;

/*
Write a program that creates three variables: an int, a double, and a String.

Put the value 113 into the first variable, the value 2.71828 into the second, and the value "Computer Science" into the third.
It does not matter what you call the variables... this time.

Then, display the values of these three variables on the screen, one per line.
 */
public class UsingVariables
{
    public static void main(String[] args)
    {
        int room = 19;
        double Pi = 3.14 ;
        String CS = "Computer Science";

        System.out.println("This is room #" + room);
        System.out.println("Pi number is close to " + Pi);
        System.out.println("Amma learning " + CS);
    }
}
