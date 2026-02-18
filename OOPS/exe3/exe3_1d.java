//using inputstream reader and buffered reader,Read a string and check whether it is a palindrome.
import java.io.*;
class exe3_1d
{
    public static void main(String args[]) throws IOException
    {
        InputStreamReader in=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(in);
        System.out.print("Enter a string: ");
        String str=br.readLine();
        String rev="";
        for(int i=str.length()-1;i>=0;i--)
        {
            rev=rev+str.charAt(i);
        }
        if(str.equals(rev))
        {
            System.out.println("'"+str+"' is a palindrome.");
        }
        else
        {
            System.out.println("'"+str+"' is not a palindrome.");
        }
    }
}
//Observation: The program reads a string from the user input, reverses the string by iterating through it from the end to the beginning, and then compares the original string with the reversed string to determine if it is a palindrome. The result is displayed to the user as output.