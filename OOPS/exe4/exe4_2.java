//Write a program to swap two numbers without using a third variable.
import java.util.Scanner;
class swap
{
    void swap(int a,int b)
    {
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swapping:");
        System.out.println("First number: "+a);
        System.out.println("Second number: "+b);
    }
}
class exe4_2
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1=sc.nextInt();
        System.out.print("Enter second number: ");
        int num2=sc.nextInt();
        swap sw=new swap();
        sw.swap(num1,num2);
    }
}
//Observation: The program uses arithmetic operations to swap two numbers without using a third variable. The first step adds the two numbers and stores the result in 'a'. The second step subtracts 'b' from 'a' to get the original value of 'a' and stores it in 'b'. The third step subtracts the new value of 'b' from 'a' to get the original value of 'b' and stores it in 'a'. The final step prints the swapped numbers.