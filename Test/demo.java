import java.awt.*;
import java.awt.event.*;

 class InputFrame extends Frame {
    private TextField textField;
    
    public InputFrame() {
       
        textField = new TextField(20); // 20 is the initial width of the text field
        
        // Create a button
        Button submitButton = new Button("Submit");
        
        // Create a label to display the entered text
        Label resultLabel = new Label("Entered Text: ");
        
        // Create a panel to hold the components
        Panel panel = new Panel();
        
        // Add components to the panel
        panel.add(textField);
        panel.add(submitButton);
        panel.add(resultLabel);
        
        // Add the panel to the frame
        add(panel);
        
        // Create an action listener for the submit button
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Get the text from the text field
                String enteredText = textField.getText();
                
                // Display the entered text in the label
                resultLabel.setText("Entered Text: " + enteredText);
            }
        });
        
        // Set the layout manager for the frame
        setLayout(new FlowLayout());
        
        // Set the frame size and make it visible
        setSize(300, 100);
        setVisible(true);
        
        // Handle window close event
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }
    
    public static void main(String[] args) {
        new InputFrame();
    }
}
