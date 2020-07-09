package chapter12.IO;
/*
Rewrite A Letter to Yourself, but modify it so that instead of displaying the letter on the screen, it puts it in a file.

When you run your program, it will appear to do nothing. But if you wrote it correctly,
it should have created a file in your home directory called "letter.txt"  which you can then view using a text editor.
 */
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class LetterRevisited
{
        public static void main(String[] args) throws IOException {


            File letter = new File("letter.txt");
            FileWriter fileWriter = new FileWriter(letter);
            PrintWriter printWriter = new PrintWriter(fileWriter);

            printWriter.println("+---------------------------------------+");
            printWriter.println("|                                       |");
            printWriter.println("|                                   ####|");
            printWriter.println("|                                   ####|");
            printWriter.println("|                                   ####|");
            printWriter.println("|                                       |");
            printWriter.println("|                                       |");
            printWriter.println("|                                       |");
            printWriter.println("|                    Volodymyr Artyukh  |");
            printWriter.println("|                    1 River str.       |");
            printWriter.println("|                                       |");
            printWriter.println("|                                       |");
            printWriter.println("+---------------------------------------|");
            printWriter.close();
        }
}
