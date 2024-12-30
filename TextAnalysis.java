import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class TextAnalysis {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 System.out.print("Enter the file name: ");
 String fileName = scanner.nextLine();
 try {
 File file = new File(fileName);
Scanner fileScanner = new Scanner(file);
 int lines = 0, words = 0, characters = 0;
 while (fileScanner.hasNextLine()) {
 lines++;
 String line = fileScanner.nextLine();
 characters += line.length();
 words += line.split("\\s+").length;
 }
 fileScanner.close();
 System.out.println("Number of lines: " + lines);
 System.out.println("Number of words: " + words);
 System.out.println("Number of characters: " + characters);
 } catch (FileNotFoundException e) {
 System.out.println("File not found.");
 }
 }
}