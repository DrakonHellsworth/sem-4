//program to search for a keyword in a file and display line numbers and total occurrences
import java.io.*;
import java.util.Scanner;
class exe8_6a
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=null;
		Scanner sc=new Scanner(System.in);
		
		try
		{
			// Take input keyword
			System.out.print("Enter the keyword to search: ");
			String keyword=sc.nextLine();
			
			// Read file line by line
			br=new BufferedReader(new FileReader("e:\\cllg\\sem4\\OOPS\\exe8\\source.txt"));
			System.out.println("Searching for keyword: '" + keyword + "'");
			
			String line;
			int lineNumber=0;
			int totalOccurrences=0;
			
			while((line=br.readLine()) != null)
			{
				lineNumber++;
				
				// Match keyword
				if(line.contains(keyword))
				{
					System.out.println("Found at line " + lineNumber + ": " + line);
					
					// Count occurrences in this line
					int index=0;
					while((index=line.indexOf(keyword, index)) != -1)
					{
						totalOccurrences++;
						index+=keyword.length();
					}
				}
			}
			
			System.out.println("Search completed");
			System.out.println("Total occurrences of '" + keyword + "': " + totalOccurrences);
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
				System.out.println("File closed");
			}
			sc.close();
		}
	}
}
//Observation: The program takes a keyword as input from the user using Scanner. It reads the file line by line and uses contains() method to check if the keyword exists in the line. For each match, it displays the line number and line content. The indexOf() method is used to count total occurrences of the keyword in the entire file. This demonstrates string searching and counting techniques.
