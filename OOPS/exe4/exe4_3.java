//Write a program to check whether a given integer will overflow when multiplied by 2 (use data type limits).
import java.util.Scanner;
class overflow
{
    void checkOverflow(int num)
    {
        if(num>Integer.MAX_VALUE/2||num<Integer.MIN_VALUE/2)
        {
            System.out.println("Overflow will occur when "+num+" is multiplied by 2.");
        }
        else
        {
            System.out.println("No overflow will occur when "+num+" is multiplied by 2.");
        }
    }
}
public class exe4_3
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num=sc.nextInt();
        overflow of=new overflow();
        of.checkOverflow(num);
    }
}
//Observation: The program checks whether the given integer will overflow when multiplied by 2 by comparing it to the maximum and minimum limits of the integer data type. If the number is greater than half of the maximum value or less than half of the minimum value, it indicates that multiplying by 2 will cause an overflow. Otherwise, it indicates that no overflow will occur.