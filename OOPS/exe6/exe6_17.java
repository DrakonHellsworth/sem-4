//Design a Bank Transaction System:
// Abstract class → Account
// Interfaces → Loan, Insurance
// Classes → SavingsAccount, CurrentAccount
// The program should demonstrate:
// Multiple inheritance using interfaces
// Runtime polymorphism
// Array of objects
// Menu-driven execution
import java.util.Scanner;
abstract class Account
{
    double bal;
    Account(double b)
    {
        bal=b;
    }
    abstract void dep(double a);
    abstract void wit(double a);
}
interface Loan
{
    void loan(double a);
}
interface Insurance
{
    void ins(double a);
}
class SavingsAccount extends Account implements Loan
{
    SavingsAccount(double b)
    {
        super(b);
    }
    void dep(double a)
    {
        bal+=a;
    }
    void wit(double a)
    {
        if(a<=bal) bal-=a;
        else System.out.println("Insufficient");
    }
    public void loan(double a)
    {
        System.out.println("Loan "+a+" applied");
    }
}
class CurrentAccount extends Account implements Insurance
{
    CurrentAccount(double b)
    {
        super(b);
    }
    void dep(double a)
    {
        bal+=a;
    }
    void wit(double a)
    {
        if(a<=bal) bal-=a;
        else System.out.println("Insufficient");
    }
    public void ins(double a)
    {
        System.out.println("Insurance "+a+" bought");
    }
}
public class exe6_17
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Account acc[]=new Account[2];
        acc[0]=new SavingsAccount(0);
        acc[1]=new CurrentAccount(0);
        int ch,i;
        double a;
        while(true)
        {
            System.out.println("\n1.Deposit 2.Withdraw 3.Loan 4.Insurance 5.Show 6.Exit");
            System.out.print("Enter choice: ");
            ch=sc.nextInt();
            if(ch==6) break;
            System.out.print("Account (1/2): ");
            i=sc.nextInt()-1;
            if(i<0||i>1)
            {
                System.out.println("Invalid account");
                continue;
            }
            switch(ch)
            {
                case 1:
                    System.out.print("Amount: ");
                    a=sc.nextDouble();
                    acc[i].dep(a);
                    break;
                case 2:
                    System.out.print("Amount: ");
                    a=sc.nextDouble();
                    acc[i].wit(a);
                    break;
                case 3:
                    if(acc[i] instanceof SavingsAccount)
                    {
                        System.out.print("Loan amt: ");
                        a=sc.nextDouble();
                        ((SavingsAccount)acc[i]).loan(a);
                    }
                    else System.out.println("Not allowed");
                    break;
                case 4:
                    if(acc[i] instanceof CurrentAccount)
                    {
                        System.out.print("Insurance amt: ");
                        a=sc.nextDouble();
                        ((CurrentAccount)acc[i]).ins(a);
                    }
                    else System.out.println("Not allowed");
                    break;
                case 5:
                    System.out.println("Balance: "+acc[i].bal);
                    break;
                default:
                    System.out.println("Invalid");
            }
        }
    }
}
//Observation: In the above code, we have an abstract class Account with a constructor that initializes the balance (bal) and abstract methods dep() and wit() for deposit and withdrawal. We have two interfaces, Loan and Insurance, with methods loan() and ins() respectively. The SavingsAccount class extends Account and implements Loan, while the CurrentAccount class extends Account and implements Insurance. In the main method, we create an array of Account objects to hold instances of SavingsAccount and CurrentAccount. We then use a menu-driven approach to perform various operations like deposit, withdraw, apply for a loan, buy insurance, and show balance. This demonstrates multiple inheritance using interfaces, runtime polymorphism through method overriding, and the use of an array of objects to manage different account types in a bank transaction system in Java.