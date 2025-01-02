class NumberPrinter implements Runnable {
 private int start;
 private int end;
 // Constructor to set the start and end values for the range
 public NumberPrinter(int start, int end) {
 this.start = start;
 this.end = end;
}
 // Shared method to print numbers in the given range
 public void printNumbers() {
 for (int i = start; i <= end; i++) {
 System.out.println(i);
 try {
 Thread.sleep(500); // Adding a delay for better visibility of output
 } catch (InterruptedException e) {
 e.printStackTrace();
 }
 }
 }
 @Override
 public void run() {
 printNumbers();
 }
}
public class ThreadedNumberPrinter {
 public static void main(String[] args) {
 // Create two threads that will print different ranges of numbers
 Thread thread1 = new Thread(new NumberPrinter(1, 10));
 Thread thread2 = new Thread(new NumberPrinter(90, 100));
 // Start the threads
 thread1.start();
 thread2.start();
try {
 // Wait for both threads to finish before ending the program
 thread1.join();
 thread2.join();
 } catch (InterruptedException e) {
 e.printStackTrace();
 }
 }
}