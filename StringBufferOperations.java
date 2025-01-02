import java.util.Scanner;
public class StringBufferOperations {
public static void main(String[] args) {
 // Create a scanner object to take user input
 Scanner scanner = new Scanner(System.in);
 // Taking input string from the user
 System.out.print("Enter a string: ");
 String inputString = scanner.nextLine();
 // Create a StringBuffer object using the input string
 StringBuffer stringBuffer = new StringBuffer(inputString);
 // a) Length of the string
 int lengthOfString = stringBuffer.length();
 System.out.println("Length of the string: " + lengthOfString);
 // b) Reverse the string
 StringBuffer reversedString = stringBuffer.reverse();
 System.out.println("Reversed string: " + reversedString);
 // c) Delete a substring from the string
 // Asking user for the range of the substring to be deleted
 System.out.print("Enter the starting index to delete substring: ");
 int startIndex = scanner.nextInt();
 
 System.out.print("Enter the ending index to delete substring: ");
 int endIndex = scanner.nextInt();
 
 // Ensure that the indices are within valid bounds
 if (startIndex >= 0 && endIndex <= stringBuffer.length() && startIndex < endIndex) {
 stringBuffer.delete(startIndex, endIndex);
System.out.println("String after deletion of substring: " + stringBuffer);
 } else {
 System.out.println("Invalid indices for substring deletion.");
 }
 // Close the scanner object
 scanner.close();
 }
}