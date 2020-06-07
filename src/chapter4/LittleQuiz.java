package chapter4;

import java.util.Scanner;

public class LittleQuiz
{
    public static void main(String[] args)
    {
        int geographyQuestion, catQuestion, mathQuestion, score = 0;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Are you ready for a quiz? ");
        keyboard.next();
        System.out.println("Okay, here it comes!");

        //Question 1
        System.out.println("\nQ1) What is the capital of Alaska?\n" +
                "\t1) Melbourne\n" +
                "\t2) Anchorage\n" +
                "\t3) Juneau\n");
        geographyQuestion = keyboard.nextInt();

        if (geographyQuestion == 3)
        {
            System.out.println("\nCorrect!");
            score++;
        }
        else
        {
            System.out.println("Nooooooo");
        }

        //Question 2
        System.out.println("Q2) Can you store the value \"cat\" in a variable of type int?\n" +
                "\t1) yes\n" +
                "\t2) no");
        catQuestion = keyboard.nextInt();

        if (catQuestion == 2)
        {
            System.out.println("That's correct");
            score++;
        }
        else
        {
            System.out.println("Sorry");
        }

        //Question 3

        System.out.println("Q3) What is the result of 9+6/3?\n" +
                "\t1) 5\n" +
                "\t2) 11\n" +
                "\t3) 15/3");
        mathQuestion = keyboard.nextInt();

        if (mathQuestion == 2)
        {
            System.out.println("That's correct");
            score++;
        }
        else
        {
            System.out.println("Noooo");
        }

        System.out.println("Overall, you got " + score + " out of 3 correct.");
        System.out.println("\nThanks for playing!");
    }

}
