package chapter5.If_Else;
/*
Using if statements with compound conditions (like &&), make a guessing game of two questions similar to the Twenty Questions assignment.

However, this time you must accomplish it using if statements with compound conditions and you must not use else if or else or nested ifs.

Question 1: Does it belong inside or outside or both?
Question 2: Is it alive?
Again, here are some sample responses, for the non-creative among you.
--------------------------------------------------------+
            |    inside	   |  outside	 |    both      |
------------|--------------|-------------|--------------|
alive	    |  houseplant  |  bison	     |     dog      |
------------|--------------|-------------|--------------|
not alive	|shower curtain|  billboard	 |  cell phone  |
------------|--------------|-------------|--------------+
 */
import java.util.Scanner;

public class TwoMoreQuestions
{
    public static void main(String[] args)
    {
        String where_is_located;
        String state;
        String inside = "inside";
        String outside = "outside";
        String both = "both";
        String alive = "yes";
        String not_alive = "no";

        Scanner keyboard = new Scanner(System.in);
        System.out.print("TWO MORE QUESTIONS, BABY!");
        System.out.print("\nThink of something and I'll try to guess it!");
        System.out.print("\nQuestion 1) Does it stay inside or outside or both ");
        where_is_located = keyboard.next();
        System.out.print("\nQuestion 2) Is it a living thing?" );
        state = keyboard.next();

        //inside and alive
        if (where_is_located.equals(inside) && state.equals(alive))
        {
            System.out.print("houseplant");
        }
        //outside and alive
        if (where_is_located.equals(outside) && state.equals(alive))
        {
            System.out.print("bison");
        }
        //both and alive
        if (where_is_located.equals(both) && state.equals(alive))
        {
            System.out.print("dog");
        }

        //inside and not_alive
        if (where_is_located.equals(inside) && state.equals(not_alive))
        {
            System.out.print("shower curtain");
        }

        //outside and not_alive
        if (where_is_located.equals(outside) && state.equals(not_alive))
        {
            System.out.print("billboard");
        }

        //both and not_alive
        if (where_is_located.equals(both) && state.equals(not_alive))
        {
            System.out.print("cell phone");
        }

    }
}
