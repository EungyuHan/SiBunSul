package app;

import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ActionListenerTrainerSearch implements ActionListener {
	JPanel panel;
    private ArrayList<Trainer> trainerList;
    private JTextField trainerField;

	public ActionListenerTrainerSearch(ArrayList<Trainer> trainerList, JPanel panel, JTextField trainerField){
		this.trainerList = trainerList;
		this.panel = panel;
		this.trainerField = trainerField;
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
				JButton editButton = new JButton("Edit Profile");

				nameLabel.setBounds(0, 0, 300, 30);
				addressLabel.setBounds(0, 50, 300, 30);
				emailLabel.setBounds(0, 100, 300, 30);
				phoneLabel.setBounds(0, 150, 300, 30);
				editButton.setBounds(0, 200, 150, 30);

				editButton.addActionListener(new ActionListenerEditTrainer(trainer));

				panel.add(nameLabel);
				panel.add(addressLabel);
				panel.add(emailLabel);
				panel.add(phoneLabel);
				panel.add(editButton);

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