//Write a program to evaluate the expression 𝑎+𝑏∗(𝑐−𝑑)/𝑒 and demonstrate the operator precedence by printing intermediate results.
import java.util.Scanner;
class evaluate
{
    void evaluate(int a,int b,int c,int d,int e)
    {
        int result=(a+b)*(c-d)/e;
        System.out.println("The result is "+result);
    }
}
public class exe4_5
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a=sc.nextInt();
        System.out.print("Enter second number: ");
        int b=sc.nextInt();
        System.out.print("Enter third number: ");
        int c=sc.nextInt();
        System.out.print("Enter fourth number: ");
        int d=sc.nextInt();
        System.out.print("Enter fifth number: ");
        int e=sc.nextInt();
        evaluate ev=new evaluate();
        ev.evaluate(a,b,c,d,e);
    }
}
//Observation: The program evaluates the expression (𝑎+𝑏)∗(𝑐−𝑑)/𝑒 and displays the result.