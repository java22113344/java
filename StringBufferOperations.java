import java.util.Scanner; 
public class StringBufferOperations { 
public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
         
        // Accepting input string from the user 
        System.out.print("Enter a string: "); 
 
        String inputString = scanner.nextLine(); 
        // Creating a StringBuffer object 
        StringBuffer stringBuffer = new StringBuffer(inputString); 
         
        // a) Length of a string 
        int length = stringBuffer.length(); 
        System.out.println("Length of the string: " + length); 
         
        // b) Reverse a string 
        StringBuffer reversedString = stringBuffer.reverse(); 
        System.out.println("Reversed string: " + reversedString); 
         
        // c) Delete a substring from the given string 
        // Example: Deleting characters from index 5 to 10 
        System.out.print("Enter the starting index for deletion: "); 
        int startIndex = scanner.nextInt(); 
        System.out.print("Enter the ending index for deletion: "); 
        int endIndex = scanner.nextInt(); 
         
        // Deleting substring 
        stringBuffer.delete(startIndex, endIndex); 
        System.out.println("String after deletion: " + stringBuffer); 
         
        // Closing the scanner object 
        scanner.close(); 
    } 
} 