//Develop a Java program to implement runtime polymorphism using class Shape and subclass Circle. Override the method area().
class Shape
{
    void area()
    {
        System.out.println("Area of shape");
    }
}
class Circle extends Shape
{
    void area()
    {
        System.out.println("Area of circle");
    }
}
public class exe6_2
{
    public static void main(String[] args)
    {
        Shape s=new Shape();
        s.area();
        Circle c=new Circle();
        c.area();
    }
}
//Observation: In the above code, we have a superclass Shape with a method area() that prints "Area of shape." The subclass Circle extends Shape and overrides the area() method to print "Area of circle." In the main method, we create an instance of Shape and call the area() method, which outputs "Area of shape." Then we create an instance of Circle and call the area() method, which outputs "Area of circle." This demonstrates runtime polymorphism and method overriding in Java as the method that gets called is determined at runtime based on the object type.