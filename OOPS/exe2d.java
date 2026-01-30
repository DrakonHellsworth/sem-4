class Student
{
    private String name = "Java";
    private int roll = 35;
    void details()
    {
        String name ="Anmol";
        int roll =37;
        System.out.println("My name is " +name);
        System.out.println("My roll number is " +roll);
    }
}
public class exe2d
{
    public static void main(String args[])
    {
        Student s=new Student();
        //s.name="Damn";
        //s.roll=39;
        s.details();
    }
}