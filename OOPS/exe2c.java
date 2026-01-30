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