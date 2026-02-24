//Without using arithmetic operators (+, −,∗,/), write a program to add two integers.
import java.util.Scanner;
class add
{
    int add(int a,int b)
    {
        while(b!=0)
        {
            int carry=a&b;
            a=a^b;
            b=carry<<1;
        }
        return a;
    }
}
public class exe4_1 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1=sc.nextInt();
        System.out.print("Enter second number: ");
        int num2=sc.nextInt();
        add ad=new add();
        int result=ad.add(num1,num2);
        System.out.println("Sum of "+num1+" and "+num2+" is "+result);
    }
}
//Observation: The program uses bitwise operators to perform addition without using arithmetic operators. The carry is calculated using the AND operator, and the sum is calculated using the XOR operator. The process continues until there are no more carries left to add.