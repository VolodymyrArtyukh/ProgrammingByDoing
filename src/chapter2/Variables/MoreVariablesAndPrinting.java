package chapter2.Variables;
/*
Now we'll do even more typing of variables and printing them out.
Every time you put " (double-quotes) around a piece of text you have been making a string.
A string is how you make something that your program might give to a human.
You print them, save them to files, send them to web servers, all sorts of things.

Strings are really handy, so in this exercise you'll learn how to make strings that have variables embedded in them.

As usual, just type this in even if you don't understand it and make it exactly the same
 */
public class MoreVariablesAndPrinting
{
    public static void main(String[] args)
    {
        String Name, Eyes, Teeth, Hair;
        int Age;
        double Weight, Height, kg_weight, cm_height;

        Name = "Volodymyr Artyukh";
        Age = 27;     // not a lie
        Height = 74;  // inches
        Weight = 80; // kg
        Eyes = "Blue";
        Teeth = "White";
        Hair = "blond";
        kg_weight = Weight / 2.205;
        cm_height = Height * 2.54;

        System.out.println( "Let's talk about " + Name + "." );
        System.out.println( "He's " + Height + " inches tall." );
        System.out.println( "He's " + Weight + " kg heavy." );
        System.out.println( "Actually, that's not too heavy." );
        System.out.println( "He's got " + Eyes + " eyes and " + Hair + " hair." );
        System.out.println( "His teeth are usually " + Teeth + " depending on the coffee." );

        // This line is tricky; try to get it exactly right.
        System.out.println( "If I add " + Age + ", " + Height + ", and " + Weight
                + " I get " + (Age + cm_height + kg_weight) + "." );
    }
}
