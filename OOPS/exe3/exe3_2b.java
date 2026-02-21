//using scanner class,Read radius of a circle and calculate area and circumference.
import java.util.*;
class exe3_2b
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter radius of the circle: ");
        double r=sc.nextDouble();
        double a=Math.PI*r*r;
        double c=2*Math.PI*r;
        System.out.println("Area of the circle: "+a);
        System.out.println("Circumference of the circle: "+c);
    }
}
//Observation: The program uses the Scanner class to read the radius of a circle from the user input. It then calculates the area using the formula A = πr^2 and the circumference using the formula C = 2πr. Finally, it displays the calculated area and circumference to the user as output using System.out.println().