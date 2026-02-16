import java.io.*;
class exe3c
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a String:");
        String str=br.readLine();
        System.out.println("The String you entered is: "+str);
    }
}