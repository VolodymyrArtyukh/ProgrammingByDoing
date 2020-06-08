package chapter5.If_Else;
/*
Make a program which displays an appropriate name for a person, using a combination of nested ifs and compound conditions.
Ask the user for a gender, first name, last name and age.

If the person is female and 20 or over, ask if she is married.
If so, display "Mrs." in front of her name. If not, display "Ms." in front of her name.
If the female is under 20, display her first and last name.

If the person is male and 20 or over, display "Mr." in front of his name.
Otherwise, display his first and last name.

Note that asking a person if they are married should only be done if they are female and 20 or older,
which means you will have a single if and else nested inside one of your if statements.

Also, did you know that with an if statement (or else), the curly braces are optional when there is only one statement inside
 */
import java.util.Scanner;

public class GenderGame
{
    public static void main(String[] args)
    {
        int age;
        String gender;
        String firstName;
        String lastName;
        String femaleGender = "F";
        String maleGender = "M";
        String yes = "y";
        String no = "n";
        String martialStatus;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("What is your gender (M or F): ");
        gender = keyboard.next();

        System.out.print("First name: ");
        firstName = keyboard.next();

        System.out.print("Last name: ");
        lastName = keyboard.next();

        System.out.print("Age: ");
        age = keyboard.nextInt();


        if (gender.equals(femaleGender) && age >= 20)
        {
            System.out.print("Are you married," + firstName + "(y or n)?");
            martialStatus = keyboard.next();

            if (martialStatus.equals(yes))
            {
                System.out.print("Then I shall call you Mrs. " + lastName);
            }
            else if (martialStatus.equals(no))
            {
                System.out.print("Then I shall call you Ms. " + lastName);
            }
        }
        if (gender.equals(femaleGender) && age < 19)
        {
            System.out.print("Then I shall call you " + firstName + " " + lastName);
        }
        if (gender.equals(maleGender) && age >= 20)
        {
            System.out.print("Then I shall call you Mr. " + lastName);
        }
        else if (gender.equals(maleGender) && age < 19)
        {
            System.out.print("Then I shall call you " + firstName + " " + lastName);
        }

    }
}
