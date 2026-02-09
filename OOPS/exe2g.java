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
//observation: The class Student has two constructors, a default constructor that initializes the name and roll variables with default values, and a parameterized constructor that takes two parameters to initialize the variables with specific values. In the main method, two objects of the class are created