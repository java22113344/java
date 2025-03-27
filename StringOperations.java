public class StringOperations { 
 	public static void main(String[] args) { 
         
     
        String str1 = "Hello, "; 
        String str2 = "World!"; 
         
        String concatenatedString = str1 + str2; 
        System.out.println("Concatenated String: " + concatenatedString); 
         
        String searchString = "World"; 
        boolean containsSubstring = concatenatedString.contains(searchString); 
 
        if (containsSubstring) { 
            System.out.println("Substring '" + searchString + "' found in the string."); 
        } else { 
            System.out.println("Substring '" + searchString + "' not found."); 
        } 
         
        String extractedSubstring = concatenatedString.substring(7, 12);  
        System.out.println("Extracted Substring: " + extractedSubstring); 
    } 
} 
