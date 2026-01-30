class Student
{
    String name = "Java";
    int roll = 35;
    void details()
    {
        System.out.println("My name is " + name);
        System.out.println("My roll number is " + roll);
    }
}
public class exe2b
{
    public static void main(String args[])
    {
        Student s=new Student();
        s.details();
    }
}