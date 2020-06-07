package chapter3;

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
