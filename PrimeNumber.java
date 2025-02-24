import java.util.Scanner; 
public class PrimeNumbers { 
     public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in); 
        // Step 1: Get user input 
           System.out.print("Enter an integer: "); 
           int n = scanner.nextInt(); 
 
          // Step 2: Loop from 2 to n 
          System.out.println("Prime numbers up to " + n + ":"); 
           for (int i = 2; i <= n; i++) { 
              boolean isPrime = true; 
 
            // Step 3: Check if i is prime 
            for (int j = 2; j < i; j++) { 
                if (i % j == 0) { 
                    isPrime = false; 
                    break; 
                } 
            } 
 
            // Step 4: If prime, print it 
            if (isPrime) { 
                System.out.print(i + " "); 
            } 
        } 
        System.out.println();  // New line after output 
        scanner.close(); 
    } 
} 
 