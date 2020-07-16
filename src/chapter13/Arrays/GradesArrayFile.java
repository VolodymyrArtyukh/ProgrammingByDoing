package chapter13.Arrays;

/*
Prompt the user for a first and last name, and the name for a file.
Randomly choose five grades for that person from 1 to 100 and store them in an array that can hold five integers.
Then output the first and last name and those five grades to the specified file.
 */
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class GradesArrayFile
{
    public static void main(String[] args) throws IOException
    {
        String name;
        String filename;
        int[] myArray = new int[6];


        Random random = new Random();
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Name (first last):");
        name = keyboard.nextLine();

        System.out.print("Filename:");
        filename = keyboard.next();

        File file = new File(filename);
        FileWriter fileWriter = new FileWriter(file);
        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.print(name + "\n");

        System.out.print("\nHere are your randomly-selected grades (hope you pass):\n");
        for (int i = 1; i < myArray.length; i++)
        {
            myArray[i] = 1 + random.nextInt(100);
            System.out.println("Grade " + i + ": " +myArray[i]);
            printWriter.println("Grade " + i + ": " +myArray[i]);
        }

        System.out.print("\nData saved in " + filename);
        printWriter.close();
    }
}
