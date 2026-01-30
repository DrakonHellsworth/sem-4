// write a java program to find the largest of three numbers
public class exe1i
{
    public static void main(String args[])
    {
        int a=10;
        int b=25;
        int c=15;
        if(a>b && a>c)
            System.out.println("Largest number is:"+a);
        else if(b>c)
            System.out.println("Largest number is:"+b);
        else
            System.out.println("Largest number is:"+c);
    }
}
