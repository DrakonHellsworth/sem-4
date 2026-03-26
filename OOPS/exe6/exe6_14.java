// Design an abstract class Bank with method getInterestRate(). Implement subclasses SBI, HDFC, and ICICI. Demonstrate runtime polymorphism using array of objects.
import java.util.Scanner;
abstract class Bank
{
    double p,si,r,t;
    Bank(double p,double si,double t)
    {
        this.p=p;
        this.si=si;
        this.t=t;
        r=(si*100)/(p*t);
    }
    abstract void getInterestRate();
}
class SBI extends Bank
{
    SBI(double p,double si)
    {
        super(p,si,3.2);
    }
    public void getInterestRate()
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
    public void getInterestRate()
    {
        System.out.println("Interest rate of HDFC is: "+r+"% for time: "+t+" years");
    }
}
class ICICI extends Bank
{
    ICICI(double p,double si)
    {
        super(p,si,4.1);
    }
    public void getInterestRate()
    {
        System.out.println("Interest rate of ICICI is: "+r+"% for time: "+t+" years");
    }
}
public class exe6_14
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter principal amount: ");
        double p=sc.nextDouble();
        System.out.print("Enter simple interest: ");
        double si=sc.nextDouble();
        Bank b[]=new Bank[3];
        b[0]=new SBI(p,si);
        b[1]=new HDFC(p,si);
        b[2]=new ICICI(p,si);
        for(int i=0;i<b.length;i++)
        {
            b[i].getInterestRate();
        }
    }
}
// Observation: In the above code, we have an abstract class Bank with a constructor that calculates the interest rate based on user input principal amount (p) and simple interest (si). The subclasses SBI, HDFC, and ICICI extend Bank and override getInterestRate() to display their respective interest rates using fixed time values of 3.2, 5.6, and 4.1 years. In the main method, we take p and si from the user via Scanner, create an array of Bank references holding SBI, HDFC, and ICICI objects, and iterate over it calling getInterestRate() on each element. This demonstrates runtime polymorphism as the correct overridden method is called based on the actual object type at runtime.