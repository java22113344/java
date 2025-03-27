import java.io.File; 
import java.util.Scanner; 
 
public class FileInfo { 
    public static void main(String[] args) { 

        Scanner scanner = new Scanner(System.in); 
 
 
        System.out.print("Enter the file name or path: "); 
        String fileName = scanner.nextLine(); 
 
       
        File file = new File(fileName); 
 
   
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

        scanner.close(); 
    } 
} 
