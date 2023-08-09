package app;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ActionListenerViewGpa implements ActionListener {
	
    private ArrayList<Swimmer> Roster;

	public ActionListenerViewGpa(ArrayList<Swimmer> Roster){
    	this.Roster = Roster;
    }
			
	public void actionPerformed(ActionEvent e) {
		
		// ***************************** View GPA *****************************
		
		double sum = 0.0;
		double count = 0.0;
		
		for (Swimmer student : Roster) {
			sum += Double.valueOf(student.getGpa());
			count += 1.0;
		}

		double avg = Math.round(sum / count * 100d) / 100d;
		
		JOptionPane.showMessageDialog(null, "The average of everyone's GPA is: " + String.valueOf(avg), e.getActionCommand(), 1); 
		
	}
    
}