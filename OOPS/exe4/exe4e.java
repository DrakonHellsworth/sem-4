//a loop progra to find prime number only using loops
public class exe4e
{
    public static void main(String[] args) 
    {
        int num=Integer.parseInt(args[0]);
        boolean isPrime=true;
        for(int i=2;i<=num/2;i++)
        {
            if(num%i==0)
            {
                isPrime=false;
                break;
            }
        }
        if(isPrime)
        {
            System.out.println(num+" is a prime number.");
        }
        else
        {
            System.out.println(num+" is not a prime number.");
        }
    }
}