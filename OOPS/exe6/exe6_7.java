//Write a Java program to demonstrate dynamic method dispatch using user input. Create base class Shape and subclasses Circle and Square.
import java.util.Scanner;
class Shape
{    void area()
    {
        System.out.println("Area of shape");
    }
}
class Circle extends Shape
{    void area()
    {
        System.out.println("Area of circle");
    }
}
class Square extends Shape
{    void area()
    {
        System.out.println("Area of square");
    }
}
public class exe6_7
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter shape (circle/square): ");
        String shape=sc.nextLine();
        Shape s;
        if(shape.equalsIgnoreCase("circle"))
        {
            s=new Circle();
            s.area();
        }
        else if(shape.equalsIgnoreCase("square"))
        {
            s=new Square();
            s.area();
        }
        else
        {
            System.out.println("Invalid shape");
        }
    }
}
//Observation: In the above code, we have a superclass Shape with a method area() that prints "Area of shape." The subclasses Circle and Square extend Shape and override the area() method to print "Area of circle" and "Area of square" respectively. In the main method, we take user input to determine which shape's area method to call. Based on the user's input, we create an instance of either Circle or Square and call the area() method, demonstrating dynamic method dispatch in Java. If the user enters "circle", it will output "Area of circle". If the user enters "square", it will output "Area of square". If the user enters an invalid shape, it will output "Invalid shape". This shows how the method that gets called is determined at runtime based on the object type created from user input.