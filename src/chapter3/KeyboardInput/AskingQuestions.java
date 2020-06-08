package chapter3.KeyboardInput;

/*
It's now time to pick up the pace a bit.
I've got you doing a lot of printing so that you get used to typing simple things,
but those simple things are fairly boring. What we want to do now is get you getting data into your programs.
This though is a little tricky so we have to have you learn to do two things that may not make sense right away,
but if you stick with it they should click suddenly a few exercises from now.

Most of what software does is the following:

Take some kind of input from a person.
Change it.
Print out something to show how it changed.
So far you've only been printing, but you haven't been able to get any input from a person, or change it.
You may not even know what "input" means, so rather than talk about it, let's have you do some and see if you get it.
Next exercise we'll do more to explain it.
 */
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
