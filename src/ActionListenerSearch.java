package app;

import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ActionListenerSearch implements ActionListener {
	
	private ArrayList<SwimTimeEntry> timeRecordSample;
    private ArrayList<Swimmer> Roster;
    private JTextField tf1;
    private JLabel l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14, l15, l16, l17, l18, l19, l20, l21, l22, l23, l24, l25, l26, l27, l28, l29, l30, l31, l32, l33, l34, l35, l36, l37, l38, l39, l40, l41, l42, l43, l44, l45, l46, l47, l48, l49, l50, l51, l52, l53, l54, l55;
    private JButton buttonViewHealth, buttonViewTime;

	public ActionListenerSearch(ArrayList<SwimTimeEntry> timeRecordSample, ArrayList<Swimmer> Roster, JTextField tf1, JLabel l2, JLabel l3, JLabel l4, JLabel l5, JLabel l6, JLabel l7, JLabel l8, JLabel l9, JLabel l10, JLabel l11, JLabel l12, JLabel l13, JLabel l14, JLabel l15, JLabel l16, JLabel l17, JLabel l18, JLabel l19, JLabel l20, JLabel l21, JLabel l22, JLabel l23, JLabel l24, JLabel l25, JLabel l26, JLabel l27, JLabel l28, JLabel l29, JLabel l30, JLabel l31, JLabel l32, JLabel l33, JLabel l34, JLabel l35, JLabel l36, JLabel l37, JLabel l38, JLabel l39, JLabel l40, JLabel l41, JLabel l42, JLabel l43, JLabel l44, JLabel l45, JLabel l46, JLabel l47, JLabel l48, JLabel l49, JLabel l50, JLabel l51, JLabel l52, JLabel l53, JLabel l54, JLabel l55, JButton buttonViewHealth, JButton buttonViewTime){
    	this.timeRecordSample = timeRecordSample;
		this.Roster = Roster;
    	this.tf1 = tf1;
    	this.l2 = l2; this.l3 = l3; this.l4 = l4; this.l5 = l5; this.l6 = l6; this.l7 = l7; this.l8 = l8; this.l9 = l9; this.l10 = l10; this.l11 = l11; this.l12 = l12; this.l13 = l13; this.l14 = l14; this.l15 = l15; this.l16 = l16; this.l17 = l17; this.l18 = l18; this.l19 = l19; this.l20 = l20; this.l21 = l21; this.l22 = l22; this.l23 = l23; this.l24 = l24; this.l25 = l25; this.l26 = l26; this.l27 = l27; this.l28 = l28; this.l29 = l29; this.l30 = l30; this.l31 = l31; this.l32 = l32; this.l33 = l33; this.l34 = l34; this.l35 = l35; this.l36 = l36; this.l37 = l37; this.l38 = l38; this.l39 = l39; this.l40 = l40; this.l41 = l41; this.l42 = l42; this.l43 = l43; this.l44 = l44; this.l45 = l45; this.l46 = l46; this.l47 = l47; this.l48 = l48; this.l49 = l49; this.l50 = l50; this.l51 = l51; this.l52 = l52; this.l53 = l53; this.l54 = l54; this.l55 = l55; 
    	this.buttonViewHealth = buttonViewHealth;
    	this.buttonViewTime = buttonViewTime;
    }
	
	public String printTimeRecord(ArrayList<SwimTimeEntry> timeRecordSample) {
		String result = "";
		for (SwimTimeEntry entry : timeRecordSample) {
			result += entry.toString();
		}
		return result;
	}
			
	public void actionPerformed(ActionEvent e) {
		
		// ***************************** Search *****************************
		
		String search = tf1.getText();
		
        for(Swimmer student : Roster) {

            if(student.getName().equals(search)){
            	
        		l3.setText("");
            	
        		l2.setText(search);
            	
        		l4.setText("Email: " + student.getEmail());
        		l5.setText("Phone: " + student.getPhone());
        		l6.setText("Major: " + student.getMajor());
        		l7.setText("GPA: " + student.getGpa());
        		l8.setText("Class Year: " + student.getClassYear());
        		
        		l9.setText("Health Record: ");
        		buttonViewHealth.setText("View");
        		buttonViewHealth.addActionListener( (ActionEvent a1) -> {
        			
        	    	String msg = student.getHlthr().toString();
        			JOptionPane.showMessageDialog(null, msg, a1.getActionCommand(), 1); 
        		});
        		
        		l10.setText("Time Record: ");
        		buttonViewTime.setText("View");
        		buttonViewTime.addActionListener( (ActionEvent a2) -> {
        			
        			String msg = printTimeRecord(timeRecordSample);
        			JOptionPane.showMessageDialog(null, msg, a2.getActionCommand(), 1); 
        		});
        		
        		l2.setVisible(true); l3.setVisible(true); l4.setVisible(true); l5.setVisible(true); l6.setVisible(true); l7.setVisible(true); l8.setVisible(true); l9.setVisible(true); l10.setVisible(true); 
        		l11.setVisible(false); l12.setVisible(false); l13.setVisible(false); l14.setVisible(false); l15.setVisible(false); l16.setVisible(false); l17.setVisible(false); l18.setVisible(false); l19.setVisible(false); l20.setVisible(false); l21.setVisible(false); l22.setVisible(false); l23.setVisible(false); l24.setVisible(false); l25.setVisible(false); l26.setVisible(false); l27.setVisible(false); l28.setVisible(false); l29.setVisible(false); l30.setVisible(false); l31.setVisible(false); l32.setVisible(false); l33.setVisible(false); l34.setVisible(false); l35.setVisible(false); l36.setVisible(false); l37.setVisible(false); l38.setVisible(false); l39.setVisible(false); l40.setVisible(false); l41.setVisible(false); l42.setVisible(false); l43.setVisible(false); l44.setVisible(false); l45.setVisible(false); l46.setVisible(false); l47.setVisible(false); l48.setVisible(false); l49.setVisible(false); l50.setVisible(false); l51.setVisible(false); l52.setVisible(false); l53.setVisible(false); l54.setVisible(false); l55.setVisible(false);

        		buttonViewHealth.setVisible(true);
        		buttonViewTime.setVisible(true);
        		
        		break;
        	
            } 
            
            else {
            	l3.setVisible(true);
            	l3.setText("Search not found, please try again.");
            	l3.setBounds(50,150,500,30);
            	
            	l2.setVisible(false); l4.setVisible(false); l5.setVisible(false); l6.setVisible(false); l7.setVisible(false); l8.setVisible(false); l9.setVisible(false); l10.setVisible(false); l11.setVisible(false); l12.setVisible(false); l13.setVisible(false); l14.setVisible(false); l15.setVisible(false); l16.setVisible(false); l17.setVisible(false); l18.setVisible(false); l19.setVisible(false); l20.setVisible(false); l21.setVisible(false); l22.setVisible(false); l23.setVisible(false); l24.setVisible(false); l25.setVisible(false); l26.setVisible(false); l27.setVisible(false); l28.setVisible(false); l29.setVisible(false); l30.setVisible(false); l31.setVisible(false); l32.setVisible(false); l33.setVisible(false); l34.setVisible(false); l35.setVisible(false); l36.setVisible(false); l37.setVisible(false); l38.setVisible(false); l39.setVisible(false); l40.setVisible(false); l41.setVisible(false); l42.setVisible(false); l43.setVisible(false); l44.setVisible(false); l45.setVisible(false); l46.setVisible(false); l47.setVisible(false); l48.setVisible(false); l49.setVisible(false); l50.setVisible(false); l51.setVisible(false); l52.setVisible(false); l53.setVisible(false); l54.setVisible(false); l55.setVisible(false);

        		buttonViewTime.setVisible(false);
        		buttonViewHealth.setVisible(false);
            }
        }
	}
    
}