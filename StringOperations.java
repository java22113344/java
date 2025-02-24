public class StringOperations { 
 	public static void main(String[] args) { 
         
        // Initialize two strings 
        String str1 = "Hello, "; 
        String str2 = "World!"; 
         
        // a) String Concatenation 
        String concatenatedString = str1 + str2;  // Concatenates str1 and str2 
        System.out.println("Concatenated String: " + concatenatedString); 
         
        // b) Search a substring 
        String searchString = "World"; 
        boolean containsSubstring = concatenatedString.contains(searchString); 
 
        if (containsSubstring) { 
            System.out.println("Substring '" + searchString + "' found in the string."); 
        } else { 
            System.out.println("Substring '" + searchString + "' not found."); 
        } 
         
        // c) Extract a substring from the given string 
        String extractedSubstring = concatenatedString.substring(7, 12);  // Extracts "World" 
        System.out.println("Extracted Substring: " + extractedSubstring); 
    } 
} 