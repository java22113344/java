import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 
 
public class SimpleCalculator extends JFrame implements ActionListener { 
 
    // Components 
    private JTextField textField; 
    private double firstOperand = 0; 
    private double secondOperand = 0; 
 
 
    private String operator = ""; 
    private boolean isNewInput = true; 
 
    public SimpleCalculator() { 
        // Frame setup 
        setTitle("My Calculator"); 
        setSize(400, 500); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        setLayout(new BorderLayout()); 
 
        // Text field for display 
        textField = new JTextField(); 
        textField.setHorizontalAlignment(JTextField.RIGHT); 
        textField.setEditable(false); 
        textField.setFont(new Font("Arial", Font.BOLD, 24)); 
        add(textField, BorderLayout.NORTH); 
 
        // Buttons panel 
        JPanel buttonPanel = new JPanel(); 
        buttonPanel.setLayout(new GridLayout(4, 4, 5, 5)); 
 
        // Buttons for digits and operations 
        String[] buttons = { 
            "7", "8", "9", "+", 
            "4", "5", "6", "-", 
            "1", "2", "3", "*", 
            "C", "0", "=", "/" 
        }; 
 
        for (String text : buttons) { 
            JButton button = new JButton(text); 
            button.setFont(new Font("Arial", Font.BOLD, 20)); 
            button.addActionListener(this); 
            buttonPanel.add(button); 
        } 
 
        add(buttonPanel, BorderLayout.CENTER); 
    } 
 
    @Override 
    public void actionPerformed(ActionEvent e) { 
        String command = e.getActionCommand(); 
  
  try { 
            if (command.charAt(0) >= '0' && command.charAt(0) <= '9') { 
                if (isNewInput) { 
                    textField.setText(command); 
                    isNewInput = false; 
                } else { 
                    textField.setText(textField.getText() + command); 
                } 
            }  
 
 
else if (command.equals("C")) { 
                textField.setText(""); 
                firstOperand = 0; 
                secondOperand = 0; 
                operator = ""; 
                isNewInput = true; 
            } else if (command.equals("=")) { 
                secondOperand = Double.parseDouble(textField.getText()); 
                switch (operator) { 
                    case "+": 
                        textField.setText(String.valueOf(firstOperand + secondOperand)); 
                        break; 
                    case "-": 
                        textField.setText(String.valueOf(firstOperand - secondOperand)); 
                        break; 
                    case "*": 
                        textField.setText(String.valueOf(firstOperand * secondOperand)); 
                        break; 
                    case "%": 
                        if (secondOperand == 0) { 
                            textField.setText("Error: Divide by 0"); 
                        } else { 
                            textField.setText(String.valueOf(firstOperand / secondOperand)); 
                        } 
                        break; 
                    default: 
                        textField.setText("Error: Invalid operation"); 
                } 
                isNewInput = true; 
            } else { 
                firstOperand = Double.parseDouble(textField.getText()); 
                operator = command; 
                isNewInput = true; 
            } 
        } catch (Exception ex) { 
            textField.setText("Error: " + ex.getMessage()); 
        } 
    } 
 
    public static void main(String[] args) { 
        SwingUtilities.invokeLater(() -> { 
            SimpleCalculator calculator = new SimpleCalculator(); 
            calculator.setVisible(true); 
        }); 
    } 
} 
 