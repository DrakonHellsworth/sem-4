//Write a program to compute compound interest using appropriate data types and arithmetic operators.
import java.util.Scanner;
class compound
{
    void compute(int p,double r,int t)
    {        double ci=p*Math.pow(1+(r/100.0),t)-p;
        System.out.println("Compound Interest is "+ci);
    }
}
public class exe4_7
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter principal amount: ");
        int principal=sc.nextInt();
        System.out.print("Enter rate of interest: ");
        double rate=sc.nextDouble();
        System.out.print("Enter time in years: ");
        int time=sc.nextInt();
        compound comp=new compound();
        comp.compute(principal,rate,time);
    }
}
//Observation: The program calculates the compound interest based on the principal amount, rate of interest, and time period provided by the user. It uses the formula for compound interest and demonstrates the use of appropriate data types and arithmetic operators to compute the result.