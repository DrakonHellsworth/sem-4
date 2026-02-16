//using scanner class,Read N numbers and find their average.
import java.util.*;
class exe3_2e
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n=sc.nextInt();
        double sum=0;
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter number "+(i+1)+": ");
            sum+=sc.nextDouble();
        }
        double average=sum/n;
        System.out.println("The average is: "+average);
    }
}
