// Implement constructor overloading in a Student class.

class student
{
    String name;
    int roll;
    student()
    {
        name="Java";
        roll=35;
    }
    student(String name,int roll)
    {
        this.name=name;
        this.roll=roll;
    }
}
public class exe5_12
{
    public static void main(String args[])
    {
        student s1=new student();
        student s2=new student("Anmol", 17);
        System.out.println("Student 1: Name="+s1.name+",Roll="+s1.roll);
        System.out.println("Student 2: Name="+s2.name+",Roll="+s2.roll);
    }
}