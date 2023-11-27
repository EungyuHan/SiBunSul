package app;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

public class ActionListenerEditMemeber implements ActionListener {
		
    private ArrayList<Member> memberList;
    private JLabel l2;
    private JTextField tf2, tf3, tf4, tf5, tf6;
    private JButton b3;

	public ActionListenerEditMemeber(ArrayList<Member> memberList, JLabel l2, JTextField tf2, JTextField tf3, JTextField tf4, JTextField tf5, JTextField tf6, JButton b3){
    	this.memberList = memberList;
    	this.l2 = l2;
    	this.tf2 = tf2; this.tf3 = tf3; this.tf4 = tf4; this.tf5 = tf5; this.tf6 = tf6; 
    	this.b3 = b3;
    }
			
	public void actionPerformed(ActionEvent e) {
		
		// ***************************** Edit Student: Input Field *****************************

		Member stu = new Member();
		for (Member student : memberList) {
			if (l2.getText().equals(student.getName())) {
				stu = student;
				tf2.setVisible(true);
				tf3.setVisible(true);
				tf4.setVisible(true);
				tf5.setVisible(true);
				tf6.setVisible(true);
				b3.setVisible(true);
				break;
			}
		}
	}
}