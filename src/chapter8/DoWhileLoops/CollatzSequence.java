package chapter8.DoWhileLoops;
/*
Take any natural number n.

If n is even, divide it by 2 to get n / 2.
If n is odd, multiply it by 3 and add 1 to get 3n + 1.
Repeat the process indefinitely.
In 1937, Lothar Collatz proposed that no matter what number you begin with, the sequence eventually reaches 1.
This is widely believed to be true, but has never been formally proved.

Write a program that inputs a number from the user, and then displays the Collatz Sequence starting from that number.
Stop when you reach 1
 */

import java.util.Scanner;

public class CollatzSequence
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Starting number: ");
        int start = keyboard.nextInt();
        int count = 0;
        int max=0;
        max=start;
        System.out.print(start+"	");
        while(start!=1){
            if(start%2==0){
                start=start/2;
            }else{
                start= 3*start+1;
            }
            System.out.print(start+"	");
            count++;
            if(start>max){
                max = start;
            }

        }
        System.out.println();
        System.out.println();
        System.out.println("The largest value was "+max+".");
        System.out.println("Terminated after "+count+" steps.");


    }
}
