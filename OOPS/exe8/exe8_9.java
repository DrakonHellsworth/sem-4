//program to encrypt and decrypt file data using a simple technique
import java.io.*;
import java.util.Scanner;
class exe8_9
{
	public static void main(String args[]) throws IOException
	{
		FileReader fr=null;
		FileWriter fw=null;
		Scanner sc=new Scanner(System.in);
		
		try
		{
			System.out.println("=== File Encryption/Decryption ===");
			System.out.println("1. Encrypt File");
			System.out.println("2. Decrypt File");
			System.out.print("Choose an option: ");
			int choice=sc.nextInt();
			sc.nextLine();
			
			System.out.print("Enter encryption key (number): ");
			int key=sc.nextInt();
			if(choice == 1)
			{
				// Read file
				fr=new FileReader("e:\\cllg\\sem4\\OOPS\\exe8\\source.txt");
				fw=new FileWriter("e:\\cllg\\sem4\\OOPS\\exe8\\encrypted_output.txt");
				System.out.println("Encrypting file...");
				
				// Apply encryption logic (shift by key)
				int ch;
				int encryptCount=0;
				while((ch=fr.read()) != -1)
				{
					char c=(char)ch;
					if(Character.isLetter(c))
					{
						c=(char)(c + key);
						encryptCount++;
					}
					// Save encrypted file
					fw.write(c);
				}
				System.out.println("Encryption completed");
				System.out.println("Total characters encrypted: " + encryptCount);
			}
			else if(choice == 2)
			{
				// Decrypt
				fr=new FileReader("e:\\cllg\\sem4\\OOPS\\exe8\\encrypted_output.txt");
				fw=new FileWriter("e:\\cllg\\sem4\\OOPS\\exe8\\decrypted_output.txt");
				System.out.println("Decrypting file...");
				
				// Reverse logic to decrypt (shift back by key)
				int ch;
				int decryptCount=0;
				while((ch=fr.read()) != -1)
				{
					char c=(char)ch;
					if(c > 'A' && c < 'z')
					{
						c=(char)(c - key);
						decryptCount++;
					}
					fw.write(c);
				}
				System.out.println("Decryption completed");
				System.out.println("Total characters decrypted: " + decryptCount);
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
			if(fr!=null)
			{
				fr.close();
			}
			if(fw!=null)
			{
				fw.close();
			}
			sc.close();
		}
	}
}
//Observation: The program provides encryption and decryption functionality using a simple Caesar cipher technique. During encryption, each letter character is shifted by the user-provided key value. Non-letter characters remain unchanged. During decryption, the process is reversed by shifting back by the same key value. This demonstrates character manipulation and file I/O operations for security purposes.
