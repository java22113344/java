import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MouseEventExample extends JFrame {
 
 private String eventName = "No Event";
 public MouseEventExample() {
 // Set the title of the window
 setTitle("Mouse Event Handler");
 // Set the window size
 setSize(400, 400);
 // Set the close operation
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 // Create a label to display the event name
 JLabel label = new JLabel(eventName, JLabel.CENTER);
 label.setFont(new Font("Arial", Font.BOLD, 20));
 add(label);
 // Add a MouseListener using MouseAdapter (to handle all mouse events)
 addMouseListener(new MouseAdapter() {
 @Override
 public void mousePressed(MouseEvent e) {
 eventName = "Mouse Pressed";
 label.setText(eventName);
 repaint();
}
 @Override
 public void mouseReleased(MouseEvent e) {
 eventName = "Mouse Released";
 label.setText(eventName);
 repaint();
 }
 @Override
 public void mouseClicked(MouseEvent e) {
 eventName = "Mouse Clicked";
 label.setText(eventName);
 repaint();
 }
 @Override
 public void mouseEntered(MouseEvent e) {
 eventName = "Mouse Entered";
 label.setText(eventName);
 repaint();
 }
 @Override
 public void mouseExited(MouseEvent e) {
 eventName = "Mouse Exited";
 label.setText(eventName);
 repaint();
 }
 });
// Make the frame visible
 setVisible(true);
 }
 public static void main(String[] args) {
 // Run the application
 SwingUtilities.invokeLater(new Runnable() {
 @Override
 public void run() {
 new MouseEventExample();
 }
 });
 }
}
