//Write a Java program to demonstrate single inheritance using class Person and subclass Student Override a method display() in the subclass
class Person
{
    void display()
    {
        System.out.println("This is a person.");
    }
}
class Student extends Person
{
    void display()
    {
        System.out.println("This is a student.");
    }
}
public class exe6_1
{
    public static void main(String[] args)
    {
        Person p=new Person();
        p.display();
        Student s=new Student();
        s.display();
    }
}
//Observation: In the above code, we have a superclass Person with a method display() that prints "This is a person." The subclass Student extends Person and overrides the display() method to print "This is a student." In the main method, we create an instance of Person and call the display() method, which outputs "This is a person." Then we create an instance of Student and call the display() method, which outputs "This is a student." This demonstrates single inheritance and method overriding in Java.