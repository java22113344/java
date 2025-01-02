import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class SimpleCalculator extends JFrame implements ActionListener {
 // Declare components
 private JTextField textField;
 private String currentInput = "";
 private String operator = "";
 private double num1 = 0;
private double num2 = 0;
 private boolean operatorClicked = false;
 public SimpleCalculator() {
 // Set title for the frame
 setTitle("Simple Calculator");
 // Set layout of the frame
 setLayout(new BorderLayout());
 // Create the text field for displaying the result
 textField = new JTextField();
 textField.setEditable(false);
 textField.setFont(new Font("Arial", Font.PLAIN, 24));
 textField.setHorizontalAlignment(JTextField.RIGHT);
 add(textField, BorderLayout.NORTH);
 // Create panel with grid layout for buttons
 JPanel panel = new JPanel();
 panel.setLayout(new GridLayout(4, 4, 10, 10)); // 4 rows, 4 columns
 // Add buttons for digits and operations
 String[] buttons = {
 "7", "8", "9", "/",
 "4", "5", "6", "*",
 "1", "2", "3", "-",
 "0", ".", "=", "+"
 };
 for (String text : buttons) {
JButton button = new JButton(text);
 button.addActionListener(this);
 panel.add(button);
 }
 // Add the panel to the frame
 add(panel, BorderLayout.CENTER);
 // Set frame properties
 setSize(400, 500);
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 setVisible(true);
 }
 @Override
 public void actionPerformed(ActionEvent e) {
 String command = e.getActionCommand();
 // If the user presses a digit or decimal point, append it to the current input
 if (command.charAt(0) >= '0' && command.charAt(0) <= '9' || command.charAt(0) == 
'.') {
 if (operatorClicked) {
 currentInput = "";
 operatorClicked = false;
 }
 currentInput += command;
 textField.setText(currentInput);
 }
 // If the user presses an operator (+, -, *, /)
 else if (command.charAt(0) == '+' || command.charAt(0) == '-' || command.charAt(0) == 
'*' || command.charAt(0) == '/') {
if (!currentInput.isEmpty()) {
 num1 = Double.parseDouble(currentInput);
 operator = command;
 operatorClicked = true;
 }
 }
 // If the user presses the "=" button
 else if (command.equals("=")) {
 if (!currentInput.isEmpty()) {
 num2 = Double.parseDouble(currentInput);
 double result = 0;
 try {
 switch (operator) {
 case "+":
 result = num1 + num2;
 break;
 case "-":
 result = num1 - num2;
 break;
 case "*":
 result = num1 * num2;
 break;
 case "/":
 if (num2 == 0) {
 throw new ArithmeticException("Cannot divide by zero");
 }
 result = num1 / num2;
 break;
 case "%":
result = num1 % num2;
 break;
 }
 textField.setText(String.valueOf(result));
 } catch (ArithmeticException ex) {
 textField.setText("Error: " + ex.getMessage());
 }
 }
 }
 }
 public static void main(String[] args) {
 // Create the calculator frame
 new SimpleCalculator();
 }
}