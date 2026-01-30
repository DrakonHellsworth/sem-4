class Student
{
    private String name ="Java";
    private int roll =35;
    void details()
    {
        System.out.println("My name is " +name);
        System.out.println("My roll number is " +roll);
    }
}
public class exe2e
{
    public static void main(String args[])
    {
        Student s1=new Student();
        s1.details();
        Student s2=new Student();
        //s2.name="Anmol"; causes error
        //s2.roll=37; causes error
        s2.details();

    }
}