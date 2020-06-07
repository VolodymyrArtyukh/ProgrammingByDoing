package chapter2;

public class MoreVariablesAndPrinting
{
    public static void main(String[] args)
    {
        String Name, Eyes, Teeth, Hair;
        int Age;
        double Weight, Height, kg_weight, cm_height;

        Name = "Volodymyr Artyukh";
        Age = 27;     // not a lie
        Height = 74;  // inches
        Weight = 80; // kg
        Eyes = "Blue";
        Teeth = "White";
        Hair = "blond";
        kg_weight = Weight / 2.205;
        cm_height = Height * 2.54;

        System.out.println( "Let's talk about " + Name + "." );
        System.out.println( "He's " + Height + " inches tall." );
        System.out.println( "He's " + Weight + " kg heavy." );
        System.out.println( "Actually, that's not too heavy." );
        System.out.println( "He's got " + Eyes + " eyes and " + Hair + " hair." );
        System.out.println( "His teeth are usually " + Teeth + " depending on the coffee." );

        // This line is tricky; try to get it exactly right.
        System.out.println( "If I add " + Age + ", " + Height + ", and " + Weight
                + " I get " + (Age + cm_height + kg_weight) + "." );
    }
}
