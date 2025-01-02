public class ExceptionDemo {
 public static void main(String[] args) {
 
 // 1. Demonstrating Arithmetic Exception
 try {
 int result = 10 / 0; // This will cause ArithmeticException
} catch (ArithmeticException e) {
 System.out.println("Arithmetic Exception: Cannot divide by zero");
 }
 // 2. Demonstrating Number Format Exception
 try {
 String str = "abc";
 int num = Integer.parseInt(str); // This will cause NumberFormatException
 } catch (NumberFormatException e) {
 System.out.println("Number Format Exception: Invalid number format");
 }
 // 3. Demonstrating Array Index Out of Bounds Exception
 try {
 int[] arr = new int[5];
 arr[10] = 50; // This will cause ArrayIndexOutOfBoundsException
 } catch (ArrayIndexOutOfBoundsException e) {
 System.out.println("Array Index Out of Bound Exception: Index is out of range");
 }
 // 4. Demonstrating Negative Array Size Exception
 try {
 int size = -5;
 int[] arr = new int[size]; // This will cause NegativeArraySizeException
 } catch (NegativeArraySizeException e) {
 System.out.println("Negative Array Size Exception: Cannot create array with negative size");
 }
 }
}