//a loop program to find prime number only using loops
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
//Observation: The program checks if a given number is prime by using a for loop to test divisibility from 2 up to half of the number. If the number is divisible by any of these values, it is not prime. The program then prints whether the number is prime or not based on the result of the check.