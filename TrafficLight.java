import javax.swing.*; 
import java.awt.*; 
import java.awt.event.ActionListener; 
 
public class TrafficLight { 
    public static void main(String[] args) { 
        // Create the main frame 
        JFrame frame = new JFrame("Traffic Light Simulator"); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame.setSize(300, 200); 
 
        // Create the message label 
        JLabel messageLabel = new JLabel("", SwingConstants.CENTER); 
        messageLabel.setFont(new Font("Arial", Font.BOLD, 16)); 
 
        // Create radio buttons 
        JRadioButton redButton = new JRadioButton("Red"); 
        JRadioButton yellowButton = new JRadioButton("Yellow"); 
        JRadioButton greenButton = new JRadioButton("Green"); 
 
        // Group the radio buttons 
        ButtonGroup buttonGroup = new ButtonGroup(); 
        buttonGroup.add(redButton); 
        buttonGroup.add(yellowButton); 
        buttonGroup.add(greenButton); 
 
        // Add action listeners for the buttons 
        ActionListener actionListener = e -> { 
            if (redButton.isSelected()) { 
                messageLabel.setText("Stop"); 
                messageLabel.setForeground(Color.RED); 
            } else if (yellowButton.isSelected()) { 
                messageLabel.setText("Slow Down"); 
                messageLabel.setForeground(Color.ORANGE); 
            } else if (greenButton.isSelected()) { 
                messageLabel.setText("Continue"); 
                messageLabel.setForeground(Color.GREEN); 
            } 
        }; 
 
        redButton.addActionListener(actionListener); 
        yellowButton.addActionListener(actionListener); 
        greenButton.addActionListener(actionListener); 
 
        // Create a panel for the buttons 
        JPanel buttonPanel = new JPanel(); 
        buttonPanel.add(redButton); 
        buttonPanel.add(yellowButton); 
        buttonPanel.add(greenButton); 
 
 
 
 
 
        // Add components to the frame 
        frame.add(messageLabel, BorderLayout.NORTH); 
        frame.add(buttonPanel, BorderLayout.CENTER); 
 
        // Make the frame visible 
        frame.setVisible(true); 
    } 
} 