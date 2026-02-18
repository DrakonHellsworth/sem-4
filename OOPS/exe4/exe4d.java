public class exe4d
{
    public static void main(String[] args) 
    {
        int c=1;
        System.out.println("printing first 10 odd numbers");
        while(c<=20)
        {
            System.out.println(c);
            c=c+2;
        }
        c=1;
        System.out.println("break");
        do
        {
            System.out.println(c);
            c=c+2;
        }
        while(c<20);
        c=1;
        System.out.println("break");
        for(int i=1;i<=20;i=i+2)
        {
            System.out.println(i);
        }
    }
}