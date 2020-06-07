package chapter5;

public class Compare
{
    public static void main(String[] args)
    {
        String string_1 = "Hello World!"; //12 symbols
        String string_2 = "Hello"; //5 symbols
        String string_3 = "Hi!"; //3 symbols
        String string_4 = "Henlo";// 5 symbols

        int option_1;
        int option_2;
        int option_3;

        option_1 = string_1.compareTo(string_2);
        option_2 = string_2.compareTo(string_3);
        option_3 = string_3.compareTo(string_4);

        System.out.print("option_1: " + option_1 + "\noption_2: " + option_2 + "\noption_3: " + option_3);


    }
}
