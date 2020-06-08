package chapter2.Variables;
/*
You can print things out with System.out.println and you can do math.
The next step is to learn about variables.
In programming a variable is nothing more than a name for something so you can use the name rather than the something
as you code.
Programmers use these variable names to make their code read more like English,
and because programmers have a lousy ability to remember things.
If they didn't use good names for things in their software they'd get lost when they came back and
tried to read their code again.


 */
public class VariablesAndNames
{
    public static void main(String[] args)
    {
        int cars, drivers, passengers, cars_not_driven, space_in_a_car,cars_driven, carpool_capacity;
        double  average_passengers_per_car;

        cars = 100;
        space_in_a_car = 4;
        drivers = 30;
        passengers = 90;
        cars_not_driven = cars - drivers;
        cars_driven = drivers;
        carpool_capacity = cars_driven * space_in_a_car;
        average_passengers_per_car = passengers / cars_driven;


        System.out.println( "There are " + cars + " cars available." );
        System.out.println( "There are only " + drivers + " drivers available." );
        System.out.println( "There will be " + cars_not_driven + " empty cars today." );
        System.out.println( "We can transport " + carpool_capacity + " people today." );
        System.out.println( "We have " + passengers + " to carpool today." );
        System.out.println( "We need to put about " + average_passengers_per_car + " in each car." );
    }
}
