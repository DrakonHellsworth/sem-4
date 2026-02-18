//using Scanner class,Read student name, roll number, and marks using Scanner and display them.
import java.util.*;
class exe3_2a
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name=sc.nextLine();
        System.out.print("Enter roll number: ");
        int roll=sc.nextInt();
        System.out.print("Enter marks: ");
        int marks=sc.nextInt(); 
        System.out.println("Name: "+name);
        System.out.println("Roll number: "+roll);
        System.out.println("Marks: "+marks);
    }
}
//Observation: The program uses the Scanner class to read the student's name, roll number, and marks from the user input. It then displays the entered information to the user as output using System.out.println().