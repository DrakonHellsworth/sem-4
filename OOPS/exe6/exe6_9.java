// Create an abstract class Employee with abstract method calculateSalary(). Implement subclasses Manager and Developer and override the method.
import java.util.Scanner;
abstract class Employee
{
    abstract double calculateSalary();
}
class Manager extends Employee
{
    double baseSalary;
    Manager(double baseSalary)
    {
        this.baseSalary=baseSalary;
    }
    double calculateSalary()
    {
        return baseSalary+5000;
    }
}
class Developer extends Employee
{
    double baseSalary;
    Developer(double baseSalary)
    {
        this.baseSalary=baseSalary;
    }
    double calculateSalary()
    {
        return baseSalary+3000;
    }
}
public class exe6_9
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter manager base salary: ");
        double ms=sc.nextDouble();
        System.out.print("Enter developer base salary: ");
        double ds=sc.nextDouble();
        Employee manager=new Manager(ms);
        Employee developer=new Developer(ds);
        System.out.println("Manager Salary: "+manager.calculateSalary());
        System.out.println("Developer Salary: "+developer.calculateSalary());
    }
}
// Observation: In the above code, we have an abstract class Employee with an abstract method calculateSalary(). The subclasses Manager and Developer extend Employee and override calculateSalary() to return the base salary plus their respective bonuses of 5000 and 3000. In the main method, base salaries are taken as user input via Scanner, and Employee references are used to hold Manager and Developer objects, demonstrating runtime polymorphism along with abstract classes.