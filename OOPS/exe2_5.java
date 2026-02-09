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
//observation: The class exe2_5 has a parameterized constructor that takes two parameters, name and marks, to initialize the instance variables of the class. When an object of the class is created in the main method, the constructor is called with the arguments "Anmol" and 85, which initializes the name and marks variables. The values of name and marks are then printed to the console using System.out.println() method.