//program to merge the contents of two or more files into a single file
import java.io.*;
class exe8_5
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br1=null;
		BufferedReader br2=null;
		FileWriter fw=null;
		
		try
		{
			// Open multiple files
			br1=new BufferedReader(new FileReader("e:\\cllg\\sem4\\OOPS\\exe8\\source.txt"));
			br2=new BufferedReader(new FileReader("e:\\cllg\\sem4\\OOPS\\exe8\\source.txt"));
			fw=new FileWriter("e:\\cllg\\sem4\\OOPS\\exe8\\merged_output.txt");
			System.out.println("Files opened successfully");
			
			System.out.println("Merging file 1...");
			// Read sequentially from first file
			String line;
			int lineCount=0;
			while((line=br1.readLine()) != null)
			{
				fw.write(line + "\n");
				lineCount++;
			}
			System.out.println("File 1 merged: " + lineCount + " lines");
			
			System.out.println("Merging file 2...");
			// Read sequentially from second file
			lineCount=0;
			while((line=br2.readLine()) != null)
			{
				fw.write(line + "\n");
				lineCount++;
			}
			System.out.println("File 2 merged: " + lineCount + " lines");
			System.out.println("All files merged successfully");
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
			if(br1!=null)
			{
				br1.close();
				System.out.println("File 1 closed");
			}
			if(br2!=null)
			{
				br2.close();
				System.out.println("File 2 closed");
			}
			if(fw!=null)
			{
				fw.close();
				System.out.println("Merged file closed");
			}
		}
	}
}
//Observation: The program opens multiple files using BufferedReader objects and a single FileWriter for the output. It reads from each file sequentially using readLine() and writes all content to a single merged file. The program tracks lines from each file and ensures all files are properly closed in the finally block.
