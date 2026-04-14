//program to store usernames and passwords in a file and verify login credentials
import java.io.*;
import java.util.Scanner;
class exe8_12
{
	// Simple encryption method
	static String encryptPassword(String password)
	{
		String encrypted="";
		for(int i=0; i < password.length(); i++)
		{
			char c=password.charAt(i);
			c=(char)(c + 5); // Simple shift by 5
			encrypted+=c;
		}
		return encrypted;
	}
	
	// Decryption method
	static String decryptPassword(String encrypted)
	{
		String decrypted="";
		for(int i=0; i < encrypted.length(); i++)
		{
			char c=encrypted.charAt(i);
			c=(char)(c - 5); // Reverse shift
			decrypted+=c;
		}
		return decrypted;
	}
	
	public static void main(String args[]) throws IOException
	{
		Scanner sc=new Scanner(System.in);
		BufferedReader br=null;
		FileWriter fw=null;
		
		try
		{
			System.out.println("=== User Authentication System ===");
			System.out.println("1. Register New User");
			System.out.println("2. Login");
			System.out.print("Choose an option: ");
			int choice=sc.nextInt();
			sc.nextLine();
			
			if(choice == 1)
			{
				// Take username/password input
				fw=new FileWriter("e:\\cllg\\sem4\\OOPS\\exe8\\users.txt", true);
				System.out.print("Enter username: ");
				String username=sc.nextLine();
				System.out.print("Enter password: ");
				String password=sc.nextLine();
				
				// Encrypt password
				String encryptedPassword=encryptPassword(password);
				
				// Store in file
				fw.write(username + ":" + encryptedPassword + "\n");
				fw.close();
				System.out.println("User registered successfully");
			}
			else if(choice == 2)
			{
				// Take login input
				System.out.print("Enter username: ");
				String username=sc.nextLine();
				System.out.print("Enter password: ");
				String password=sc.nextLine();
				
				// Read and verify during login
				br=new BufferedReader(new FileReader("e:\\cllg\\sem4\\OOPS\\exe8\\users.txt"));
				String line;
				boolean found=false;
				
				while((line=br.readLine()) != null)
				{
					String[] parts=line.split(":");
					if(parts.length == 2)
					{
						String storedUsername=parts[0];
						String storedPassword=parts[1];
						
						if(storedUsername.equals(username))
						{
							String decryptedPassword=decryptPassword(storedPassword);
							if(decryptedPassword.equals(password))
							{
								System.out.println("Login successful! Welcome " + username);
								found=true;
								break;
							}
							else
							{
								System.out.println("Invalid password");
								found=true;
								break;
							}
						}
					}
				}
				
				if(!found)
				{
					System.out.println("User not found");
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
//Observation: The program provides a user authentication system with registration and login functionality. During registration, username and password are taken as input and the password is encrypted using a simple shift cipher before storing in a file. During login, credentials are read from file and the stored encrypted password is decrypted and compared with the entered password. This demonstrates file-based user management and password encryption/decryption techniques.
