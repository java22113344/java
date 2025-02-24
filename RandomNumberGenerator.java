import java.util.Random; 
import java.util.Scanner; 
 
public class RandomNumberGenerator { 
 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
 
 
        // Step 1: Get the lower and upper limits from the user 
        System.out.print("Enter the lower limit: "); 
        int lower = scanner.nextInt(); 
        System.out.print("Enter the upper limit: "); 
        int upper = scanner.nextInt(); 
 
        // Step 2: Create a Random object to generate random numbers 
        Random random = new Random(); 
 
        // Step 3: Generate a random number between the lower and upper limits (inclusive) 
        int randomNumber = random.nextInt(upper - lower + 1) + lower; 
 
        // Step 4: Print a message based on the generated value 
        System.out.println("Generated Random Number: " + randomNumber); 
         
        if (randomNumber < (lower + upper) / 3) { 
            System.out.println("The value is too low."); 
        } else if (randomNumber >= (lower + upper) / 3 && randomNumber <= 2 * (lower + upper) / 3) { 
            System.out.println("The value is within the expected range."); 
        } else { 
            System.out.println("The value is too high."); 
        } 
 
        // Step 5: End the program 
        scanner.close(); 
    } 
} 
 