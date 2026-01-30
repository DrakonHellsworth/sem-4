class Student
{
    private String name;
    private int roll ;
    Student()
    {
        name="Java";
        roll=35;
    }
    void details()
    {
        System.out.println("My name is " +name);
        System.out.println("My roll number is " +roll);
    }
}
public class exe2f
{
    public static void main(String args[])
    {
        Student s1=new Student();
        s1.details();
    }
}