//program to replace all occurrences of a word in a file with another word
import java.io.*;
import java.util.Scanner;
class exe8_7
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=null;
		FileWriter fw=null;
		Scanner sc=new Scanner(System.in);
		
		try
		{
			// Take input
			System.out.print("Enter the word to find: ");
		String findWord=sc.nextLine();
		System.out.print("Enter the word to replace with: ");
		String replaceWord=sc.nextLine();
		br=new BufferedReader(new FileReader("e:\\cllg\\sem4\\OOPS\\exe8\\source.txt"));
		fw=new FileWriter("e:\\cllg\\sem4\\OOPS\\exe8\\replaced_output.txt");
			System.out.println("Processing file...");
			
			String line;
			int totalReplacements = 0;
			
			while((line=br.readLine()) != null)
			{
				// Find target word and replace with new word
				String modifiedLine=line;
				int countInLine=0;
				
				if(line.contains(findWord))
				{
					countInLine=line.split(findWord).length - 1;
					modifiedLine=line.replaceAll(findWord, replaceWord);
					totalReplacements+=countInLine;
				}
				
				// Save to new file
				fw.write(modifiedLine + "\n");
			}
			
			System.out.println("Replacement completed");
			System.out.println("Total replacements made: " + totalReplacements);
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
			if(br != null)
			{
				br.close();
				System.out.println("Source file closed");
			}
			if(fw != null)
			{
				fw.close();
				System.out.println("Output file closed");
			}
			sc.close();
		}
	}
}
//Observation: The program takes two inputs from the user - the word to find and the word to replace it with. It reads the file line by line and uses replaceAll() method to replace all occurrences of the target word with the new word. The number of replacements in each line is counted using the split() method. The modified content is written to a new file.
