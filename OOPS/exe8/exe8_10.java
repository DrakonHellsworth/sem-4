//program to analyze a log file and count ERROR, WARNING, and INFO messages
import java.io.*;
class exe8_10
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=null;
		
		try
		{
			// Create sample log file first
			FileWriter fw=new FileWriter("e:\\cllg\\sem4\\OOPS\\exe8\\log_file.txt");
			fw.write("[INFO] Application started\n");
			fw.write("[ERROR] Database connection failed\n");
			fw.write("[WARNING] Low memory detected\n");
			fw.write("[INFO] User login successful\n");
			fw.write("[ERROR] Invalid user credentials\n");
			fw.write("[WARNING] Cache full, clearing old data\n");
			fw.write("[INFO] File uploaded successfully\n");
			fw.write("[ERROR] Network timeout\n");
			fw.write("[WARNING] Disk space low\n");
			fw.close();
			
			// Read log file
			br=new BufferedReader(new FileReader("e:\\cllg\\sem4\\OOPS\\exe8\\log_file.txt"));
			System.out.println("Analyzing log file...");
			
			// Maintain counters
			int errorCount=0;
			int warningCount=0;
			int infoCount=0;
			String line;
			
			// Check each line
			while((line=br.readLine()) != null)
			{
				// Identify type (ERROR/WARNING/INFO)
				if(line.contains("[ERROR]"))
				{
					errorCount++;
					System.out.println(line);
				}
				else if(line.contains("[WARNING]"))
				{
					warningCount++;
					System.out.println(line);
				}
				else if(line.contains("[INFO]"))
				{
					infoCount++;
				}
			}
			
			// Print summary
			System.out.println("\n=== Log Analysis Summary ===");
			System.out.println("INFO messages: " + infoCount);
			System.out.println("WARNING messages: " + warningCount);
			System.out.println("ERROR messages: " + errorCount);
			System.out.println("Total messages: " + (errorCount + warningCount + infoCount));
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
				System.out.println("Log file closed");
			}
		}
	}
}
//Observation: The program first creates a sample log file with different types of messages (INFO, WARNING, ERROR). It then reads the log file line by line and checks each line to identify the type of message using contains() method. Separate counters are maintained for each type. The program displays all ERROR and WARNING messages and finally prints a summary of message counts. This demonstrates log file analysis techniques.
