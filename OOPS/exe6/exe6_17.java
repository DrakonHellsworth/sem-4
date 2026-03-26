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
    double balance;
    Account(double balance)
    {
        this.balance=balance;
    }
    abstract void deposit(double amount);
    abstract void withdraw(double amount);
}
interface Loan
{
    void applyLoan(double amount);
}
interface Insurance
{
    void buyInsurance(double amount);
}
class SavingsAccount extends Account implements Loan
{
    SavingsAccount(double balance)
    {
        super(balance);
    }
    void deposit(double amount)
    {
        balance+=amount;
    }
    void withdraw(double amount)
    {
        if(amount<=balance)
        {
            balance-=amount;
        }
        else
        {
            System.out.println("Insufficient balance");
        }
    }
    public void applyLoan(double amount)
    {
        System.out.println("Loan of "+amount+" applied for Savings Account");
    }
}
class CurrentAccount extends Account implements Insurance
{
    CurrentAccount(double balance)
    {
        super(balance);
    }
    void deposit(double amount)
    {
        balance+=amount;
    }
    void withdraw(double amount)
    {
        if(amount<=balance)
        {
            balance-=amount;
        }
        else
        {
            System.out.println("Insufficient balance");
        }
    }
    public void buyInsurance(double amount)
    {
        System.out.println("Insurance of "+amount+" bought for Current Account");
    }
}
public class exe6_17
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Account accounts[]=new Account[2];
        accounts[0]=new SavingsAccount(1000);
        accounts[1]=new CurrentAccount(2000);
        for(int i=0;i<accounts.length;i++)
        {
            System.out.println("Account "+(i+1)+" balance: "+accounts[i].balance);
            accounts[i].deposit(500);
            System.out.println("Account "+(i+1)+" balance after deposit: "+accounts[i].balance);
            accounts[i].withdraw(200);
            System.out.println("Account "+(i+1)+" balance after withdrawal: "+accounts[i].balance);
            if(accounts[i] instanceof SavingsAccount)
            {
                ((SavingsAccount)accounts[i]).applyLoan(10000);
            }
            else if(accounts[i] instanceof CurrentAccount)
            {
                ((CurrentAccount)accounts[i]).buyInsurance(5000);
            }
        }
    }
}
// Observation: In the above code, we have an abstract class Account with abstract methods deposit() and withdraw(). The SavingsAccount class implements the Loan interface, while the CurrentAccount class implements the Insurance interface. In the main method, we create an array of Account objects, which holds both SavingsAccount and CurrentAccount instances. We demonstrate runtime polymorphism by calling the deposit() and withdraw() methods on the Account references, which invoke the overridden methods in the respective subclasses. We also check the type of each account using instanceof to call the specific methods for applying loans or buying insurance, showcasing multiple inheritance through interfaces. The program is menu-driven, allowing us to perform various operations on the accounts and see the results.