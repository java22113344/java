import java.util.Scanner;
public class MatrixMultiplication {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 System.out.print("Enter the number of rows and columns of the first matrix: ");
 int rows1 = scanner.nextInt();
 int cols1 = scanner.nextInt();
 System.out.print("Enter the number of rows and columns of the second matrix: ");
 int rows2 = scanner.nextInt();
 int cols2 = scanner.nextInt();
 if (cols1 != rows2) {
 System.out.println("Error: Number of columns of the first matrix must be equal to the number 
of rows of the second matrix.");
 return;
 }
int[][] matrix1 = new int[rows1][cols1];
 int[][] matrix2 = new int[rows2][cols2];
 int[][] result = new int[rows1][cols2];
 // Input values for matrix1
 System.out.println("Enter the elements of the first matrix:");
 for (int i = 0; i < rows1; i++) {
 for (int j = 0; j < cols1; j++) {
 matrix1[i][j] = scanner.nextInt();
 }
 }
 // Input values for matrix2
 System.out.println("Enter the elements of the second matrix:");
 for (int i = 0; i < rows2; i++) {
 for (int j = 0; j < cols2; j++) {
 matrix2[i][j] = scanner.nextInt();
 }
 }
 // Multiply the matrices
 for (int i = 0; i < rows1; i++) {
 for (int j = 0; j < cols2; j++) {
 for (int k = 0; k < cols1; k++) {
 result[i][j] += matrix1[i][k] * matrix2[k][j];
 }
 }
 }
 // Print the result
 System.out.println("Product of the matrices:");
 for (int i = 0; i < rows1; i++) {
 for (int j = 0; j < cols2; j++) {
 System.out.print(result[i][j] + " ");
 }
 System.out.println();
 }
 }
}