// Create a class with no constructor and one instance variable.
// Create object and print variable value.
// Then define your own constructor.
// Observe difference and explain default constructor role.
class nocon
{
    int a;
    // nocon(int x)
    // {
    //     a=x;
    // }
}
class exe5_9
{
    public static void main(String args[])
    {
        nocon obj=new nocon();
        System.out.println("Value of a: "+obj.a);
        // nocon obj1=new nocon(17);
        // System.out.println("Value of a: "+obj1.a);
        System.out.println("In this program if we comment in the comment out part of both the class and main method then the default constructor will be called and the value of a will be 0 because it is an instance variable and it is initialized to 0 by default. But if we uncomment the comment out part then the default constructor will not be called and the value of a will be 17 because we have defined our own constructor which takes an integer argument and assigns it to a.");
    }
}