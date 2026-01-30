// constructor
class student
{
    String name;
    int roll;
    void details()
    {
        System.out.println("My name is "+name);
        System.out.println("My roll number is "+roll);
    }
}
public class exe2a
{
    public static void main(String args[])
    {
        student s=new student();
        s.name="Java";
        s.roll=35;
        s.details();
    }
}