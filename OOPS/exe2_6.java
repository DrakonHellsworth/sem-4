/* write a program having:
1) one default constructor
2) one parameterized constructor
create objects using both constructors and display values of variables*/
class exe2_6
{
    String name;
    int roll;
    exe2_6()
    {
        name="Java";
        roll=35;
    }
    exe2_6(String n,int r)
    {
        name=n;
        roll=r;
    }
    void display()
    {
        System.out.println("Name:"+name);
        System.out.println("Roll:"+roll);
    }
    public static void main(String args[])
    {
        exe2_6 s1=new exe2_6();
        s1.display();
        exe2_6 s2=new exe2_6("Anmol",37);
        s2.display();
    }
}