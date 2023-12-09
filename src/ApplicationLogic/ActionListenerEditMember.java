package app.ApplicationLogic;

import app.Entity.Member;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ActionListenerEditMember implements ActionListener {
	private Member member;

	public ActionListenerEditMember(Member member) {
		this.member = member;
	}
			
	public void actionPerformed(ActionEvent e) {
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

		JLabel nameLabel = new JLabel("Name: ");
		JLabel addressLabel = new JLabel("Address: ");
		JLabel emailLabel = new JLabel("Email: ");
		JLabel phoneLabel = new JLabel("Phone: ");
		JTextField nameField = new JTextField(member.getName());
		JTextField addressField = new JTextField(member.getAddress());
		JTextField emailField = new JTextField(member.getEmail());
		JTextField phoneField = new JTextField(member.getPhone());

		panel.add(nameLabel);
		panel.add(nameField);
		panel.add(addressLabel);
		panel.add(addressField);
		panel.add(emailLabel);
		panel.add(emailField);
		panel.add(phoneLabel);
		panel.add(phoneField);

		int result = JOptionPane.showConfirmDialog(null, panel, "Edit Member", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

		if(result == JOptionPane.OK_OPTION){
			member.setName(nameField.getText());
			member.setAddress(addressField.getText());
			member.setEmail(emailField.getText());
			member.setPhone(phoneField.getText());
			JOptionPane.showMessageDialog(null, "수정되었습니다.");
		}
	}
	
}
