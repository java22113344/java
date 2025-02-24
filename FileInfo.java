import java.io.File; 
import java.util.Scanner; 
 
public class FileInfo { 
    public static void main(String[] args) { 
        // Create a Scanner to get user input 
        Scanner scanner = new Scanner(System.in); 
 
 
        // Prompt the user to enter the file name or path 
        System.out.print("Enter the file name or path: "); 
        String fileName = scanner.nextLine(); 
 
        // Create a File object 
        File file = new File(fileName); 
 
        // Display file information 
        System.out.println("\nFile Information:"); 
        if (file.exists()) { 
            System.out.println("File exists: Yes"); 
            System.out.println("Readable: " + (file.canRead() ? "Yes" : "No")); 
            System.out.println("Writable: " + (file.canWrite() ? "Yes" : "No")); 
            System.out.println("Type: " + (file.isDirectory() ? "Directory" : "File")); 
            System.out.println("Length: " + file.length() + " bytes"); 
        } else { 
            System.out.println("File exists: No"); 
        } 
 
        // Close the scanner 
        scanner.close(); 
    } 
} 