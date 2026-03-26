// Implement a Java program to demonstrate method overriding using class Bank and subclasses SBI and HDFC to compute interest rates
import java.util.Scanner;
class Bank
{
    double p,si,r,t;
    Bank(double p,double si,double t)
    {
        this.p=p;
        this.si=si;
        this.t=t;
        r=(si*100)/(p*t);
    }
    void interest()
    {
        System.out.println("Interest rate of bank is:"+r+"% for time: "+t+" years");
    }
}
class SBI extends Bank
{
    SBI(double p,double si)
    {
        super(p,si,3.2);
    }
    void interest()
    {
        System.out.println("Interest rate of SBI is: "+r+"% for time: "+t+" years");
    }
}
class HDFC extends Bank
{
    HDFC(double p,double si)
    {
        super(p,si,5.6);
    }
    void interest()
    {
        System.out.println("Interest rate of HDFC is: "+r+"% for time: "+t+" years");
    }
}
public class exe6_4
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter principal amount: ");
        double p=sc.nextDouble();
        System.out.print("Enter simple interest: ");
        double si=sc.nextDouble();
        Bank b=new Bank(p,si,2);
        b.interest();
        SBI s=new SBI(p,si);
        s.interest();
        HDFC h=new HDFC(p,si);
        h.interest();
    }
}
// Observation: In the above code, we have a superclass Bank with a constructor that calculates the interest rate based on the principal amount (p) and simple interest (si) taken as user input. The subclasses SBI and HDFC extend Bank and override the interest() method to display the interest rates specific to each bank using their fixed time values (3.2 and 5.6 respectively). In the main method, we take p and si from the user via Scanner, create instances of Bank, SBI, and HDFC with those values, and call their interest() methods. This demonstrates method overriding in Java with dynamic user input.