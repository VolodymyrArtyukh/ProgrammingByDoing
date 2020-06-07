package chapter5;

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
