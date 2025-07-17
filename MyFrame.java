import javax.swing.*;  
import java.awt.*;  
import java.awt.event.*;  

// Step 1, 5, 6: Define class, constructor, and set title using super
public class MyFrame extends JFrame {

    // Step 3: Declare necessary components
    private JButton button;
    private JTextField textField;
    private JLabel label;

    // Constructor
    public MyFrame() {
        super("My Simple Java GUI"); // Step 6: Set title using super

        // Step 2: Set up a layout (new FlowLayout)
        setLayout(new FlowLayout());

        // Step 4: Initialize components
        label = new JLabel("Click the button:");
        button = new JButton("Click Me");
        textField = new JTextField(15);

        // Step 4 (continued): Add components to the frame
        add(label);
        add(button);
        add(textField);

        // Step 7: Add event handling
        ButtonHandler handler = new ButtonHandler(); // Step 9: Create inner class object
        button.addActionListener(handler); // Register with button
    }

    // Step 8: Declare inner class which implements ActionListener
    private class ButtonHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            // On button click, update the text field
            textField.setText("Button Clicked!");
        }
    }

    // Main method to run the program
    public static void main(String[] args) {
        MyFrame frame = new MyFrame(); // Create frame object
        frame.setSize(300, 150);       // Set size
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);        // Show frame
    }
}
