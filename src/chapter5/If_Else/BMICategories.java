package chapter5.If_Else;
/*
The body mass index (BMI) is commonly used by health and nutrition professionals to estimate human body fat in populations.
It is computed by taking the individual's weight (mass) in kilograms and dividing it by the square of their height in meters.

Start with the BMI Calculator you wrote previously (BMICalc.java).
Then use some if statements to show the category for a given BMI.

BMI	category
less than 18.5	underweight
18.5 to 24.9	normal weight
25.0 to 29.9	overweight
30.0 or more	obese
 */

import java.util.Scanner;

public class BMICategories
{
    public static void main(String[] args)
    {
        double height, weight, massBMI;
        String underweight_BMI = "underweight";
        String normal_BMI = "normal weight";
        String overweight_MBI = "overweight";
        String obese_BMI = "obese";

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Your height in m: ");
        height = keyboard.nextDouble();

        System.out.print("Your weight in kg: ");
        weight = keyboard.nextDouble();

        massBMI = weight / (height * height);

        if (massBMI < 18.5)
        {
            System.out.print("\nYour BMI is: " + massBMI);
            System.out.print("\nBMI category: " + underweight_BMI);
        }

        if (massBMI >= 18.5 && massBMI <= 24.9)
        {
            System.out.print("\nYour BMI is: " + massBMI);
            System.out.print("\nBMI category: " + normal_BMI);
        }

        if (massBMI >= 25.0 && massBMI <= 29.9)
        {
            System.out.print("\nYour BMI is: " + massBMI);
            System.out.print("\nBMI category: " + overweight_MBI);
        }

        if (massBMI >= 30.0)
        {
            System.out.print("\nYour BMI is: " + massBMI);
            System.out.print("\nBMI category: " + obese_BMI);
        }
    }
}
