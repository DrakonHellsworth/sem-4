//Create an abstract class Vehicle with abstract method start() and Implement subclasses Car and Bike demonstrating runtime polymorphism
import java.util.Scanner;
abstract class Vehicle
{
    abstract void start();
}
class Car extends Vehicle
{    void start()
    {
        System.out.println("Car is starting with a key.");
    }
}
class Bike extends Vehicle
{
    void start()
    {
        System.out.println("Bike is starting with a button.");
    }
}
public class exe6_11
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter vehicle (car/bike): ");
        String vehicle=sc.nextLine();
        Vehicle v;
        if(vehicle.equalsIgnoreCase("car"))
        {
            v=new Car();
            v.start();
        }
        else if(vehicle.equalsIgnoreCase("bike"))
        {
            v=new Bike();
            v.start();
        }
        else
        {
            System.out.println("Invalid vehicle");
        }
    }
}
//Observation: In the above code, we have an abstract class Vehicle with an abstract method start(). The subclasses Car and Bike extend Vehicle and override the start() method to print a specific message for each vehicle. In the main method, we take user input to determine which vehicle's start method to call. Based on the user's input, we create an instance of either Car or Bike and call the start() method, demonstrating runtime polymorphism in Java with user input