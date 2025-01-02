import java.util.Scanner;
public class StringManipulation {
 public static void main(String[] args) {
 // Create a scanner object to take user input
 Scanner scanner = new Scanner(System.in);
 // Taking two input strings from the user
 System.out.println("Enter the first string: ");
 String firstString = scanner.nextLine();
 
 System.out.println("Enter the second string: ");
 String secondString = scanner.nextLine();
 
 // Convert the strings to character arrays
char[] charArray1 = firstString.toCharArray();
 char[] charArray2 = secondString.toCharArray();
 // Perform string length operation
 System.out.println("Length of the first string: " + firstString.length());
 System.out.println("Length of the second string: " + secondString.length());
 // Perform finding a character at a particular position
 System.out.println("Enter the position to find a character (starting from 0): ");
 int position = scanner.nextInt();
 
 if (position >= 0 && position < firstString.length()) {
 System.out.println("Character at position " + position + " in the first string: " + 
charArray1[position]);
 } else {
 System.out.println("Invalid position for the first string.");
 }
 
 // Concatenate the two strings
 String concatenatedString = firstString + secondString;
 System.out.println("Concatenated string: " + concatenatedString);
 // Close the scanner object
 scanner.close();
 }
}
