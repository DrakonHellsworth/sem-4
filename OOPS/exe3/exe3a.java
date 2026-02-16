//package ;
import java.io.*;
class exe3a
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a character:");
        int ch=br.read();
        //char ch=(char)br.read();
        System.out.println("The character you entered is: " + ch);
    }
}