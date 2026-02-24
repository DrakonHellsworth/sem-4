//program to show post and pre increment and decrement operator
public class exe4a
{
    public static void main(String[] args) {
        int a=5;
        System.out.println("Post-increment: "+(a++));
        System.out.println("Current value of a: "+a);
        int b=5;
        System.out.println("Pre-increment: "+(++b));
        System.out.println("Current value of b: "+b);
        int c=5;
        System.out.println("Post-decrement: "+(c--));
        System.out.println("Current value of c: "+c);
        int d=5;
        System.out.println("Pre-decrement: "+(--d));
        System.out.println("Current value of d: "+d);
        int x=5;
        System.out.println("Value of x before increment: "+x);
        x++;
        System.out.println("Value of x after increment: "+x);
        char ch='A';
        System.out.println("Value of ch before increment: "+ch);
        ch++;
        System.out.println("Value of ch after increment: "+ch);
        x=a+b+10*5;
        System.out.println("Value of x: "+x);
    }
}
//Observation: The program demonstrates the use of post-increment, pre-increment, post-decrement, and pre-decrement operators. It shows how the value of the variable changes before and after the increment/decrement operation. Additionally, it evaluates an expression involving addition and multiplication to show operator precedence in Java.