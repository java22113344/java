import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class FontChanger extends JFrame {
 
 private JTextArea textArea;
 private JComboBox<String> fontSizeCombo;
 private JCheckBox boldCheckBox, italicCheckBox;
 private String[] fontSizes = {"10", "12", "14", "16", "18", "20", "24", "28", "30"};
public FontChanger() {
 // Set the title of the window
 setTitle("Text Font Customizer");
 
 // Set the layout manager
 setLayout(new BorderLayout());
 // Create text area for displaying the text
 textArea = new JTextArea("Enter text here...");
 textArea.setFont(new Font("Arial", Font.PLAIN, 14));
 JScrollPane scrollPane = new JScrollPane(textArea);
 add(scrollPane, BorderLayout.CENTER);
 // Panel to hold controls (font size, bold, italic)
 JPanel panel = new JPanel();
 panel.setLayout(new FlowLayout());
 // Font size combo box
 fontSizeCombo = new JComboBox<>(fontSizes);
 fontSizeCombo.setSelectedIndex(1); // Default to 12
 fontSizeCombo.addActionListener(new ActionListener() {
 @Override
 public void actionPerformed(ActionEvent e) {
 updateFont();
 }
 });
 // Bold check box
 boldCheckBox = new JCheckBox("Bold");
 boldCheckBox.addActionListener(new ActionListener() {
@Override
 public void actionPerformed(ActionEvent e) {
 updateFont();
 }
 });
 // Italic check box
 italicCheckBox = new JCheckBox("Italic");
 italicCheckBox.addActionListener(new ActionListener() {
 @Override
 public void actionPerformed(ActionEvent e) {
 updateFont();
 }
 });
 // Add the controls to the panel
 panel.add(new JLabel("Font Size:"));
 panel.add(fontSizeCombo);
 panel.add(boldCheckBox);
 panel.add(italicCheckBox);
 // Add the control panel to the top of the frame
 add(panel, BorderLayout.NORTH);
 // Set frame properties
 setSize(500, 400);
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 setVisible(true);
 }
// Method to update the font based on selected options
 private void updateFont() {
 String fontName = "Arial"; // You can set the font name as needed
 int fontSize = Integer.parseInt((String) fontSizeCombo.getSelectedItem());
 int fontStyle = Font.PLAIN;
 
 if (boldCheckBox.isSelected() && italicCheckBox.isSelected()) {
 fontStyle = Font.BOLD | Font.ITALIC;
 } else if (boldCheckBox.isSelected()) {
 fontStyle = Font.BOLD;
 } else if (italicCheckBox.isSelected()) {
 fontStyle = Font.ITALIC;
 }
 
 // Update the font of the text area
 textArea.setFont(new Font(fontName, fontStyle, fontSize));
 }
 public static void main(String[] args) {
 // Run the GUI in the Event Dispatch Thread (EDT)
 SwingUtilities.invokeLater(new Runnable() {
 @Override
 public void run() {
 new FontChanger();
 }
 });
 }
}