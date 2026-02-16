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