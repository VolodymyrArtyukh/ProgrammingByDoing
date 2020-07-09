package chapter12.IO;
/*
rite a program that asks the user which file to open.
Then it should open that file, and read the three integers from the file.
It should then display (on the screen) the total of the integers.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SummingThreeNumbersAnyFile
{
    public static void main(String[] args) throws FileNotFoundException
    {
        String file;
        int total = 0;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("\nWhich file would you like to read numbers from: ");
        file = keyboard.next();
        System.out.println("Reading numbers from \"" + file + "\"");
        System.out.println();

        Scanner fileReader = new Scanner(new File(file));

        while(fileReader.hasNext())
        {
            int number = fileReader.nextInt();
            System.out.print(number + " ");
            total = number + total;
        }

        System.out.println("\nTotal is " + total + "\n");
        fileReader.close();
    }
}
