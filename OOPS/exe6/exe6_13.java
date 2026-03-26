//Create an interface Drawable and demonstrate hierarchical implementation using classes Circle and Square.
import java.util.Scanner;
interface Drawable
{
    void draw();
}
class Circle implements Drawable
{
    public void draw()
    {
        System.out.println("Drawing a Circle.");
    }
}
class Square implements Drawable
{
    public void draw()
    {
        System.out.println("Drawing a Square.");
    }
}
public class exe6_13
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter shape to draw (circle/square): ");
        String shape=sc.nextLine();
        Drawable d;
        if(shape.equalsIgnoreCase("circle"))
        {
            d=new Circle();
            d.draw();
        }
        else if(shape.equalsIgnoreCase("square"))        {
            d=new Square();
            d.draw();
        }
        else
        {
            System.out.println("Invalid shape");
        }
    }
}
//Observation: In the above code, we have an interface Drawable with a method draw(). The classes Circle and Square implement the Drawable interface and provide their own implementation of the draw() method. In the main method, we take user input to determine which shape to draw. Based on the user's input, we create an instance of either Circle or Square using Drawable references and call the draw() method, demonstrating hierarchical implementation of interfaces in Java with user input. Each shape's draw() method prints a specific message to the console, indicating which shape is being drawn.