import java.util.Scanner; 
public class StringBufferOperations { 
public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
         
        System.out.print("Enter a string: "); 
 
        String inputString = scanner.nextLine(); 
     
        StringBuffer stringBuffer = new StringBuffer(inputString); 
         
   
        int length = stringBuffer.length(); 
        System.out.println("Length of the string: " + length); 
         
     
        StringBuffer reversedString = stringBuffer.reverse(); 
        System.out.println("Reversed string: " + reversedString); 
         
     
        System.out.print("Enter the starting index for deletion: "); 
        int startIndex = scanner.nextInt(); 
        System.out.print("Enter the ending index for deletion: "); 
        int endIndex = scanner.nextInt(); 
         
      
        stringBuffer.delete(startIndex, endIndex); 
        System.out.println("String after deletion: " + stringBuffer); 
         
       
        scanner.close(); 
    } 
} 
