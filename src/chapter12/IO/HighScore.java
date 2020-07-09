package chapter12.IO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
/*
Write a dumb little program that asks the user for their name and a number.
Then store that name and that "high score" in a file. The file should be called "score.txt".
 */
public class HighScore
{
    public static void main(String[] args) throws IOException
    {
        int score;
        String name;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("You got a high score!\n");

        System.out.print("\nPlease enter your score:");
        score = keyboard.nextInt();

        System.out.print("Please enter your name:");
        name = keyboard.next();

        File highScore = new File("score.txt");
        FileWriter fileWriter = new FileWriter(highScore);
        PrintWriter printWriter = new PrintWriter(fileWriter);

        printWriter.print(score + " " + name);
        printWriter.close();
    }
}
