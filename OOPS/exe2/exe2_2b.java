//initailize class variables using a constructor and display values
class exe2_2b 
{
    String name;
    int age;
    exe2_2b(String n,int a) 
    {
        name=n;
        age=a;
    }
public void display() 
    {
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
    }
    public static void main(String args[]) 
    {
        exe2_2b s=new exe2_2b("Anmol", 20);
        s.display();
    }
}
//observation: The class exe2_2b has instance variables name and age, which are initialized using a constructor. The display method is called to print the values of name and age to the console using System.out.println() method inside the display method.