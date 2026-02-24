//Write a program to demonstrate bitwise operations ( &, |, ^, ~, ≪, ≫ ) on two integers.
import java.util.Scanner;
class bitwise
{
    void opr(int a,int b)
    {
        System.out.println("Bitwise AND (a&b): "+(a&b));
        System.out.println("Bitwise OR (a|b): "+(a|b));
        System.out.println("Bitwise XOR (a^b): "+(a^b));
        System.out.println("Bitwise NOT (~a): "+(~a));
        System.out.println("Bitwise NOT (~b): "+(~b));
        System.out.println("Left Shift (a<<1): "+(a<<1));
        System.out.println("Right Shift (b>>1): "+(b>>1));
    }
}
public class exe4_9
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1=sc.nextInt();
        System.out.print("Enter second number: ");
        int num2=sc.nextInt();
        bitwise bw=new bitwise();
        bw.opr(num1,num2);
    }
}
//Observation: The program demonstrates bitwise operations on two integers. The output displays the results of various bitwise operations such as AND, OR, XOR, NOT, Left Shift, and Right Shift. Each operation is performed on the two input integers, and the results are printed to the console. This allows the user to understand how bitwise operators work in Java.