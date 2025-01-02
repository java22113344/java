import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class TrafficLightSimulator extends JFrame {
// Declare components
 private JLabel messageLabel;
 private JRadioButton redButton, yellowButton, greenButton;
 private ButtonGroup buttonGroup;
 public TrafficLightSimulator() {
 // Set title for the frame
 setTitle("Traffic Light Simulator");
 // Set layout of the frame
 setLayout(new FlowLayout());
 // Create a label to display the message
 messageLabel = new JLabel(""); // Initially, no message
 messageLabel.setFont(new Font("Arial", Font.BOLD, 20));
 messageLabel.setPreferredSize(new Dimension(300, 30));
 add(messageLabel);
 // Create radio buttons for Red, Yellow, and Green
 redButton = new JRadioButton("Red");
 yellowButton = new JRadioButton("Yellow");
 greenButton = new JRadioButton("Green");
 // Group the radio buttons so only one can be selected at a time
 buttonGroup = new ButtonGroup();
 buttonGroup.add(redButton);
 buttonGroup.add(yellowButton);
 buttonGroup.add(greenButton);
 // Add radio buttons to the frame
add(redButton);
 add(yellowButton);
 add(greenButton);
 // Add action listeners for the radio buttons
 redButton.addActionListener(new ActionListener() {
 @Override
 public void actionPerformed(ActionEvent e) {
 messageLabel.setText("Stop");
 messageLabel.setForeground(Color.RED);
 }
 });
 yellowButton.addActionListener(new ActionListener() {
 @Override
 public void actionPerformed(ActionEvent e) {
 messageLabel.setText("Ready");
 messageLabel.setForeground(Color.YELLOW);
 }
 });
 greenButton.addActionListener(new ActionListener() {
 @Override
 public void actionPerformed(ActionEvent e) {
 messageLabel.setText("Go");
 messageLabel.setForeground(Color.GREEN);
 }
 });
 // Set frame properties
setSize(400, 200);
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 setVisible(true);
 }
 public static void main(String[] args) {
 // Create the traffic light simulator
 new TrafficLightSimulator();
 }
}