class exe4c
{
    public static void main(String[] args)
    {
        int num=10;
        int num1=0b1010; //binary literal
        System.err.println(~num);
        System.err.println(~num1);
        int a=10;
        int b=5;
        System.out.println(a&b);
        System.out.println(a|b);
        System.out.println(a^b);
        System.out.println(a>>1);
        System.out.println(a<<1);
        int c=1010;
        int d=1011;
        int e=0b1010;
        int f=0b1011;
        System.out.println(c&d);
        System.out.println(e&f);
    }
}
//Observation: The program uses bitwise operations (&, |, ^, >>, <<) to perform various operations on integers. The output is displayed to the user as specified in the print statements and the program demonstrates the use of binary literals in Java.