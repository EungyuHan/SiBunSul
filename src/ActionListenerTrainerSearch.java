package app;

import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ActionListenerTrainerSearch implements ActionListener {
	JFrame frame;
	JPanel panel;
    private ArrayList<Trainer> trainerList;
    private JTextField trainerField;

//	public ActionTrainerListenerSearch(ArrayList<Trainer> trainerList, JTextField tf1, JLabel l2, JLabel l3, JLabel l4, JLabel l5, JLabel l6, JLabel l7, JLabel l8, JLabel l9, JLabel l10, JLabel l11, JLabel l12, JLabel l13, JLabel l14, JLabel l15, JLabel l16, JLabel l17, JLabel l18, JLabel l19, JLabel l20, JLabel l21, JLabel l22, JLabel l23, JLabel l24, JLabel l25, JLabel l26, JLabel l27, JLabel l28, JLabel l29, JLabel l30, JLabel l31, JLabel l32, JLabel l33, JLabel l34, JLabel l35, JLabel l36, JLabel l37, JLabel l38, JLabel l39, JLabel l40, JLabel l41, JLabel l42, JLabel l43, JLabel l44, JLabel l45, JLabel l46, JLabel l47, JLabel l48, JLabel l49, JLabel l50, JLabel l51, JLabel l52, JLabel l53, JLabel l54, JLabel l55, JButton buttonViewHealth, JButton buttonViewTime){
//		this.trainerList = trainerList;
//    	this.tf1 = tf1;
//    	this.l2 = l2; this.l3 = l3; this.l4 = l4; this.l5 = l5; this.l6 = l6; this.l7 = l7; this.l8 = l8; this.l9 = l9; this.l10 = l10; this.l11 = l11; this.l12 = l12; this.l13 = l13; this.l14 = l14; this.l15 = l15; this.l16 = l16; this.l17 = l17; this.l18 = l18; this.l19 = l19; this.l20 = l20; this.l21 = l21; this.l22 = l22; this.l23 = l23; this.l24 = l24; this.l25 = l25; this.l26 = l26; this.l27 = l27; this.l28 = l28; this.l29 = l29; this.l30 = l30; this.l31 = l31; this.l32 = l32; this.l33 = l33; this.l34 = l34; this.l35 = l35; this.l36 = l36; this.l37 = l37; this.l38 = l38; this.l39 = l39; this.l40 = l40; this.l41 = l41; this.l42 = l42; this.l43 = l43; this.l44 = l44; this.l45 = l45; this.l46 = l46; this.l47 = l47; this.l48 = l48; this.l49 = l49; this.l50 = l50; this.l51 = l51; this.l52 = l52; this.l53 = l53; this.l54 = l54; this.l55 = l55;
//    	this.buttonViewHealth = buttonViewHealth;
//    	this.buttonViewTime = buttonViewTime;
//    }

	public ActionListenerTrainerSearch(ArrayList<Trainer> trainerList, JPanel panel, JTextField trainerField){
		this.trainerList = trainerList;
		this.panel = panel;
		this.trainerField = trainerField;
	}
	
	public String printTimeRecord(ArrayList<PTrecord> timeRecordSample) {
		String result = "";
		for (PTrecord entry : timeRecordSample) {
			result += entry.toString();
		}
		return result;
	}
			
	public void actionPerformed(ActionEvent e) {
		
		// ***************************** Search *****************************
		
		String searchName = trainerField.getText();
		boolean trainerFound = false;

		for(Trainer trainer : trainerList){
			if(trainer.getName().equals(searchName)) {
				trainerFound = true;
				panel.removeAll();

				JLabel nameLabel = new JLabel("Trianer Name: " + trainer.getName());
				nameLabel.setFont(new Font("TimesRoman", Font.BOLD, 20));
				JLabel addressLabel = new JLabel("Address: " + trainer.getAddress());
				JLabel emailLabel = new JLabel("Email: " + trainer.getEmail());
				JLabel phoneLabel = new JLabel("Phone: " + trainer.getPhone());

				nameLabel.setBounds(0, 0, 300, 30);
				addressLabel.setBounds(0, 50, 300, 30);
				emailLabel.setBounds(0, 100, 300, 30);
				phoneLabel.setBounds(0, 150, 300, 30);

				panel.add(nameLabel);
				panel.add(addressLabel);
				panel.add(emailLabel);
				panel.add(phoneLabel);

				panel.revalidate();
				panel.repaint();
				break;
			}
		}
		if(!trainerFound) {
			JOptionPane.showMessageDialog(null, "Trainer not found!");
		}
	}
    
}