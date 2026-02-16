//Creating a class Student with attributes name and roll number
class Student
{
    String name = "Java";
    int roll = 35;
    void details()
    {
        System.out.println("My name is " +name);
        System.out.println("My roll number is " +roll);
    }
}
public class exe2c

{
    public static void main(String args[])
    {
        Student s=new Student();
        s.name="Anmol";
        s.roll=37;
        s.details();
    }
}
//observation: The class Student has instance variables name and roll, which are initialized with default values. In the main method, the values of name and roll are updated to "Anmol" and 37 respectively. The details method is called to print the updated values of name and roll to the console using System.out.println() method inside the details method. When the main method is executed, it creates an instance of the Student class, updates the values of name and roll, and calls the details method, which displays the updated values on the console.