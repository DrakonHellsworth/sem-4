//Write a Java program to demonstrate interface-based runtime polymorphism using Payment interface and classes CreditCard and UPI
import java.util.Scanner;
interface Payment
{
    void pay(double amount);
}
class CreditCard implements Payment
{
    public void pay(double amount)
    {
        System.out.println("Paid "+amount+" using Credit Card.");
    }
}
class UPI implements Payment
{
    public void pay(double amount)
    {
        System.out.println("Paid "+amount+" using UPI.");
    }
}
public class exe6_12
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter payment method (credit/upi): ");
        String method=sc.nextLine();
        System.out.print("Enter amount to pay: ");
        double amount=sc.nextDouble();
        Payment payment;
        if(method.equalsIgnoreCase("credit"))
        {
            payment=new CreditCard();
            payment.pay(amount);
        }
        else if(method.equalsIgnoreCase("upi"))
        {
            payment=new UPI();
            payment.pay(amount);
        }
        else
        {
            System.out.println("Invalid payment method");
        }
    }
}
//Observation: In the above code, we have an interface Payment with a method pay(). The classes CreditCard and UPI implement the Payment interface and provide their own implementation of the pay() method. In the main method, we take user input to determine which payment method to use and the amount to pay. Based on the user's input, we create an instance of either CreditCard or UPI using Payment references and call the pay() method, demonstrating interface-based runtime polymorphism in Java with user input.