public class ExceptionDemo { 
 
    public static void main(String[] args) { 
 
        // Demonstrating ArithmeticException 
      
   try { 
            int result = 10 / 0;  // Division by zero 
        } catch (ArithmeticException e) { 
            System.out.println("ArithmeticException: Cannot divide by zero!"); 
        } 
 
        // Demonstrating NumberFormatException 
        try { 
            int number = Integer.parseInt("abc123");  // Invalid number format 
        } catch (NumberFormatException e) { 
            System.out.println("NumberFormatException: Invalid number format!"); 
        } 
 
        // Demonstrating ArrayIndexOutOfBoundsException 
       try { 
            int[] arr = new int[5]; 
            arr[10] = 100;  // Index out of bounds 
        } catch (ArrayIndexOutOfBoundsException e) { 
            System.out.println("ArrayIndexOutOfBoundsException: Index out of bounds!"); 
        } 
 
        // Demonstrating NegativeArraySizeException 
        try { 
            int[] arr = new int[-5];  // Negative array size 
        } catch (NegativeArraySizeException e) { 
            System.out.println("NegativeArraySizeException: Array size cannot be negative!"); 
        } 
    } 
}