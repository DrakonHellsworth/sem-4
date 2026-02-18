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
//Observation: The program uses the Scanner class to read the number of elements (N) from the user input. It then uses a for loop to read N numbers from the user, calculating their sum. Finally, it computes the average by dividing the sum by N and displays the result to the user as output using System.out.println().
