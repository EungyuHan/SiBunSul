package app;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

public class ActionListenerEditMemberSubmit implements ActionListener {
	
    private ArrayList<Member> Roster;
    private JButton b3;
    private JTextField tf2, tf3, tf4, tf5, tf6;
    private JLabel l2, l4, l5;

	public ActionListenerEditMemberSubmit(ArrayList<Member> Roster, JButton b3, JTextField tf2, JTextField tf3, JTextField tf4, JTextField tf5, JTextField tf6, JLabel l2, JLabel l4, JLabel l5, JLabel l6, JLabel l7, JLabel l8){
    	this.Roster = Roster;
    	this.b3 = b3;
    	this.tf2 = tf2; this.tf3 = tf3; this.tf4 = tf4; this.tf5 = tf5; this.tf6 = tf6; 
    	this.l2 = l2; this.l4 = l4; this.l5 = l5;
    }
			
	public void actionPerformed(ActionEvent e) {
	
	// ***************************** Edit Student: Submit *****************************

		Member stu = new Member();
		for (Member student : Roster) {
			if (l2.getText().equals(student.getName())) {
				stu = student;
				break;
			}
		}
		
		String newEmail = tf2.getText();
		if (!newEmail.isEmpty()) {
			l4.setText("Email: " + newEmail);
			stu.setEmail(newEmail);
		}
		
		String newPhone = tf3.getText();
		if (!newPhone.isEmpty()) {
			l5.setText("Phone: " + newPhone);
			stu.setPhone(newPhone);
		}
		
		tf2.setVisible(false);
		tf3.setVisible(false);
		tf4.setVisible(false);
		tf5.setVisible(false);
		tf6.setVisible(false);
		b3.setVisible(false);
		
	}
	
}
