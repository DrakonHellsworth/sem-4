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
//observation: The variables name and roll are declared as private, so they cannot be accessed or modified directly from the main method. However, the details method can access both variables since it is within the same class. When the details method is called for both s1 and s2 objects, it prints the values of the instance variables name and roll, which are initialized with default values "Java" and 35 respectively. Since we cannot modify the private variables directly, both s1 and s2 will display the same values when their details method is called.