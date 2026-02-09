// demonstrate default access by accessing variables within the same package using inheritance
class Student
{
    String name="Java";
    int roll=35;

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
//observation: The variables name and roll are declared with default access, which means they can be accessed and modified from any class within the same package. In this case, the class exe2_3c extends the Student class, so it can access and modify the variables name and roll directly. The details method is called to print the updated values of name and roll to the console using System.out.println() method inside the details method.