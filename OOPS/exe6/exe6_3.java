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