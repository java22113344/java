import java.util.Scanner;
public class PrimeNumber {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 System.out.print("Enter an integer: ");
 int number = scanner.nextInt();
 System.out.println("Prime numbers up to " + number + ":");
 for (int i = 2; i <= number; i++) {
 boolean isPrime = true;
 for (int j = 2; j <= Math.sqrt(i); j++) {
 if (i % j == 0) {
 isPrime = false;
 break;
 }
 }
 if (isPrime) {
 System.out.print(i + " "); 
 }
 }
 }
}