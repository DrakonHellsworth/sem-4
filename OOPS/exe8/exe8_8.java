//program to store and retrieve student records (ID, Name, Marks) using a file
import java.io.*;
import java.util.Scanner;
class exe8_8
{
	public static void main(String args[]) throws IOException
	{
		Scanner sc=new Scanner(System.in);
		BufferedReader br=null;
		FileWriter fw=null;
		
		try
		{
			System.out.println("=== Student Record Management ===");
			System.out.println("1. Add Student Records");
			System.out.println("2. View Student Records");
			System.out.print("Choose an option: ");
			int choice=sc.nextInt();
			sc.nextLine();
			
			if(choice == 1)
			{
				// Take student input
				fw=new FileWriter("e:\\cllg\\sem4\\OOPS\\exe8\\students.txt", true);
				System.out.print("Enter number of students: ");
				int n=sc.nextInt();
				sc.nextLine();
				
				for(int i=0; i < n; i++)
				{
					System.out.println("Student " + (i+1) + ":");
					System.out.print("  ID: ");
					String id=sc.nextLine();
					System.out.print("  Name: ");
					String name=sc.nextLine();
					System.out.print("  Marks: ");
					String marks=sc.nextLine();
					
					// Write records to file
					fw.write(id + "," + name + "," + marks + "\n");
					System.out.println("Record added");
				}
				fw.close();
				System.out.println("Records saved successfully");
			}
			else if(choice == 2)
			{
				// Read file
				br=new BufferedReader(new FileReader("e:\\cllg\\sem4\\OOPS\\exe8\\students.txt"));
				System.out.println("\n=== Student Records ===");
				System.out.println("ID\t\tName\t\tMarks");
				System.out.println("---\t\t----\t\t-----");
				
				String line;
				// Display stored data
				while((line=br.readLine()) != null)
				{
					String[] parts=line.split(",");
					if(parts.length == 3)
					{
						System.out.println(parts[0] + "\t\t" + parts[1] + "\t\t" + parts[2]);
					}
				}
				br.close();
			}
			else
			{
				System.out.println("Invalid option");
			}
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not found: " + e.getMessage());
		}
		catch(IOException e)
		{
			System.out.println("IO Exception occurred: " + e.getMessage());
		}
		finally
		{
			if(br!=null)
			{
				br.close();
			}
			if(fw!=null)
			{
				fw.close();
			}
			sc.close();
		}
	}
}
//Observation: The program provides a menu-driven interface for managing student records. It stores student information (ID, Name, Marks) in CSV format in a file. Records can be added by taking user input through Scanner and writing to file. Existing records can be retrieved by reading the file and parsing data using split() method. This demonstrates file persistence for storing and retrieving data.
