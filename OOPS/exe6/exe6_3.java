//Write a Java program to demonstrate hierarchical inheritance using class Vehicle and subclasses Car and Bike.
class Vehicle
{
    void display()
    {
        System.out.println("This is a vehicle.");
    }
}
class Car extends Vehicle
{
    void display()
    {
        System.out.println("This is a car.");
    }
}
class Bike extends Vehicle
{
    void display()
    {
        System.out.println("This is a bike.");
    }
}
public class exe6_3
{
    public static void main(String[] args)
    {
        Vehicle v=new Vehicle();
        v.display();
        Car c=new Car();
        c.display();
        Bike b=new Bike();
        b.display();
    }
}
//Observation: In the above code, we have a superclass Vehicle with a method display() that prints "This is a vehicle." The subclasses Car and Bike extend Vehicle and override the display() method to print "This is a car." and "This is a bike." respectively. In the main method, we create an instance of Vehicle and call the display() method, which outputs "This is a vehicle." Then we create an instance of Car and call the display() method, which outputs "This is a car." Finally, we create an instance of Bike and call the display() method, which outputs "This is a bike." This demonstrates hierarchical inheritance in Java as both Car and Bike inherit from the same superclass Vehicle.