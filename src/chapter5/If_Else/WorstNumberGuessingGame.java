package chapter5.If_Else;
/*
Write a program that plays an incredibly stupid number-guessing game.
The user will get one try to guess the secret number.
Tell them if they got it right or wrong, and if they got it wrong, display what the secret number was.

You must store the secret number in a variable, and use that variable throughout.
The secret number itself must not appear in the program at all, except in the one line where you store it into a variable.

 */
import java.util.Scanner;

public class WorstNumberGuessingGame
{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int magicNumber = 4;

        System.out.println("THE WORST NUMBER GUESSING GAME EVER!!!!!!");

        System.out.println("\r\nI'M THINKING OF A NUMBER FROM 1-10. TRY TO GUESS! ");
        int answer = keyboard.nextInt();

        if(answer == magicNumber){
            System.out.print("LOL!!! YOU GOT IT! I CAN'T BELIEVE YOU GUESSED IT WAS "+magicNumber);
        }else System.out.println("SORRY, THE NUMBER WAS "+magicNumber+'!');
    }

}
