package chapter1.Basics;

/*
Every programming language has some kind of way of doing numbers and math.
 Don't worry, programmers lie frequently about being math geniuses when they really aren't.
 If they were math geniuses, they would be doing math, not writing ads and social network games to steal people's money.

This exercise has lots of math symbols so let's name them right away so you know what they're called.
As you type this one in, say the names. When saying them feels boring you can stop saying them.
Here are the names:

+ plus
- minus
/ slash
* asterisk
% percent
< less-than
> greater-than
<= less-than-or-equal
>= greater-than-or-equal
Notice how the operations are missing?
After you type in the code for this exercise you are to go back and figure out what each of these does and complete the table.
For example, + does addition.
 */
public class NumbersAndMath
{
    public static void main( String[] args )
    {
        System.out.println( "I will now count my chickens:" );

        System.out.println( "Hens " + ( 25 + 30 / 6 ) );
        System.out.println( "Roosters " + ( 100 - 25 * 3 % 4 ) );

        System.out.println( "Now I will count the eggs:" );

        System.out.println( 3 + 2 + 1 - 5 + 4 % 2 - 1 / 4 + 6 );

        System.out.println( "Is it true that 3 + 2 < 5 - 7?" );

        System.out.println( 3 + 2 < 5 - 7 );

        System.out.println( "What is 3 + 2? " + ( 3 + 2 ) );
        System.out.println( "What is 5 - 7? " + ( 5 - 7 ) );

        System.out.println( "Oh, that's why it's false." );

        System.out.println( "How about some more." );

        System.out.println( "Is it greater? " + ( 5 > -2 ) );
        System.out.println( "Is it greater or equal? " + ( 5 >= -2 ) );
        System.out.println( "Is it less or equal? " + ( 5 <= -2 ) );
    }
}
