import java.io.File;
import java.util.Scanner;
public class FileInfo {
 public static void main(String[] args) {
 // Create a scanner to read input from the user
 Scanner scanner = new Scanner(System.in);
 // Prompt user to enter the file name
 System.out.print("Enter the file name: ");
 String fileName = scanner.nextLine();
 // Create a File object for the specified file name
 File file = new File(fileName);
 // Check if the file exists
 if (file.exists()) {
 // Display information about the file
 System.out.println("File exists: Yes");
 
 // Check if the file is readable
 System.out.println("File is readable: " + file.canRead());
 // Check if the file is writable
 System.out.println("File is writable: " + file.canWrite());
 // Display the type of file (file or directory)
 if (file.isFile()) {
System.out.println("Type: File");
 } else if (file.isDirectory()) {
 System.out.println("Type: Directory");
 } else {
 System.out.println("Type: Unknown");
 }
 // Display the length of the file in bytes
 System.out.println("File size: " + file.length() + " bytes");
 } else {
 System.out.println("File does not exist.");
 }
 // Close the scanner to avoid resource leak
 scanner.close();
 }
}