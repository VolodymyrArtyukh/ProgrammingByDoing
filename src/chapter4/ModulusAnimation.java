package chapter4;

public class ModulusAnimation
{
    public static void main( String[] args ) throws Exception
    {
        for ( int i=2; i<=2; i++ )
        {
            if ( i%2 == 0 )
                System.out.print("who \r");
            else if (i%4 == 0)
                System.out.println("let");
            else if (i%6==2)
                System.out.println("the");
            else if (i%8==3)
                System.out.println("dogs");
            else if (i%10 == 4)
                System.out.println("out!!??");

            Thread.sleep(200);
        }

    }
}
