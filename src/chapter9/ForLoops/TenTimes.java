package chapter9.ForLoops;
/*
Write a program that prints the important phrase "Mr. Mitchell is cool." on the screen ten times.
Use a for loop to do it.
 */
public class TenTimes
{
    public static void main(String[] args)
    {
        String message = "Mr. Mitchell is cool.\n";

        for ( int numberOfTimes = 1; numberOfTimes <= 10; numberOfTimes = numberOfTimes + 1)
        {
            System.out.print(numberOfTimes + ". " + message);
        }


    }
}
