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