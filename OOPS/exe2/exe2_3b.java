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
//observation: The variables name and roll are declared as private, so they cannot be accessed or modified directly from the main method. However, the details method can access both variables since it is within the same class. In this case, the details method has its own local variables name and roll, which are initialized with different values than the instance variables. When the details method is called, it prints the values of the local variables instead of the instance variables.