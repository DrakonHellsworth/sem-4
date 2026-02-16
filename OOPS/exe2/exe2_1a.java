//declare a variable int x inside main() and pass it to a method to print its value
public class exe2_1a
{
    void printValue(int x)
    {
        System.out.println("The value of x is: "+x);
    }
    public static void main(String args[])
    {
        int x=10;
        exe2_1a obj=new exe2_1a();
        obj.printValue(x);
    }
}
//observation: The variable x is declared inside the main method and is passed as an argument to the printValue method, which prints its value.