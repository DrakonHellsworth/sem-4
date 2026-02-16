/*create a class with:
1) one public variable
2) one private variable
access them from another class and observe the result */
class Student
{
    public String name = "Java";
    private int roll = 35;
    void details()
    {
        System.out.println("My name is " +name);
        System.out.println("My roll number is " +roll);
    }
}
public class exe2_3a
{
    public static void main(String args[])
    {
        Student s=new Student();
        s.name="Anmol";
        //s.roll=37; //error
        s.details();
    }
}
//observation: The variable name is declared as public, so it can be accessed and modified from the main method. However, the variable roll is declared as private, so it cannot be accessed or modified directly from the main method, resulting in a compilation error if we try to access it. The details method can access both variables since it is within the same class.