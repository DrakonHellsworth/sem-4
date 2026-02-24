// Create a class where constructor calls an instance method.
// Instance method reads input using BufferedReader and adds value to instance
// variable.
// Create object from main() and observe execution
import java.io.*;
class Constructor
{
    int a;
    Constructor()
    {
        readValue();
    }
    void readValue()
    {
        {
            try
            {
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter value: ");
                int x=Integer.parseInt(br.readLine());
                a=a+x;
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
}
public class exe5_8
{
    public static void main(String args[])
    {
        Constructor obj=new Constructor();
        System.out.println("Value of a: "+obj.a);
    }
}
