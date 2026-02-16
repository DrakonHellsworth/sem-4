//using inputstream reader and buffered reader,Read three integers and find the l number.
import java.io.*;
class exe3_1c
{
    public static void main(String args[]) throws IOException
    {
        InputStreamReader in=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(in);
        System.out.print("Enter first integer: ");
        int num1=Integer.parseInt(br.readLine());
        System.out.print("Enter second integer: ");
        int num2=Integer.parseInt(br.readLine());
        System.out.print("Enter third integer: ");
        int num3=Integer.parseInt(br.readLine());
        
        int l=num1;
        if(num2>l) 
        {
            l=num2;
        }
        if(num3>l) 
        {
            l=num3;
        }
        
        System.out.println("The largest number among "+num1+","+num2+",and "+num3+" is: "+l);
    }
}