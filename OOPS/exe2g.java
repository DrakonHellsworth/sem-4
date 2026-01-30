class Student
{
    private String name;
    private int roll ;
    Student()
    {
        name="Java";
        roll=35;
    }
    Student(String s,int n)
    {
        name=s;
        roll=n;
    }
    void details()
    {
        System.out.println("My name is " +name);
        System.out.println("My roll number is " +roll);
    }
}
public class exe2g
{
    public static void main(String args[])
    {
        Student s1=new Student();
        s1.details();
        Student s2=new Student("Anmol",37);
        s2.details();
    }
}