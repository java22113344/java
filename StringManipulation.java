import java.util.Scanner; 
public class StringManipulation { 
 
    // Method to calculate string length (though it's not needed in Java) 
    public static int stringLength(char[] str) { 
        return str.length; // Directly using the length property 
    } 
 
    // Method to find character at a particular position 
    public static char findCharAtPosition(char[] str, int position) { 
        int length = stringLength(str); 
        if (position < 0 || position >= length) { 
            System.out.println("Invalid position"); 
            return '\0'; // Return null character if position is invalid 
        } 
        return str[position]; 
    } 
 
    // Method to concatenate two strings (using char arrays here) 
    public static char[] concatenateStrings(char[] str1, char[] str2) { 
        int length1 = stringLength(str1); 
        int length2 = stringLength(str2); 
        char[] result = new char[length1 + length2]; 
 
        // Copy str1 into result 
        System.arraycopy(str1, 0, result, 0, length1); 
 
        // Append str2 to result 
        System.arraycopy(str2, 0, result, length1, length2); 
        return result; 
    } 
 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
        // Taking input for two strings 
        System.out.print("Enter first string: "); 
        String input1 = scanner.nextLine(); 
        System.out.print("Enter second string: "); 
        String input2 = scanner.nextLine(); 
 
        // Convert input strings to character arrays 
        char[] str1 = input1.toCharArray(); 
        char[] str2 = input2.toCharArray(); 
 
        // Perform String length operation 
        System.out.println("Length of first string: " + stringLength(str1)); 
 
        // Perform Finding a character at a particular position 
        System.out.print("Enter position to find character (0-based index): "); 
        int position = scanner.nextInt(); 
 
 
 
        scanner.nextLine();  // Consume the newline character after nextInt() 
        char ch = findCharAtPosition(str1, position); 
        if (ch != '\0') { 
            System.out.println("Character at position " + position + ": " + ch); 
        } 
 
        // Perform Concatenation of two strings 
        char[] concatenatedString = concatenateStrings(str1, str2); 
        System.out.print("Concatenated string: "); 
        System.out.println(new String(concatenatedString)); 
 
        scanner.close(); 
    } 
} 