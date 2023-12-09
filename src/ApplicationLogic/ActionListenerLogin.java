package app.ApplicationLogic;

import app.Boundary.UI;
import app.Data;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionListenerLogin implements ActionListener {
    private JFrame loginFrame;
    private JPasswordField pwField;
    public ActionListenerLogin(JFrame loginFrame, JPasswordField passwordField){
        this.loginFrame = loginFrame;
        this.pwField = passwordField;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (new String(pwField.getPassword()).equals(Data.getPassword())) {
            new UI();
            loginFrame.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "비밀번호를 확인해주세요");
        }
    }
}
