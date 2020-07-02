package chapter11.NestingLoops;

/*
In programming, the term "nested" usually means to put something inside the same thing.
"Nested loops" would be two loops with one inside the other one.
If you do it right, then means the inner loop will repeat all its iterations every time the outer loop does one more iteration.

Start by downloading the following code, and get it to compile.
 */
public class NestingLoops
{
    public static void main( String[] args )
    {
        // this is #1 - I'll call it "CN"
        for ( char c='A'; c <= 'E'; c++ )
        {
            for ( int n=1; n <= 3; n++ )
            {
                System.out.println( n + " " + c );
            }
        }

        System.out.println("\n");

        // this is #2 - I'll call it "AB"
        for ( int a=1; a <= 3; a++ )
        {
            for ( int b=1; b <= 3; b++ )
            {
                System.out.print( a + "-" + b + " " );
            }
            System.out.println();
        }

        System.out.println("\n");

    }
}
