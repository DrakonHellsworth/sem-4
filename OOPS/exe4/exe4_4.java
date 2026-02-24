//Write a program to extract and print each digit of a number using only arithmetic operators.
import java.util.Scanner;
class extract
{
    void extract(int num)
    {
        System.out.println("Digits of the number:");
        while(num>0)
        {
            int d=num%10;
            System.out.println(d);
            num=num/10;
        }
    }
}
public class exe4_4
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        extract ex=new extract();
        ex.extract(num);
    }
}
//Observation: The program uses arithmetic operators to extract and print each digit of a number. The modulus operator (%) is used to get the last digit of the number, and the division operator (/) is used to remove the last digit from the number. This process continues until all digits have been extracted and printed.