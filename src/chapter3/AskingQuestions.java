package chapter3;

import java.util.Scanner;

public class AskingQuestions
{
    public static void main(String[] args)
    {
            int age;
            String height;
            double weight;
            float inches;

            Scanner keyboard = new Scanner(System.in);

            System.out.print( "How old are you? " );
            age = keyboard.nextInt();

            System.out.print( "How tall are you? " );
            height = keyboard.next();

            System.out.print( "How much do you weigh? " );
            weight = keyboard.nextDouble();

            System.out.println("how many inches you are?");
            inches = keyboard.nextFloat();

            System.out.println( "So you're " + age + " old, " + inches + " have inches " + height + " tall and " + weight + " heavy." );

    }
}
