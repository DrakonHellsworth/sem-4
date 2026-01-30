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