import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPanel extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;

    public LoginPanel() {
        setTitle("Login Panel");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null); // Center the frame on the screen

        // Create and configure the username label
        JLabel usernameLabel = new JLabel("Username:");
        usernameField = new JTextField(20);

        // Create and configure the password label
        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField(20);

        // Create the login button
        JButton loginButton = new JButton("Login");
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                char[] password = passwordField.getPassword();

                // Perform login authentication here
                if (username.equals("admin") && String.valueOf(password).equals("password")) {
                    JOptionPane.showMessageDialog(LoginPanel.this, "Login successful!");
                } else {
                    JOptionPane.showMessageDialog(LoginPanel.this, "Invalid username or password!");
                }

                // Clear the fields after login attempt
                usernameField.setText("");
                passwordField.setText("");
            }
        });

        // Create the layout
        JPanel panel = new JPanel(new GridLayout(3, 2));
        panel.add(usernameLabel);
        panel.add(usernameField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(loginButton);

        // Add the panel to the frame
        getContentPane().add(panel);

        // Display the frame
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LoginPanel();
            }
        });
    }
}
