// write a java program to declare two integers and print their sum.
public class test
{
    public static void main(String args[]) 
    {
        int a=7;
        int b=72;
        int sum=a+b;
        System.out.println("The sum of "+a+" and "+b+" is:"+sum);
        System.out.println("The area of a rectagle is:"+(a*b));
        float p=7f;
        float t=1f;
        float r=5f;
        float interest=((p*t*r)/100);
        System.out.println("The simple intrest is:"+interest);
        int c=2;
        int d=4;
        int e=c;
        System.out.println("Before swapping:c="+c+" d="+d);
        c=d;
        d=e;
        System.out.println("After swapping:c="+c+" d="+d);
        int a1=5;
        int b1=10;
        System.out.println("Before swapping:a1="+a1+" b1="+b1);
        a1=a1+b1;
        b1=a1-b1;
        a1=a1-b1;
        System.out.println("After swapping:a1="+a1+" b1="+b1);
    }   
}
