import java.io.*;
class exe3e
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Roll no:");
        int r=Integer.parseInt(br.readLine());
        System.out.println("Enter Section(A/B):");
        char sec=(char)br.read();// ends the read command so the NEXT read command wont work
        System.out.println("Enter name:");
        String name=br.readLine();
        System.out.println("-------------");
        System.out.println("Roll no: "+r);
        System.out.println("Section: "+sec);    
        System.out.println("Name: "+name);
    }
}
//Observation: The program reads an integer (roll number), a character (section), and a string (name) from the user input using BufferedReader. However, there is an issue with reading the character for the section. After reading the integer, the newline character is still in the input buffer, which causes the next read command for the section to read that newline instead of waiting for user input. To fix this, you can add an extra readLine() after reading the integer to consume the leftover newline character before reading the section.