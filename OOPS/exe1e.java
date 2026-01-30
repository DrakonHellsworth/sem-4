// write a java program to swap two numbers using a temporary variable
public class exe1e
{
    public static void main(String args[])
    {
        int a=3;
        int b=23;
        int temp;
        System.out.println("Before swapping:a="+a+" b="+b);
        temp=a;
        a=b;
        b=temp;
        System.out.println("After swapping:a="+a+" b="+b);
    }
}
