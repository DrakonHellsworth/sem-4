// Create a class Student with name, roll number and static variable totalStudents.
// Overload constructors (default and parameterized).
// Each time object is created, increment totalStudents.
// Display total number of students created.
class Student
{
    String name;
    int rollno;
    static int totalStudents;
    Student()
    {
        totalStudents++;
    }
    Student(String name, int rollno)
    {
        this.name=name;
        this.rollno=rollno;
        totalStudents++;
    }
}
public class exe5_10
{
    public static void main(String args[])
    {
        Student s1=new Student();
        Student s2=new Student("Alice", 1);
        Student s3=new Student("Bob", 2);
        System.out.println("Total students created: "+Student.totalStudents);
    }
}