//create a class with instance variables name and age intialize them using a method and display values
class Student 
{
    String name;
    int age;
    void display() 
    {
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
    }
}
public class exe2_2a {
    public static void main(String args[]) 
    {
        Student s = new Student();
        s.name="Anmol";
        s.age=20;
        s.display();
    }
}
//observation: The class Student has instance variables name and age, which are initialized in the main method. The display method is called to print the values of name and age to the console using System.out.println() method inside the display method.