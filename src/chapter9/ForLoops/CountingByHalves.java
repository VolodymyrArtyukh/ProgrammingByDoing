package chapter9.ForLoops;
/*
Write a program that uses a for loop.
With the loop, make the variable x go from -10 to 10, counting by 0.5. (This means that x can't be an int.)
 */
public class CountingByHalves
{
    public static void main (String[] args)
    {
        System.out.print("x\n");
        System.out.print("------\n");

        for (double number = -10; number <= 10; number = number + 0.5)
        {
            System.out.println( number);
        }
    }
}
