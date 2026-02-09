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