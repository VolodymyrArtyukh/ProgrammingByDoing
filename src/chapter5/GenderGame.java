package chapter5;

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
