//create a class with a default constructor that prints a message when an object is created
class exe2_4
{
    exe2_4() 
    {
        System.out.println("Object is created using default constructor");
    }
    public static void main(String args[]) 
    {
        exe2_4 obj=new exe2_4();
    }
}
//observation: The class exe2_4 has a default constructor that is called when an object of the class is created. The constructor prints a message to the console using System.out.println() method, indicating that an object has been created. When the main method is executed, it creates an instance of the exe2_4 class, which triggers the execution of the default constructor and displays the message on the console.