import java.util.Random; 
import java.util.Scanner; 
 
public class RandomNumberGenerator { 
 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
 
 

        System.out.print("Enter the lower limit: "); 
        int lower = scanner.nextInt(); 
        System.out.print("Enter the upper limit: "); 
        int upper = scanner.nextInt(); 
 
       
        Random random = new Random(); 
 
      
        int randomNumber = random.nextInt(upper - lower + 1) + lower; 
 
 
        System.out.println("Generated Random Number: " + randomNumber); 
         
        if (randomNumber < (lower + upper) / 3) { 
            System.out.println("The value is too low."); 
        } else if (randomNumber >= (lower + upper) / 3 && randomNumber <= 2 * (lower + upper) / 3) { 
            System.out.println("The value is within the expected range."); 
        } else { 
            System.out.println("The value is too high."); 
        } 
 
        scanner.close(); 
    } 
} 
 
