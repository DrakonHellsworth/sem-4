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
//observation: The class Student has a default constructor that initializes the instance variables name and roll with default values. The details method is called to print the values of name and roll to the console using System.out.println() method inside the details method. When the main method is executed, it creates an instance of the Student class, which triggers the execution of the default constructor and initializes the variables with default values. The details method is then called to display the values on the console.