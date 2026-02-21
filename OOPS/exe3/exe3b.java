import java.io.*;
public class exe3b
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a character:");
        int ch=br.read();
        //char ch=(char)br.read();
        System.out.println("The character you entered is: " + (char)ch);
    }           
}
//Observation: The program reads a single character from the user input using BufferedReader and then prints the character itself to the user as output by casting the integer value to a char. If you want to print the ASCII value instead, you can comment out the line that casts to char and uncomment the line that prints the integer value.