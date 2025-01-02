import java.util.Random;
class RandomNumberGenerator extends Thread {
 private final Thread evenThread;
 private final Thread oddThread;
 public RandomNumberGenerator(Thread evenThread, Thread oddThread) {
this.evenThread = evenThread;
 this.oddThread = oddThread;
 }
 @Override
 public void run() {
 Random random = new Random();
 while (true) {
 int num = random.nextInt(100); // Generate random integer between 0 and 99
 System.out.println("Generated number: " + num);
 if (num % 2 == 0) {
 // If the number is even, start the even thread
 synchronized (evenThread) {
 evenThread.notify();
 }
 } else {
 // If the number is odd, start the odd thread
 synchronized (oddThread) {
 oddThread.notify();
 }
 }
 try {
 Thread.sleep(1000); // Wait for 1 second before generating a new number
 } catch (InterruptedException e) {
 e.printStackTrace();
 }
 }
 }
}
class EvenNumberProcessor extends Thread {
 private final RandomNumberGenerator generator;
 public EvenNumberProcessor(RandomNumberGenerator generator) {
 this.generator = generator;
 }
 @Override
 public void run() {
 while (true) {
 synchronized (this) {
 try {
 wait(); // Wait for the notification from RandomNumberGenerator
 } catch (InterruptedException e) {
 e.printStackTrace();
 }
 int num = new Random().nextInt(100); 
 if (num % 2 == 0) {
 System.out.println("Even number square: " + (num * num));
 }
 }
 }
 }
}
class OddNumberProcessor extends Thread {
 private final RandomNumberGenerator generator;
public OddNumberProcessor(RandomNumberGenerator generator) {
 this.generator = generator;
 }
 @Override
 public void run() {
 while (true) {
 synchronized (this) {
 try {
 wait(); // Wait for the notification from RandomNumberGenerator
 } catch (InterruptedException e) {
 e.printStackTrace();
 }
 int num = new Random().nextInt(100);
 if (num % 2 != 0) {
 System.out.println("Odd number cube: " + (num * num * num));
 }
 }
 }
 }
}
public class MultiThreadExample {
 public static void main(String[] args) {
 // Create threads for processing even and odd numbers
 EvenNumberProcessor evenThread = new EvenNumberProcessor(null);
 OddNumberProcessor oddThread = new OddNumberProcessor(null);
// Create the random number generator and pass the even and odd threads to it
 RandomNumberGenerator generatorThread = new 
RandomNumberGenerator(evenThread, oddThread);
 // Start the threads
 evenThread.start();
 oddThread.start();
  generatorThread.start();
 }
}