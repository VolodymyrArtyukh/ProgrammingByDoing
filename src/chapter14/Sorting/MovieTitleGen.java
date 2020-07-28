package chapter14.Sorting;

import java.net.URL;
import java.util.Scanner;

/*
Download the following code, and get it to compile.
It fills up an array with a bunch of random adjectives and another array with a bunch of random nouns.

It is intended to create a random movie title by picking a random adjective and noun out of the arrays.
 */
public class MovieTitleGen
{
    public static void main(String[] args) throws Exception
    {

        String[] adjectives = arrayFromUrl("http://cs.leanderisd.org/txt/adjectives.txt");
        String[] nouns      = arrayFromUrl("http://cs.leanderisd.org/txt/nouns.txt");

        System.out.println("Mitchell's Random Movie Title Generator\n");

        System.out.print("Choosing randomly from " + adjectives.length + " adjectives ");
        System.out.println("and " + nouns.length + " nouns (" + (adjectives.length*nouns.length) + " combinations).");

        String adjective = "Cool";
        String noun = "Mitchell";

        System.out.println( "Your movie title is: " + adjective + " " + noun );
    }

    /**
     *	@param url - the URL to read words from
     *	@return An array of words, initialized from the given URL
     */
    public static String[] arrayFromUrl( String url ) throws Exception
    {
        Scanner fin = new Scanner((new URL(url)).openStream());
        int count = fin.nextInt();

        String[] words = new String[count];

        for ( int i=0; i<words.length; i++ )
        {
            words[i] = fin.next();
        }
        fin.close();

        return words;
    }
}
