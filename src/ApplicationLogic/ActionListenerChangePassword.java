package app.ApplicationLogic;

import app.Data;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionListenerChangePassword implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        JDialog dialog = new JDialog();
        JPanel panel = new JPanel(new GridLayout(4,2));
        JPasswordField currPassword = new JPasswordField();
        JPasswordField newPassword = new JPasswordField();
        JPasswordField reNewPassword = new JPasswordField();
        JButton changeButton = new JButton("비밀번호 변경");

        panel.add(new JLabel("현재 비밀번호 입력:"));
        panel.add(currPassword);
        panel.add(new JLabel("변경할 비밀번호 입력:"));
        panel.add(newPassword);
        panel.add(new JLabel("변경할 비밀번호 재입력:"));
        panel.add(reNewPassword);
        panel.add(changeButton);

        changeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!new String(currPassword.getPassword()).equals(Data.getPassword())){
                    JOptionPane.showMessageDialog(null, "현재 비밀번호가 일치하지 않습니다.");
                    return;
                }
                if(!new String(newPassword.getPassword()).equals(new String(reNewPassword.getPassword()))){
                    JOptionPane.showMessageDialog(null, "새로운 비밀번호를 재확인 해주세요.");
                    return;
                }
                Data.setPassword(new String(newPassword.getPassword()));
                JOptionPane.showMessageDialog(null, "비밀번호가 변경되었습니다.");
                dialog.dispose();
            }
        });

        dialog.add(panel);
        dialog.pack();
        
        dialog.setVisible(true);
    }
}
