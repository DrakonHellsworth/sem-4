//print hashcode of two objects
class stu
{
    String name;
    int roll;
}
public class exe2h
{
    public static void main(String args[])
    {
        stu s1=new stu();
        stu s2=new stu();
        System.out.println("Hashcode of s1:"+s1.hashCode());
        System.out.println("Hashcode of s2:"+s2.hashCode());
    }
}
//observation: The class stu has instance variables name and roll, but they are not initialized in the main method. When two objects of the class stu are created, they will have different hashcodes since they are different instances of the class. The hashcode is a unique identifier for each object and is generated based on the memory address of the object. Therefore, when the hashcode of s1 and s2 is printed to the console, it will show different values for each object.