//wap to showtaht private members cannot be accessed directly outside the class
class Student
{
    private String name = "Java";
    private int roll = 35;
    void details()
    {
        String name ="Anmol";
        int roll =37;
        System.out.println("My name is " +name);
        System.out.println("My roll number is " +roll);
    }
}
class exe2_3b
{
    public static void main(String args[])
    {
        Student s=new Student();
        s.details();
    }
}