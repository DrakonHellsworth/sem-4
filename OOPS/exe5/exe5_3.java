// Create a class Counter with:
// - static variable count
// - instance variable id
// Increment both variables inside constructor.
// Create 3 objects and display values of count and id for each object.
// Explain the output.
class Counter
{
    static int count;
    int id;
    Counter()
    {
        count++;
        id=count;
    }
}
public class exe5_3
{
    public static void main(String args[])
    {
        Counter c1=new Counter();
        Counter c2=new Counter();
        Counter c3=new Counter();
        System.out.println("Counter 1: count = "+Counter.count+", id = "+c1.id);
        System.out.println("Counter 2: count = "+Counter.count+", id = "+c2.id);
        System.out.println("Counter 3: count = "+Counter.count+", id = "+c3.id);
    }
}