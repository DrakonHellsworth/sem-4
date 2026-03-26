//Design a Java program to demonstrate method overriding using the super keyword.  Create base class Vehicle and subclass Car where overridden method calls parent method.
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
        super.display();
        System.out.println("This is a car.");
    }
}
public class exe6_8
{
    public static void main(String[] args)
    {
        Car c=new Car();
        c.display();
    }
}
//Observation: In the above code, we have a superclass Vehicle with a method display() that prints "This is a vehicle." The subclass Car extends Vehicle and overrides the display() method to first call the parent method using super.display(), which outputs "This is a vehicle." Then it prints "This is a car." In the main method, we create an instance of Car and call the display() method, which demonstrates method overriding and the use of the super keyword to call the parent class method in Java.