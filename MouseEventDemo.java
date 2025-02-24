import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 
 
public class MouseEventDemo extends JFrame { 
    private JLabel label; 
 
    public MouseEventDemo() { 
        // Set up the frame 
        setTitle("Mouse Event Demo"); 
        setSize(400, 300); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        setLayout(new BorderLayout()); 
 
        // Create and add the label 
        label = new JLabel("Perform a Mouse Action", SwingConstants.CENTER); 
        label.setFont(new Font("Arial", Font.BOLD, 16)); 
        add(label, BorderLayout.CENTER); 
 
        // Add a custom MouseAdapter 
        addMouseListener(new MouseEventHandler()); 
    } 
 
    // Inner class to handle mouse events using MouseAdapter 
    private class MouseEventHandler extends MouseAdapter { 
        @Override 
        public void mouseClicked(MouseEvent e) { 
            label.setText("Mouse Clicked"); 
        } 
 
        @Override 
        public void mousePressed(MouseEvent e) { 
            label.setText("Mouse Pressed"); 
        } 
 
        @Override 
        public void mouseReleased(MouseEvent e) { 
            label.setText("Mouse Released"); 
        } 
 
        @Override 
        public void mouseEntered(MouseEvent e) { 
            label.setText("Mouse Entered"); 
        } 
 
        @Override 
        public void mouseExited(MouseEvent e) { 
            label.setText("Mouse Exited"); 
        } 
    } 
 
 
    public static void main(String[] args) { 
        SwingUtilities.invokeLater(() -> { 
            MouseEventDemo demo = new MouseEventDemo(); 
            demo.setVisible(true); 
        }); 
    } 
} 
 
