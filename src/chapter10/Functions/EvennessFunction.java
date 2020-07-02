package chapter10.Functions;
/*
Write a main() that contains a for loop to generate all the numbers from 1 to 20.
Use if statements inside the loop to mark the number with a "<" if it's even, with a "=" if it's evenly divisible by 3,
and with both if it's divisible by both 2 and 3.
 */
public class EvennessFunction
{
    public static void main(String[] args)
    {

        for (int number = 1; number <= 20; number++)
        {
            System.out.print(number);

            if (isEven(number) && isDivisibleBy3(number))
            {
                System.out.println(" <=");
            }
            else if (isEven(number))
            {
                System.out.println(" <");
            }
            else if (isDivisibleBy3(number))
            {
                System.out.println(" =");
            }
            System.out.println();
        }
    }

    public static boolean isEven( int number )
    {
        if (number % 2 == 0)
            {
                return true;
            }
                return false;
    }

    public static boolean isDivisibleBy3( int number )
    {
        if (number % 3 == 0)
        {
            return true;
        }
            return false;
    }


}
