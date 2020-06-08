package chapter5.If_Else;

/*
Make a program which plays a simple game of 20 2 Questions.
\The first question should be "animal, vegetable, or mineral?" Then, the second question should be "is it bigger than a breadbox?"
Then, display one of six possible responses, depending on their answers.
You can choose what answers to give for each of the six possibilities.

Here's a suggestion:
------------------------------------------------------------------------------+
size \ type	             |   animal	      |   vegetable	   |     mineral      |
-------------------------|----------------|----------------|------------------|
smaller than a breadbox	 |   squirrel	  |    carrot	   |     paper clip   |
-------------------------|----------------|----------------|------------------|
bigger than a breadbox	 |   moose	      |  watermelon	   |         Camaro   |
------------------------------------------------------------------------------+

 */
import java.util.Scanner;

public class TwoQuestions
{
    public static void main(String[] args)
    {
        String type;
        String size;
        String animal = "animal";
        String vegetable = "vegetable";
        String mineral = "mineral";
        String positiveAnswer = "yes";
        String negativeAnswer = "no";


        Scanner keyboard = new Scanner(System.in);

        System.out.println("TWO QUESTIONS!");
        System.out.println("Think of an object, and I'll try to guess it.\n");

        System.out.print("Question 1) Is it animal, vegetable, or mineral?" +
                "\n> ");
        type  = keyboard.next();

        System.out.print("\nQuestion 2) Is it bigger than a breadbox?" +
                "\n> ");
        size = keyboard.next();

        if (type.equals(animal) && size.equals(positiveAnswer))
        {
            System.out.print("Moose\n");
        }
        else if (type.equals(animal) && size.equals(negativeAnswer))
        {
            System.out.print("squirrel\n");
        }
        else if (type.equals(vegetable) && size.equals(positiveAnswer))
        {
            System.out.println("watermalon\n");
        }
        else if (type.equals(vegetable) && size.equals(negativeAnswer))
        {
            System.out.print("carrot\n");
        }
        else if (type.equals(mineral) && size.equals(positiveAnswer))
        {
            System.out.println("Camaro\n");
        }
        else if (type.equals(mineral) && size.equals(negativeAnswer))
        {
            System.out.print("paper\n");
        }
        else
        {
            System.out.print("Smth went wrong\n");
        }

        System.out.print("I would ask you if I'm right, but I don't actually care.\n");
    }
}
