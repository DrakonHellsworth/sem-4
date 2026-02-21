//using scanner class,Read two floating point numbers and print their product.
import java.util.*;
class exe3_2c
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first floating point number: ");
        double num1=sc.nextDouble();
        System.out.print("Enter second floating point number: ");
        double num2=sc.nextDouble();
        double p=num1*num2;
        System.out.println("The product of "+num1+" and "+num2+" is: "+p);
    }
}
//Observation: The program uses the Scanner class to read two floating point numbers from the user input. It then calculates their product by multiplying the two numbers and displays the result to the user as output using System.out.println().