// Create two interfaces Printer and Scanner. Design class AllInOnePrinter implementing both interfaces. Demonstrate multiple inheritance using interfaces.
interface Printer
{
    void print();
}
interface Scanner
{
    void scan();
}
class AllInOnePrinter implements Printer,Scanner
{
    public void print()
    {
        System.out.println("Printing document...");
    }
    public void scan()
    {
        System.out.println("Scanning document...");
    }
}
public class exe6_15
{
    public static void main(String[] args)
    {
        AllInOnePrinter aip=new AllInOnePrinter();
        aip.print();
        aip.scan();
    }
}
// Observation: In the above code, we have two interfaces Printer and Scanner with methods print() and scan() respectively. The class AllInOnePrinter implements both interfaces and provides implementations for both methods. In the main method, we create an instance of AllInOnePrinter and call both print() and scan() methods, demonstrating multiple inheritance using interfaces in Java. The output will show messages indicating that the document is being printed and scanned, showcasing the functionality of both interfaces in a single class.