/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 *
 * @author Nathan Liang
 */
public class LoginGUI implements ActionListener {
    private static JLabel logo;
    private static JLabel employeeLabel;
    private static JTextField employeeText;
    private static JLabel passwordLabel;
    private static JPasswordField passwordText;
    private static JButton button;
    private static JLabel success;
    private static JLabel fail;
    private static boolean status = false;
    
    public static void main(String[] args){
        JPanel main = new JPanel();
        JFrame frame = new JFrame();
        frame.setSize(600,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(main);
        main.setLayout(null);
        //create label for logo
        logo = new JLabel("Restaurant Login");
        logo.setBounds(240,60,100,40);
        main.add(logo);
        //create label for employee name
        employeeLabel = new JLabel("Employee ID:");
        employeeLabel.setBounds(80,120,120,25);
        main.add(employeeLabel);
        //create label for id input
        employeeText = new JTextField();
        employeeText.setBounds(200,120,165,25);
        main.add(employeeText);
        //create label for password
        passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(80, 160, 120, 25);
        main.add(passwordLabel);
        //create label for password input
        passwordText =  new JPasswordField();
        passwordText.setBounds(200,160,165,25);
        main.add(passwordText);
        //create button
        button = new JButton("Login");
        button.setBounds(220, 220, 120, 25);
        button.addActionListener(new LoginGUI());
        main.add(button);
        //create label when login success
        success = new JLabel("");
        success.setBounds(210, 270, 300, 25);
        main.add(success);
        
        
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        String id = employeeText.getText();
        String password = passwordText.getText();
        System.out.println(id + "," + password);
        
        if(id.equals("Nathan") && password.equals("simplepassword")){
            success.setText("Login Successful!");
            employeeText.setText("");
            passwordText.setText("");
        }
        else
        {
            success.setText("Wrong login credential, try again");
        }
    }
}
