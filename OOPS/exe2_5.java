//create a class with a parametarized constructor to initialize name and marks
class exe2_5
{
    String name;
    int marks;
    exe2_5(String n,int m)
    {
        name=n;
        marks=m;
    }
    public static void main(String args[])
    {
        exe2_5 s=new exe2_5("Anmol",85);
        System.out.println("Name:"+s.name);
        System.out.println("Marks:"+s.marks);
    }
}