//Write a program to compute the sum of digits of a number without using loops (use arithmetic operators only).
import java.util.Scanner;
class sum
{
    int compute(int num)
    {
        if(num==0)
        {
            return 0;
        }
        int d=num%10;
        num=num/10;
        int sum=d+compute(num);
        return sum;
    }
}
public class exe4_10
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        sum s=new sum();
        System.out.print("Digits of the number: ");
        int sum=s.compute(num);
        System.out.println("Sum of digits is "+sum);
    }
}
//Observation: The program computes the sum of digits of a number without using loops by using recursion. The modulus operator (%) is used to get the last digit of the number, and the division operator (/) is used to remove the last digit from the number. The recursive function continues until the number becomes 0, at which point it prints the sum of the digits.