// Create a class demonstrating method overloading using different data types.
class Overloading
{
    void display(int a)
    {
        System.out.println("Integer: "+a);
    }
    void display(double b)
    {
        System.out.println("Double: "+b);
    }
    void display(String c)
    {
        System.out.println("String: "+c);
    }
}
public class exe5_14
{
    public static void main(String args[])
    {
        Overloading obj=new Overloading();
        obj.display(17);
        obj.display(3.14);
        obj.display("Hello");
    }
}