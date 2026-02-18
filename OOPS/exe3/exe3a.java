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
//Observation: The program reads a single character from the user input using BufferedReader and then prints the integer value of that character (which corresponds to its ASCII value) to the user as output. If you want to print the character itself, you can uncomment the line that casts the input to a char and comment out the line that prints the integer value.