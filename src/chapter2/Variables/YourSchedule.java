package chapter2.Variables;

/*
Use several variables to store the names of your classes and their teachers.
Then, display a nice little table displaying your schedule.
Just FYI, my column of courses has a width of 26 characters, and the teacher column has a width of 15.
The first and last lines are a plus sign, fifty dashes (a.k.a. minus signs) and another plus sign.

Your table doesn't need to look exactly like this, or even line up.
I used a total of sixteen variables (course1, course2, ... course8, teacher1, teacher2, etc.).
You should do the same
 */
public class YourSchedule
{
    public static void main(String[] args)
    {
        //classes
        String englishClass = "English";
        String mathClass = "Math";
        String geographyClass = "Geography";

        //teachers
        String englishTeacher = "Janny Wise";
        String mathTeacher = "John Doe";
        String geographyTeacher = "Do not remember";

        System.out.println("+------------------------------------------+");
        System.out.println("| 1 |             " + englishClass + " | " + englishTeacher + "  |");
        System.out.println("| 2 |               " + mathClass + "  |    " + mathTeacher + "  |");
        System.out.println("| 3 |          " + geographyClass + "  | " + geographyTeacher + "|");
        System.out.println("+------------------------------------------+");
    }
}
