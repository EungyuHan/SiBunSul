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

public class ActionListenerAddStats implements ActionListener  {
	
    private ArrayList<SwimTimeEntry> timeRecordAll;

	public ActionListenerAddStats(ArrayList<SwimTimeEntry> timeRecordAll){
    	this.timeRecordAll = timeRecordAll;
    }
			
	public void actionPerformed(ActionEvent e) {
		
		// ***************************** Add Stats *****************************
		
		JFrame f = new JFrame("Add Stats"); 
		
		JPanel pane = new JPanel();
	    pane.setLayout(new GridLayout(0, 2, 2, 2));
	
	    JTextField nameField = new JTextField(10);
	    JTextField eventField = new JTextField(10);
	    JTextField timeField = new JTextField(10);
	    JTextField dateField = new JTextField(10);
	    JTextField occasionField = new JTextField(10);
	
	    pane.add(new JLabel("Name: "));
	    pane.add(nameField);
	
	    pane.add(new JLabel("Event: "));
	    pane.add(eventField);
	    
	    pane.add(new JLabel("Time: "));
	    pane.add(timeField);
	
	    pane.add(new JLabel("Date: "));
	    pane.add(dateField);
	    
	    pane.add(new JLabel("Location: "));
	    pane.add(occasionField);
	
	    int option = JOptionPane.showConfirmDialog(f, pane, "Add Stats", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
	    
	    if (option == JOptionPane.YES_OPTION) {
	
	        String nameInput = nameField.getText();
	        String eventInput = eventField.getText();
	        String timeInput = timeField.getText();
	        String dateInput = dateField.getText();
	        String occasionInput = occasionField.getText();
	
	        SwimTimeEntry timeEntry13 = new SwimTimeEntry(nameInput,eventInput,timeInput,dateInput,occasionInput);
	        timeRecordAll.add(timeEntry13);
	    }
	}
}