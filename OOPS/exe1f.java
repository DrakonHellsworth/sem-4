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
