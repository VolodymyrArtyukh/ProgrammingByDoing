package chapter10.Functions;
/*
Write a program to calculate the area of four different geometric shapes: triangles, squares, rectangles, and circles.
You must use functions. Here are the functions you should create:

Your program should present a menu for the human to choose which shape to calculate,
then ask them for the appropriate values (length, width, radius, etc.).
Then it should pass those values to the appropriate function and display the resulting area.

Notice that you must not input the values inside the functions, and you must not display the values inside the functions.
All input and output must be in the main(), and values must be passed to the functions and returned from them.
 */
import java.util.Scanner;

public class AreaCalculator
{
    public static void main(String[] args)
    {
        int shape, length, width, radius, side, height, base;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Shape Area Calculator version 0.1 (c) 2005 Mitchell Sample Output, Inc.\n");

        System.out.print("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");
        System.out.print("\n1) Triangle\n" +
                "2) Rectangle\n" +
                "3) Square\n" +
                "4) Circle\n" +
                "5) Quit\n");
        System.out.print("Which shape: ");
        shape = keyboard.nextInt();

        for (int numberOfTurns = 1; numberOfTurns <= shape; numberOfTurns++)
        {

            if (shape == 1)
            {
                System.out.print("\nBase: ");
                base = keyboard.nextInt();
                System.out.print("Height: ");
                height = keyboard.nextInt();

                System.out.print("\nThe area is: " + area_triangle(base, height) + "\n");
            }

            if (shape == 2)
            {
                System.out.print("\nLength: ");
                length = keyboard.nextInt();
                System.out.print("Width: ");
                width = keyboard.nextInt();

                System.out.print("\nThe area is: " + area_rectangle(length, width) + "\n");
            }

            if (shape == 3)
            {
                System.out.print("\nSide length: ");
                side = keyboard.nextInt();

                System.out.print("\nThe area is: " + area_square(side) + "\n");
            }

            if (shape == 4)
            {
                System.out.print("\nRadius: ");
                radius = keyboard.nextInt();

                System.out.print("\nThe area is: " + area_circle(radius) + "\n");
            }

            if (shape == 5)
            {
                System.out.print(quit());
                break;
            }
            System.out.print("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");
            System.out.print("\n1) Triangle\n" +
                    "2) Rectangle\n" +
                    "3) Square\n" +
                    "4) Circle\n" +
                    "5) Quit\n");
            System.out.print("Which shape: ");
            shape = keyboard.nextInt();
        }
        System.out.print("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");
    }

    public static double area_triangle( int base, int height )
    {
        int area;

        area = (base * height)/2;
        return area;
    }
    public static int area_rectangle( int length, int width )
    {
        int area;
        area = length * width;
        return area;
    }

    public static int area_square( int side )
    {
        int square;
        square = side * side;
        return square;
    }
    public static double area_circle(int radius)
    {
        double pi = 3.14;
        double area;

        area = pi * radius * radius;
        return area;
    }

    public static String quit()
    {
        return "\nGoodbye";
    }
}
