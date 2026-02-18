//using inputstream reader and buffered reader, Read two integers using BufferedReader and print their sum.
import java.io.*;
class exe3_1b
{
    public static void main(String args[]) throws IOException
    {
        InputStreamReader in=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(in);
        System.out.print("Enter first integer: ");
        int num1=Integer.parseInt(br.readLine());
        System.out.print("Enter second integer: ");
        int num2=Integer.parseInt(br.readLine());
        int sum=num1+num2;
        System.out.println("The sum of "+num1+" and "+num2+" is: "+sum);
    }
}

//Observation: The program prompts the user to enter two integers, reads them using BufferedReader, converts the input strings to integers using Integer.parseInt(), calculates their sum, and then displays the result to the user as output.