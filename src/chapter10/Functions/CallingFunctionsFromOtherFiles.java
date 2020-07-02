package chapter10.Functions;
/*
Rewrite the Weekday Calculator to have almost no functions in it.
Start by opening up WeekdayCalculator.java and saving a copy of it as CallingFunctionsFromOtherFiles.java.

Then erase all the functions except for main() and weekday().

Now, when you compile it, you should get a lot of errors about undefined functions.

Then rewrite all the function calls so that they refer to versions in your previous assignments.
The functions will be these:

MonthName.month_name()
WeekdayName.weekday_name()
MonthOffset.month_offset()
WeekdayCalculator.is_leap()
 */
import java.util.Scanner;

import static chapter10.Functions.WeekdayCalculator.*;

public class CallingFunctionsFromOtherFiles
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Welcome to Mr. Mitchell's fantastic birth-o-meter!");
        System.out.println();
        System.out.println("All you have to do is enter your birth date, and it will");
        System.out.println("tell you the day of the week on which you were born.");
        System.out.println();
        System.out.println("Some automatic tests....");
        System.out.println("12 10 2003 => " + weekday(12,10,2003));
        System.out.println(" 2 13 1976 => " + weekday(2,13,1976));
        System.out.println(" 2 13 1977 => " + weekday(2,13,1977));
        System.out.println(" 7  2 1974 => " + weekday(7,2,1974));
        System.out.println(" 1 15 2003 => " + weekday(1,15,2003));
        System.out.println("10 13 2000 => " + weekday(10,13,2000));
        System.out.println();

        System.out.println("Now it's your turn!  What's your birthday?");
        System.out.print("Birth date (mm dd yyyy): ");
        int mm = keyboard.nextInt();
        int dd = keyboard.nextInt();
        int yyyy = keyboard.nextInt();

        // put a function call for weekday() here
        System.out.println("You were born on "+weekday(mm,dd,yyyy)+"!");
    }


    public static String weekday( int mm, int dd, int yyyy )
    {
        int yy, total, remainder;
        yy = yyyy - 1900;
        String date = "";

        // bunch of calculations go here
        is_leap(yyyy);

        if (is_leap(yyyy)==true && mm==1 || mm==2)
            total = yy/4 + yy + dd + month_offset(mm)-1;
        else
            total = yy/4 + yy + dd + month_offset(mm);

        remainder = total%7;
        weekday_name(remainder);
        date = weekday_name(remainder) + ", " + month_name(mm) + " " + dd + ", " + yyyy;

        return date;
    }




}

