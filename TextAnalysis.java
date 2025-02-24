import java.util.Scanner; 
public class TextAnalysis { 
 
         public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
 

        // Step 1: Prompt the user to enter the text 
        System.out.println("Enter the text (type 'exit' on a new line to stop):"); 
 
        // Initialize counters 
        int charCount = 0; 
        int wordCount = 0; 
        int lineCount = 0; 
 
        // Step 2: Read the input line by line 
        while (scanner.hasNextLine()) { 
            String line = scanner.nextLine(); 
 
            // Exit condition: if the user types 'exit' on a new line 
            if (line.equalsIgnoreCase("exit")) { 
                break; 
            } 
            // Increment line count 
            lineCount++; 
 
            // Step 3: Count words in the line (split by spaces) 
            String[] words = line.split("\\s+"); 
            wordCount += words.length; 
 
            // Step 4: Count characters (including spaces) 
            charCount += line.length(); 
        } 
        // Step 5: Output the results 
        System.out.println("Total number of characters: " + charCount); 
        System.out.println("Total number of words: " + wordCount); 
        System.out.println("Total number of lines: " + lineCount); 
        scanner.close(); 
    } 
}