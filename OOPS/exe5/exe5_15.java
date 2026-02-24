// Write a program showing constructor chaining.
class Student
{
    String name;
    int rollno;
    Student()
    {
        this("Java",35);
    }
    Student(String name,int rollno)
    {
        this.name=name;
        this.rollno=rollno;
    }
}
public class exe5_15
{
    public static void main(String args[])
    {
        Student s1=new Student();
        Student s2=new Student("Anmol",37);
        System.out.println("Student 1: Name="+s1.name+",Roll="+s1.rollno);
        System.out.println("Student 2: Name="+s2.name+",Roll="+s2.rollno);
    }
}