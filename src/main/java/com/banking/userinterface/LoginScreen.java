package com.banking.userinterface;

import javax.swing.*;

import com.banking.controller.LoginController;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import static com.sun.java.accessibility.util.AWTEventMonitor.addActionListener;
public class LoginScreen extends JFrame implements ActionListener {
	private int failureCount=0;
    private  int code;
    private JLabel usernameLabel,passwordLabel,captcha;
    private JTextField usernameTextField,captchaField;
    private JPasswordField passwordTextField;
    private JButton login;
    public LoginScreen(){
        this.setLayout(null);
        this.setVisible(true);
        this.getContentPane().setBackground(Color.BLUE);
        usernameLabel = new JLabel("Username");
        passwordLabel = new JLabel("Password");
        captcha = new JLabel();
        usernameTextField = new JTextField();
        passwordTextField = new JPasswordField();
        captchaField = new JTextField();
        login = new JButton("Login");
        usernameLabel.setBounds(20,50,100,20);
        passwordLabel.setBounds(20,80,100,20);
        captcha.setBounds(65,120,100,20);
        usernameTextField.setBounds(130,50,100,20);
        passwordTextField.setBounds(130,80,100,20);
        captchaField.setBounds(175,120,100,20);
        login.setBounds(65,150,100,20);
        this.add(usernameLabel);
        this.add(passwordLabel);
        this.add(passwordTextField);
        this.add(usernameTextField);
        this.add(login);
        this.add(captcha);
        this.add(captchaField);


        this.setSize(400,400);
        this.generateCaptcha();
        addActionListener(this);
        login.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == login){
            String response=new LoginController().validateLogin(usernameTextField.getText(), String.valueOf(passwordTextField.getPassword()));
            if(!response.equalsIgnoreCase("Success")) {
            	failureCount++;
            }
            JOptionPane.showMessageDialog(this,response+" you have "+(3-failureCount)+" left");
            if (failureCount==3) {
            	this.dispose();
            }
        }
    }
    public  int generateCaptcha(){

        Random r  = new Random();
        code = r.nextInt(10000);
        captcha.setText(String.valueOf(code));
        return code;
    }
}
 
