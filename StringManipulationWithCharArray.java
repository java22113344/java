import java.util.Scanner;
public class StringManipulationWithCharArray {
 public static void main(String[] args) {
 // Create a scanner object to take user input
 Scanner scanner = new Scanner(System.in);
 // Taking two input strings from the user
 System.out.print("Enter the first string: ");
 String firstString = scanner.nextLine();
 
 System.out.print("Enter the second string: ");
 String secondString = scanner.nextLine();
 
 // Convert the strings to character arrays
char[] charArray1 = firstString.toCharArray();
 char[] charArray2 = secondString.toCharArray();
 // a) String length
 int lengthOfFirstString = charArray1.length;
 int lengthOfSecondString = charArray2.length;
 System.out.println("Length of the first string: " + lengthOfFirstString);
 System.out.println("Length of the second string: " + lengthOfSecondString);
 // b) Finding a character at a particular position
 System.out.print("Enter the position to find a character in the first string (starting from 0): ");
 int position = scanner.nextInt();
 
 if (position >= 0 && position < lengthOfFirstString) {
 System.out.println("Character at position " + position + " in the first string: " + 
charArray1[position]);
 } else {
 System.out.println("Invalid position for the first string.");
 }
 // c) Concatenating two strings using character arrays
 char[] concatenatedArray = new char[lengthOfFirstString + lengthOfSecondString];
 
 // Copy characters from first string into the new array
 for (int i = 0; i < lengthOfFirstString; i++) {
 concatenatedArray[i] = charArray1[i];
 }
 
 // Copy characters from second string into the new array
for (int i = 0; i < lengthOfSecondString; i++) {
 concatenatedArray[lengthOfFirstString + i] = charArray2[i];
 }
 // Convert concatenated char array back to string
 String concatenatedString = new String(concatenatedArray);
 System.out.println("Concatenated string: " + concatenatedString);
 // Close the scanner object
 scanner.close();
 }
}