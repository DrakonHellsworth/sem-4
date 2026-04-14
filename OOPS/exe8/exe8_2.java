//program to count the number of characters, words, and lines in a text file
import java.io.*;
class exe8_2
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=null;
		int charCount=0;
		int wordCount=0;
		int lineCount=0;
		try
		{
			br=new BufferedReader(new FileReader("e:\\cllg\\sem4\\OOPS\\exe8\\source.txt"));
			
			String line;
			while((line=br.readLine())!=null)
			{
				lineCount++;
				charCount+=line.length();
				if(line.length()>0)
				{
					String[] words=line.split(" ");
					for(String word:words)
					{
						if(!word.isEmpty())
						{
							wordCount++;
						}
					}
				}
			}
			System.out.println("Number of lines: "+lineCount);
			System.out.println("Number of words: "+ wordCount);
			System.out.println("Number of characters: "+charCount);
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not found: "+e.getMessage());
		}
		catch(IOException e)
		{
			System.out.println("IO Exception occurred: "+e.getMessage());
		}
		finally
		{
			if(br!=null)
			{
				br.close();
				System.out.println("File closed");
			}
		}
	}
}
//Observation: The program reads the file line by line using BufferedReader. It counts lines by incrementing lineCount for each line read. Characters are counted by adding the length of each line. Words are counted by splitting each line by spaces and counting non-empty words. This demonstrates file analysis using BufferedReader and String operations.
