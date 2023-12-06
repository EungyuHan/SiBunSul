package app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class Login {
    private JFrame loginFrame;
    private JTextField pwField;
    JButton loginButton;
    private String password = "1234";

    public Login() {
        loginFrame = new JFrame("Login");
        pwField = new JTextField("Enter Password");
        pwField.setBounds(50, 50, 150, 20); // size 수정
        pwField.setBorder(BorderFactory.createLineBorder(Color.black));

        // FocusListener를 추가하여 JTextField에 placeholder 기능을 구현
        pwField.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (pwField.getText().equals("Enter Password")) {
                    pwField.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (pwField.getText().isEmpty()) {
                    pwField.setText("Enter Password");
                }
            }
        });

        loginButton = new JButton("Login");
        loginButton.setBounds(50, 100, 150, 20);
        loginButton.addActionListener(e -> {
            if (pwField.getText().equals(password)) {
                new UI();
                loginFrame.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Wrong Password");
            }
        });

        loginFrame.add(loginButton);

        loginFrame.add(pwField);
        loginFrame.setLayout(null); // layout manager를 null로 설정
        loginFrame.setSize(300, 200);
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginFrame.setVisible(true);


    }
}
