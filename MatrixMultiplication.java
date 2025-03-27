import java.util.Scanner; 
 
public class MatrixMultiplication { 
public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
 

        System.out.print("Enter number of rows for matrix 1: "); 
        int rows1 = scanner.nextInt(); 
        System.out.print("Enter number of columns for matrix 1: "); 
        int cols1 = scanner.nextInt(); 
 
 
        System.out.print("Enter number of rows for matrix 2: "); 
        int rows2 = scanner.nextInt(); 
        System.out.print("Enter number of columns for matrix 2: "); 
        int cols2 = scanner.nextInt(); 
 
   
        if (cols1 != rows2) { 
            System.out.println("Matrix multiplication is not possible due to incompatible dimensions."); 
            return; 
        } 
 
        int[][] matrix1 = new int[rows1][cols1]; 
        int[][] matrix2 = new int[rows2][cols2]; 
 
        System.out.println("Enter elements for matrix 1:"); 
        for (int i = 0; i < rows1; i++) { 
            for (int j = 0; j < cols1; j++) { 
                matrix1[i][j] = scanner.nextInt(); 
            } 
        } 
 
        System.out.println("Enter elements for matrix 2:"); 
        for (int i = 0; i < rows2; i++) { 
            for (int j = 0; j < cols2; j++) { 
                matrix2[i][j] = scanner.nextInt(); 
            } 
        } 
 
      
        int[][] resultMatrix = new int[rows1][cols2]; 
 
        for (int i = 0; i < rows1; i++) { 
            for (int j = 0; j < cols2; j++) { 
                resultMatrix[i][j] = 0; 
                for (int k = 0; k < cols1; k++) { 
                    resultMatrix[i][j] += matrix1[i][k] * matrix2[k][j]; 
                } 
 
            } 
        } 
      
 
        System.out.println("Resulting Matrix after multiplication:"); 
        for (int i = 0; i < rows1; i++) { 
            for (int j = 0; j < cols2; j++) { 
                System.out.print(resultMatrix[i][j] + " "); 
            } 
            System.out.println(); 
        } 
 
        scanner.close(); 
    } 
} 
