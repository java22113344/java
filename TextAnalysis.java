import java.util.Scanner; 
public class TextAnalysis { 
 
         public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
 

      
        System.out.println("Enter the text (type 'exit' on a new line to stop):"); 
 
        int charCount = 0; 
        int wordCount = 0; 
        int lineCount = 0; 
 
        
        while (scanner.hasNextLine()) { 
            String line = scanner.nextLine(); 
 
            if (line.equalsIgnoreCase("exit")) { 
                break; 
            } 
         
            lineCount++; 
 
          
            String[] words = line.split("\\s+"); 
            wordCount += words.length; 
 
            charCount += line.length(); 
        } 
     
        System.out.println("Total number of characters: " + charCount); 
        System.out.println("Total number of words: " + wordCount); 
        System.out.println("Total number of lines: " + lineCount); 
        scanner.close(); 
    } 
}
