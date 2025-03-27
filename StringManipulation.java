import java.util.Scanner; 
public class StringManipulation { 
 
  
    public static int stringLength(char[] str) { 
        return str.length; 
    } 
 
   
    public static char findCharAtPosition(char[] str, int position) { 
        int length = stringLength(str); 
        if (position < 0 || position >= length) { 
            System.out.println("Invalid position"); 
            return '\0'; 
        } 
        return str[position]; 
    } 
 
    public static char[] concatenateStrings(char[] str1, char[] str2) { 
        int length1 = stringLength(str1); 
        int length2 = stringLength(str2); 
        char[] result = new char[length1 + length2]; 
 
      
        System.arraycopy(str1, 0, result, 0, length1); 
 
       
        System.arraycopy(str2, 0, result, length1, length2); 
        return result; 
    } 
 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
     
        System.out.print("Enter first string: "); 
        String input1 = scanner.nextLine(); 
        System.out.print("Enter second string: "); 
        String input2 = scanner.nextLine(); 
 
   
        char[] str1 = input1.toCharArray(); 
        char[] str2 = input2.toCharArray(); 
 
      
        System.out.println("Length of first string: " + stringLength(str1)); 
 

        System.out.print("Enter position to find character (0-based index): "); 
        int position = scanner.nextInt(); 
 
 
 
        scanner.nextLine();  
        char ch = findCharAtPosition(str1, position); 
        if (ch != '\0') { 
            System.out.println("Character at position " + position + ": " + ch); 
        } 
 
     
        char[] concatenatedString = concatenateStrings(str1, str2); 
        System.out.print("Concatenated string: "); 
        System.out.println(new String(concatenatedString)); 
 
        scanner.close(); 
    } 
} 
