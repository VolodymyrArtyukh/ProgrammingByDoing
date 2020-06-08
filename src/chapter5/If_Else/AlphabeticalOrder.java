package chapter5.If_Else;
/*
Make a program that asks for the last name of the user.
Depending on their last name, make a statement about how long they have to wait during roll call.
You need to use else ifs to make sure only one statement gets printed.

Once you understand how compareTo() works, this is a pretty straightforward assignment,
much like How Old Are You, specifically, except that it uses Strings instead of ints and so you must use the compareTo() method.

name is "Carswell" or before: say "you don't have to wait long"
name is "Jones" or before: say "that's not bad"
name is "Smith" or before: say "looks like a bit of a wait"
name is "Young" or before: say "it's gonna be a while"
name is after "Young": say "not going anywhere for a while?"

 */
import java.util.Scanner;

public class AlphabeticalOrder
{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("What\'s your last name? ");
        String lname=keyboard.next();
        if(lname.compareTo("Carswell")<=0)
        {
            System.out.println("You don\'t have to wait long, "+lname);
        }
        else if(lname.compareTo("Jones")<=0)
        {
            System.out.println("That\'s not bad, "+lname);
        }
        else if(lname.compareTo("Smith")<=0)
        {
            System.out.println("Looks like a bit of wait, "+lname);
        }
        else if(lname.compareTo("Young")<=0)
        {
            System.out.println("It\'s gonna be a while, "+lname);
        }
        else if(lname.compareTo("Young")>=0)
        {
            System.out.println("Not going anywhere for a while? "+lname);
        }
        else{
            System.out.println("error");
        }
    }
}
