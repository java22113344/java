import java.util.Random;
public class RandomNumberRange {
 public static void main(String[] args) {
 // Define the range limits
 int lowerLimit = 1;
 int upperLimit = 100;
 
 // Create a Random object
 Random random = new Random();
 
 // Generate a random number between the lower and upper limits (inclusive)
 int randomNumber = random.nextInt(upperLimit - lowerLimit + 1) + lowerLimit;
 
 // Print the generated random number
 System.out.println("Generated Random Number: " + randomNumber);
 
 // Check and print messages based on the value of the random number
 if (randomNumber >= 1 && randomNumber <= 20) {
 System.out.println("The number is between 1 and 20.");
 } else if (randomNumber >= 21 && randomNumber <= 40) {
 System.out.println("The number is between 21 and 40.");
 } else if (randomNumber >= 41 && randomNumber <= 60) {
 System.out.println("The number is between 41 and 60.");
 } else if (randomNumber >= 61 && randomNumber <= 80) {
 System.out.println("The number is between 61 and 80.");
 } else {
 System.out.println("The number is between 81 and 100.");
}
 }
}
