//Write a Java program to demonstrate multilevel inheritance using classes Employee → Manager → Director.
class Employee
{
    void display()
    {
        System.out.println("This is an employee.");
    }
}
class Manager extends Employee
{
    void display()
    {
        System.out.println("This is a manager.");
    }
}
class Director extends Manager
{
    void display()
    {
        System.out.println("This is a director.");
    }
}
public class exe6_5
{
    public static void main(String[] args)
    {
        Employee e=new Employee();
        e.display();
        Manager m=new Manager();
        m.display();
        Director d=new Director();
        d.display();
    }
}
//Observation: In the above code, we have a superclass Employee with a method display() that prints "This is an employee." The subclass Manager extends Employee and overrides the display() method to print "This is a manager." The subclass Director extends Manager and overrides the display() method to print "This is a director." In the main method, we create an instance of Employee and call the display() method, which outputs "This is an employee." Then we create an instance of Manager and call the display() method, which outputs "This is a manager." Finally, we create an instance of Director and call the display() method, which outputs "This is a director." This demonstrates multilevel inheritance and method overriding in Java.