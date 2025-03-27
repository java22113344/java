import javax.swing.*; 
import java.awt.*; 
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 
 
public class SimpleFontChanger extends JFrame { 
    public SimpleFontChanger() { 
       
        setTitle("Simple Font Changer"); 
        setSize(400, 200); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        setLayout(new FlowLayout()); 
 
        JLabel inputLabel = new JLabel("Enter Text:"); 
        add(inputLabel); 
        JTextField textField = new JTextField(20); 
        add(textField); 
   
        JLabel sizeLabel = new JLabel("Font Size:"); 
        add(sizeLabel); 
        String[] sizes = {"12", "16", "20", "24"}; 
        JComboBox<String> sizeCombo = new JComboBox<>(sizes); 
        add(sizeCombo); 
 
      
        JCheckBox boldCheckBox = new JCheckBox("Bold"); 
        JCheckBox italicCheckBox = new JCheckBox("Italic"); 
        add(boldCheckBox); 
        add(italicCheckBox); 
 
        JLabel displayLabel = new JLabel("Your text will appear here."); 
        displayLabel.setPreferredSize(new Dimension(350, 50)); 
        displayLabel.setHorizontalAlignment(SwingConstants.CENTER); 
        add(displayLabel); 
      
        JButton  applyButton = new JButton("Apply"); 
        add(applyButton); 
 
      
        applyButton.addActionListener(new ActionListener() { 
            @Override 
            public void actionPerformed(ActionEvent e) {
                String text = textField.getText(); 
                int fontSize = Integer.parseInt((String) sizeCombo.getSelectedItem()); 
                int fontStyle = Font.PLAIN; 
 
                if (boldCheckBox.isSelected()) { 
                    fontStyle |= Font.BOLD; 
                } 
 
                if (italicCheckBox.isSelected()) { 
                    fontStyle |= Font.ITALIC; 
                } 
 
                Font font = new Font("Serif", fontStyle, fontSize); 
                displayLabel.setFont(font); 
                displayLabel.setText(text.isEmpty() ? "Your text will appear here." : text); 
            } 
        }); 
    } 
 
   public static void main(String[] args) { 
        SwingUtilities.invokeLater(() -> { 
            SimpleFontChanger frame = new SimpleFontChanger(); 
            frame.setVisible(true); 
        }); 
    } 
} 
