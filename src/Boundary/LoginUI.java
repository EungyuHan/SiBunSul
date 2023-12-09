package app.Boundary;

import app.ApplicationLogic.ActionListenerLogin;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class LoginUI {
    private JFrame loginFrame;
    private JPasswordField pwField;
    JButton loginButton;

    public LoginUI() {
        loginFrame = new JFrame("Login");
        pwField = new JPasswordField("Enter Password");
        pwField.setBounds(50, 50, 150, 20); // size 수정
        pwField.setBorder(BorderFactory.createLineBorder(Color.black));

        loginButton = new JButton("Login");
        loginButton.setBounds(50, 100, 150, 20);

        loginFrame.add(loginButton);
        loginFrame.add(pwField);
        loginFrame.getRootPane().setDefaultButton(loginButton);
        loginFrame.setLayout(null); // layout manager를 null로 설정
        loginFrame.setSize(300, 200);
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginFrame.setVisible(true);
        pwField.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (new String(pwField.getPassword()).equals("Enter Password")) {
                    pwField.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (new String(pwField.getPassword()).isEmpty()) {
                    pwField.setText("Enter Password");
                }
            }
        });

        loginButton.addActionListener(new ActionListenerLogin(loginFrame, pwField));
    }
}