package app;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class ActionListenerMakeAnnouncement implements ActionListener {

	public ActionListenerMakeAnnouncement(){}
			
	public void actionPerformed(ActionEvent e) {
		
		// ***************************** Make Announcement *****************************

		JFrame f = new JFrame("Add Announcement"); 
		
		JPanel pane = new JPanel();
	    pane.setLayout(new GridLayout(0, 1, 1, 1));
	    
	    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
	    Date date = new Date();  
	    System.out.println(formatter.format(date)); 
	
	    JTextArea contentField = new JTextArea(20, 40);
	    pane.add(contentField);
	
	    int option = JOptionPane.showConfirmDialog(f, pane, "Add Announcement", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
	    
	    if (option == JOptionPane.YES_OPTION) {
	
	       String contentInput = contentField.getText();
	
	        pane = new JPanel();
	        pane.setLayout(new BoxLayout(pane, BoxLayout.PAGE_AXIS));
	
	        pane.add(new JLabel("Timestamp: " + date));
	        pane.add(new JLabel("Note: announcement has successfully been sent."));
	
			Announcement ann1 = new Announcement(String.valueOf(date),contentInput);
	
	        JOptionPane.showMessageDialog(f, pane);
	    }	
	}
}