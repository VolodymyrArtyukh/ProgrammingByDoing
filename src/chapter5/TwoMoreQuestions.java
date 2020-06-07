package chapter5;

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
