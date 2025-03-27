public class ExceptionDemo { 
 
    public static void main(String[] args) { 
 
      
   try { 
            int result = 10 / 0;  
        } catch (ArithmeticException e) { 
            System.out.println("ArithmeticException: Cannot divide by zero!"); 
        } 
 
    
        try { 
            int number = Integer.parseInt("abc123"); 
        } catch (NumberFormatException e) { 
            System.out.println("NumberFormatException: Invalid number format!"); 
        } 
 
        
       try { 
            int[] arr = new int[5]; 
            arr[10] = 100;   
        } catch (ArrayIndexOutOfBoundsException e) { 
            System.out.println("ArrayIndexOutOfBoundsException: Index out of bounds!"); 
        } 
 
        try { 
            int[] arr = new int[-5];  
        } catch (NegativeArraySizeException e) { 
            System.out.println("NegativeArraySizeException: Array size cannot be negative!"); 
        } 
    } 
}
