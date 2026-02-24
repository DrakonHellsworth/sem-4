class Msc
{
    String name;
}
class Mscam extends Msc
{
    String name;
}
public class exe4b
{
public static void main(String args[])
{
    boolean v;
    Msc st= new Msc();
    Mscam st1= new Mscam();
    v=st1 instanceof Msc;
    System.out.println(v);
}
}
//Observation: The program demonstrates the use of the 'instanceof' operator in Java. It checks if an object of the Mscam class is an instance of the Msc class, which is true since Mscam is a subclass of Msc. The output will be 'true' indicating that the object st1 is indeed an instance of the Msc class.