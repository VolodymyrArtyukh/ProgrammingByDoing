package chapter6;

import java.util.Random;

public class FortuneCookie
{
    public static void main(String[] args)
    {
        Random randomNumber = new Random();

        int myRandomNumber = 1 + randomNumber.nextInt(54);

        String lotto = "";

        if (myRandomNumber == 4)
            lotto = "you won that";
        if (myRandomNumber == 23)
            lotto = "How about that";
        if (myRandomNumber == 35)
            lotto = "You won";
        if (myRandomNumber == 8)
            lotto = "you won that";
        if (myRandomNumber == 39)
            lotto = "How about that";
        if (myRandomNumber == 51)
            lotto = "You won";



        System.out.println("You got: " + myRandomNumber + lotto);

    }
}
