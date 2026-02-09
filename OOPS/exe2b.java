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
//observation: The class Student has instance variables name and roll, which are initialized with default values. The details method is called to print the values of name and roll to the console using System.out.println() method inside the details method. When the main method is executed, it creates an instance of the Student class and calls the details method, which displays the default values of name and roll on the console.