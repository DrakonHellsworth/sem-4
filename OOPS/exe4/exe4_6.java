//Write a program to demonstrate implicit and explicit type conversion and show loss of precision.
class convert
{
    void implicit()
    {
        int num=17;
        double d=num;
        System.out.println("Implicit conversion: int " +num+ " to double "+d);
    }
    void explicit()
    {
        double d=17.96;
        int num=(int)d;
        System.out.println("Explicit conversion: double " +d+ " to int "+num);
    }
}
public class exe4_6
{
    public static void main(String[] args) 
    {
        convert conv=new convert();
        conv.implicit();
        conv.explicit();
    }
}
//Observation: The program demonstrates implicit and explicit type conversion. In the implicit conversion, an integer value is automatically converted to a double without any loss of precision. In the explicit conversion, a double value is explicitly cast to an integer, which results in a loss of precision as the decimal part is truncated.