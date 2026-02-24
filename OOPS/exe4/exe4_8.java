//Write a program to check whether a number is a power of 2 using bitwise operators.
import java.util.Scanner;
public class exe4_8 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        int r=num&(num-1);
        if(r==0)
        {
            System.out.println(num+" is a power of 2.");
        }
        else
        {
            System.out.println(num+" is not a power of 2.");
        }
    }
}
//Observation: The program checks whether a number is a power of 2 by using bitwise operators. A number that is a power of 2 has only one bit set in its binary representation. By performing a bitwise AND operation between the number and one less than the number, we can determine if it is a power of 2. If the result is 0, it means that the number is a power of 2; otherwise, it is not. 