// write a java program to find the largest of three numbers
public class exe1i
{
    public static void main(String args[])
    {
        int a=10;
        int b=25;
        int c=15;
        if(a>b && a>c)
        {
            System.out.println("Largest number is:"+a);
        }
        else if(b>c)
        {
            System.out.println("Largest number is:"+b);
        }
        else
        {
            System.out.println("Largest number is:"+c);
        }
    }
}
// observations:creates a class named exe1i and finds the largest of three numbers using main method and int data type variables a, b and c for the three numbers using if-else-if statement to compare the three numbers.