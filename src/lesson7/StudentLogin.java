package lesson7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;


public class StudentLogin extends JFrame {

    private JTextField uName;
    private JPasswordField password;
    private JButton btn;
    private JPanel panelLogin;

    public StudentLogin() {
        setVisible(true);
        // Terminates the application when the frame is closed.
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Login Form");
        // Provide the frame width and height
        setSize(400, 400);
        // Make your screen center
        setLocationRelativeTo(null);
        setResizable(false);// If you wish
        setContentPane(panelLogin);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Read the Username and Password
                String username = uName.getText();
                char[] pwd = password.getPassword();
                // Perform validation
                if (username.isEmpty() || pwd.length == 0) {
                    JOptionPane.showMessageDialog(null, "Please enter both username and password", "Error", JOptionPane.ERROR_MESSAGE);
                } else if (username.equals("admin") && Arrays.equals(pwd, "admin123".toCharArray())) {
                    JOptionPane.showMessageDialog(null, "Login Successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid username or password", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                StudentLogin mf = new StudentLogin();
            }
        });
    }

}
