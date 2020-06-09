package chapter9.ForLoops;
/*
Write a program that uses a for loop to display all the numbers from 1 to 20, marking those which are even (divisible by two).
It should use modulus by 2: if the remainder is zero, it's divisible by 2.
 */
public class NoticingEvenNumbers
{
    public static void main(String[] args)
    {

        for (int number = 1; number <= 20; number++ )
        {
            if (number % 2 == 0)
            {
                System.out.println(number + " <");
            }
            else
                {
                    System.out.println(number);
                }

        }
    }
}
