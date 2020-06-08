package chapter9.ForLoops;
/*
Write another program that uses a for loop. With the loop, make the variable x go from -10 to 10, counting by 0.5.
(This means that x can't be an int.)

Inside the body of the loop, make another variable y become the current value of x squared.
Then display the current values of both x and y.

To get your output to line up like mine, use a tab.
 */
public class XY
{
    public static void main(String[] args)
    {
        System.out.print("x            y\n");
        System.out.print("-------------\n");

        for (double number = -10; number <= 10; number = number + 0.5)
        {
            System.out.println( number);
        }
    }
}
