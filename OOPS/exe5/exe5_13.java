// Overload a method to calculate volume of cube and cylinder.
import java.util.*;
class Volume
{
    double volume(double a)
    {
        return a*a*a;
    }
    double volume(double r,double h)
    {
        return 3.14*r*r*h;
    }
}
public class exe5_13
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Volume obj=new Volume();
        System.out.println("Enter side of cube: ");
        double a=sc.nextDouble();
        System.out.println("Volume of cube: "+obj.volume(a));
        System.out.println("Enter radius and height of cylinder: ");
        double r=sc.nextDouble();
        double h=sc.nextDouble();
        System.out.println("Volume of cylinder: "+obj.volume(r,h));
    }
}