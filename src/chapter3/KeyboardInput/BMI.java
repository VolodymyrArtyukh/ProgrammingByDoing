package chapter3.KeyboardInput;
/*
(This assignment was suggested by Joel H in 2012.)

The body mass index (BMI) is commonly used by health and nutrition professionals to estimate human body fat in populations.

It is computed by taking the individual's weight (mass) in kilograms and dividing it by the square of their height in meters.
 */
import java.util.Scanner;

public class BMI
{
    public static void main(String[] args)
    {
        double height, weight, massBMI;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Your height in m: ");
        height = keyboard.nextDouble();

        System.out.print("Your weight in kg: ");
        weight = keyboard.nextDouble();

        massBMI = weight / (height * height) ;

        System.out.print("Your BMI is: " + massBMI);

    }
}
