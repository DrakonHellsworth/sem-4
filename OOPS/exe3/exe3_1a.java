//using inputstream reader and buffered reader Write a program to read a single character and display its ASCII value.
import java.io.*;
class exe3_1a
{
    public static void main(String args[]) throws IOException
    {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        System.out.print("Enter a single character: ");
        char ch = (char)br.read();
        int a = (int)ch;
        System.out.println("ASCII value of '"+ch+"' is: "+a);
    }
}
//Observation: The program reads a single character from the user input and then converts it to its corresponding ASCII value using type casting. The ASCII value is then displayed to the user as output.