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
//observation: The class student has instance variables name and roll, which are initialized in the main method. The details method is called to print the values of name and roll to the console using System.out.println() method inside the details method.