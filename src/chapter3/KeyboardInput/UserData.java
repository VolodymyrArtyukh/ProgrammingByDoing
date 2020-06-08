package chapter3.KeyboardInput;
/*
Ask the user for several pieces of information, and display them on the screen afterward as a summary.

first name
last name
grade (classification)
student id number
login name
GPA (0.0 to 4.0)
You must use the most appropriate type for each variable and not just Strings for everything
 */
import java.util.Scanner;

public class UserData
{
    public static void main(String[] args)
    {
        String firstName;
        String lastName;
        String loginName;
        int grade;
        int studentID;
        double GPA;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("First name: ");
        firstName = keyboard.next();

        System.out.print("Last name: ");
        lastName = keyboard.next();

        System.out.print("Grade (9-12): ");
        grade = keyboard.nextInt();

        System.out.print("Student ID: ");
        studentID = keyboard.nextInt();

        System.out.print("Login: ");
        loginName = keyboard.next();

        System.out.print("GPA (0.0-4.0): ");
        GPA = keyboard.nextDouble();

        System.out.println("\nYour information: " +
                "\n" + "       Login: " + loginName +
                "\n" + "       ID: " + studentID +
                "\n" + "       Name: " + firstName + ", " + lastName +
                "\n" + "       Login: " + GPA +
                "\n" + "       Login: " + grade);
    }

}
