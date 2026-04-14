//program to read a CSV file, extract specific columns, and write filtered data to another file
import java.io.*;
class exe8_11
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=null;
		FileWriter fw=null;
		
		try
		{
			// Create sample CSV file
		FileWriter csvWriter=new FileWriter("e:\\cllg\\sem4\\OOPS\\exe8\\data.csv");
			csvWriter.write("ID,Name,Email,Country\n");
			csvWriter.write("1,John,john@mail.com,USA\n");
			csvWriter.write("2,Sarah,sarah@mail.com,UK\n");
			csvWriter.write("3,Ahmed,ahmed@mail.com,UAE\n");
			csvWriter.write("4,Maria,maria@mail.com,Spain\n");
			csvWriter.write("5,Raj,raj@mail.com,India\n");
			csvWriter.close();
			
			// Read CSV line by line
		br=new BufferedReader(new FileReader("e:\\cllg\\sem4\\OOPS\\exe8\\data.csv"));
		fw=new FileWriter("e:\\cllg\\sem4\\OOPS\\exe8\\filtered_data.csv");
			System.out.println("Original CSV file data:");
			String headerLine = br.readLine();
			System.out.println(headerLine);
			
			// Extract required columns (ID, Name, Country)
			fw.write("ID,Name,Country\n");
			
			String line;
			int rowCount = 0;
			System.out.println("\nFiltered data (ID, Name, Country):");
			while((line = br.readLine()) != null)
			{
				// Split using delimiter (comma)
				String[] columns = line.split(",");
				if(columns.length >= 4)
				{
					// Extract and write filtered columns (columns 0, 1, 3)
					String filteredLine = columns[0] + "," + columns[1] + "," + columns[3];
					fw.write(filteredLine + "\n");
					System.out.println(filteredLine);
					rowCount++;
				}
			}
			System.out.println("\nTotal rows processed: " + rowCount);
			System.out.println("Filtered data written to file");
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
				System.out.println("Output file closed");
			}
		}
	}
}
//Observation: The program creates a sample CSV file with multiple columns (ID, Name, Email, Country). It reads the CSV file line by line using BufferedReader. Each line is split using the comma delimiter with the split() method. Specific columns are extracted and written to a new file, filtering out unwanted columns like Email. This demonstrates CSV processing and data filtering techniques.
