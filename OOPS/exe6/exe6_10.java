// Design an interface Shape with method area(). Implement classes Circle, Rectangle, and Triangle.
import java.util.Scanner;
interface Shape
{
    double area();
}
class Circle implements Shape
{
    double radius;
    Circle(double radius)
    {
        this.radius=radius;
    }
    public double area()
    {
        return Math.PI*radius*radius;
    }
}
class Rectangle implements Shape
{
    double length,width;
    Rectangle(double length,double width)
    {
        this.length=length;
        this.width=width;
    }
    public double area()
    {
        return length*width;
    }
}
class Triangle implements Shape
{
    double base,height;
    Triangle(double base,double height)
    {
        this.base=base;
        this.height=height;
    }
    public double area()
    {
        return 0.5*base*height;
    }
}
public class exe6_10
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        double r=sc.nextDouble();
        System.out.print("Enter length and width of rectangle: ");
        double l=sc.nextDouble();
        double w=sc.nextDouble();
        System.out.print("Enter base and height of triangle: ");
        double b=sc.nextDouble();
        double h=sc.nextDouble();
        Shape circle=new Circle(r);
        Shape rectangle=new Rectangle(l,w);
        Shape triangle=new Triangle(b,h);
        System.out.println("Area of Circle: "+circle.area());
        System.out.println("Area of Rectangle: "+rectangle.area());
        System.out.println("Area of Triangle: "+triangle.area());
    }
}
// Observation: In the above code, we have an interface Shape with a method area(). The classes Circle, Rectangle, and Triangle implement the Shape interface and provide their own implementation of the area() method. In the main method, we take user input for the dimensions of each shape and create instances of Circle, Rectangle, and Triangle using Shape references. We then call the area() method on each shape, demonstrating polymorphism through interfaces. Each shape calculates its area based on its specific formula, and the results are printed to the console.