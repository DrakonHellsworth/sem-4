package input;
import java.io.*;

class exe3a {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a character:");
        
        int ch = br.read(); 
        // Use (char) to convert the ASCII integer back to a letter
        System.out.println("The character you entered is: " + (char)ch);
    }
}