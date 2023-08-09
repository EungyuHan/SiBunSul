package app;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ActionListenerAddStudent implements ActionListener {
	
    private ArrayList<Swimmer> Roster;
    private ArrayList<SwimTimeEntry> timeRecordSample;
    private HealthRecord health4;

	public ActionListenerAddStudent(ArrayList<Swimmer> Roster, ArrayList<SwimTimeEntry> timeRecordSample, HealthRecord health4){
    	this.Roster = Roster;
    	this.timeRecordSample = timeRecordSample;
    	this.health4 = health4;
    }
			
	public void actionPerformed(ActionEvent e) {

// ***************************** Add Student *****************************

		if (e.getActionCommand().equals("Add Student")) {
			
			JFrame f = new JFrame("Add Student"); 
			
			JPanel pane = new JPanel();
		    pane.setLayout(new GridLayout(0, 2, 2, 2));
		
		    JTextField nameField = new JTextField(10);
		    JTextField addressField = new JTextField(10);
		    JTextField emailField = new JTextField(10);
		    JTextField phoneField = new JTextField(10);
		    JTextField majorField = new JTextField(10);
		    JTextField gpaField = new JTextField(10);
		    JTextField classYearField = new JTextField(10);
		
		    pane.add(new JLabel("Name: "));
		    pane.add(nameField);
		    
		    pane.add(new JLabel("Address: "));
		    pane.add(addressField);
		
		    pane.add(new JLabel("Email: "));
		    pane.add(emailField);
		    
		    pane.add(new JLabel("Phone: "));
		    pane.add(phoneField);
		
		    pane.add(new JLabel("Major: "));
		    pane.add(majorField);
		    
		    pane.add(new JLabel("GPA: "));
		    pane.add(gpaField);
		    
		    pane.add(new JLabel("Class Year: "));
		    pane.add(classYearField);
		
		    int option = JOptionPane.showConfirmDialog(f, pane, "Add Student", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
		    
		    if (option == JOptionPane.YES_OPTION) {
		
		        String nameInput = nameField.getText();
		        String addressInput = addressField.getText();
		        String emailInput = emailField.getText();
		        String phoneInput = phoneField.getText();
		        String majorInput = majorField.getText();
		        String gpaInput = gpaField.getText();
		        String classYearInput = classYearField.getText();
		
		        Swimmer sw13 = new Swimmer(nameInput,addressInput,emailInput,phoneInput,gpaInput,majorInput,classYearInput,timeRecordSample,health4);
		        Roster.add(sw13);
		    }
		}
	}
}