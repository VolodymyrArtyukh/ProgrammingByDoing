package chapter12.IO;
/*
Start by creating a text file in Notepad (or Textpad) containing your first and last name, separated by whitespace.
Save it as "name.txt".

Then write a program that opens that file and displays the two names on the screen, with no input from the keyboard.

Then try changing the name in the file, saving it again, and running the program again with no changes
 to confirm that it works.
 */
import java.io.*;

public class SimpleFileInput
{
    public static void main(String[] args) throws IOException
    {
        File file = new File("/Users/volodymyr/IdeaProjects/ProgrammingByDoing/name.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;
        System.out.println("Read text file using InputStreamReader");
        while((line = bufferedReader.readLine()) != null)
        {
            //process the line
            System.out.println(line);
        }
        bufferedReader.close();
    }
}
