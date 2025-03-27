import javax.swing.*; 
import java.awt.*; 
import java.awt.event.ActionListener; 
 
public class TrafficLight { 
    public static void main(String[] args) { 
    
        JFrame frame = new JFrame("Traffic Light Simulator"); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame.setSize(300, 200); 
 
        JLabel messageLabel = new JLabel("", SwingConstants.CENTER); 
        messageLabel.setFont(new Font("Arial", Font.BOLD, 16)); 
 
        JRadioButton redButton = new JRadioButton("Red"); 
        JRadioButton yellowButton = new JRadioButton("Yellow"); 
        JRadioButton greenButton = new JRadioButton("Green"); 
 
    
        ButtonGroup buttonGroup = new ButtonGroup(); 
        buttonGroup.add(redButton); 
        buttonGroup.add(yellowButton); 
        buttonGroup.add(greenButton); 
 
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
 
        JPanel buttonPanel = new JPanel(); 
        buttonPanel.add(redButton); 
        buttonPanel.add(yellowButton); 
        buttonPanel.add(greenButton);  
        frame.add(messageLabel, BorderLayout.NORTH); 
        frame.add(buttonPanel, BorderLayout.CENTER);  
        frame.setVisible(true); 
    } 
} 
