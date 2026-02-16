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