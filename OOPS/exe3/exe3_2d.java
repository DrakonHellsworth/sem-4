//using scanner class,Read an integer and check whether it is even or odd.
import java.util.*;
class exe3_2d
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num=sc.nextInt();
        if(num%2==0)
        {
            System.out.println(num+" is even.");
        }
        else
        {
            System.out.println(num+" is odd.");
        }
    }
}
//Observation: The program uses the Scanner class to read an integer from the user input. It then checks if the number is even or odd by using the modulus operator (%) to determine if the number is divisible by 2. The result is displayed to the user as output using System.out.println().