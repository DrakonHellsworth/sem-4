//initialize two numbers in main() and pass them to another class to calc sum
public class exe2_1b
{
    void sum(int a,int b)
    {
        int s=a+b;
        System.out.println("The sum is: "+s);
    }
public static void main(String args[])
    {
        int a=5;
        int b=10;
        exe2_1b obj=new exe2_1b();
        obj.sum(a,b);
    }
}