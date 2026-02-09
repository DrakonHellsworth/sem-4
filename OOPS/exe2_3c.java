// demonstrate default access by accessing variables within the same package using inheritance
class Student
{
    default String name="Java";
    default int roll=35;

    void details()
    {
        System.out.println("Name: "+name);
        System.out.println("Roll: "+roll);
    }
}
public class exe2_3c extends Student
{
    public static void main(String args[])
    {
        exe2_3c s=new exe2_3c();
        s.name="Anmol";
        s.roll=37;
        s.details();
    }
}
