import java.io.*;
public class exe3d 
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a Integer:");
        int n=Integer.parseInt(br.readLine());
        System.out.println("The Integer you entered is: "+n);
    }
}
