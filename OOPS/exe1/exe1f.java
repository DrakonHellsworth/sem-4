// write a java program to swap two numbers without using a temporary variable
public class exe1f
{
    public static void main(String args[])
    {
        int a=7;
        int b=13;
        System.out.println("Before swapping:a="+a+" b="+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swapping:a="+a+" b="+b);
    }
}
//observations:creates a class named exe1f and swaps two numbers without using a temporary variable and prints the values before and after swapping using main method and int data type variables a and b for the two numbers.