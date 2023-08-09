package app;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ActionListenerViewRoster implements ActionListener {
		
	private ArrayList<Swimmer> Roster;
    private JTextField tf2, tf3, tf4, tf5, tf6;
    private JButton b3, buttonViewHealth, buttonViewTime;
    private JLabel l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14, l15, l16, l17, l18, l19, l20, l21, l22, l23, l24, l25, l26, l27, l28, l29, l30, l31, l32, l33, l34, l35, l36, l37, l38, l39, l40, l41, l42, l43, l44, l45, l46, l47, l48, l49, l50, l51, l52, l53, l54, l55;

	
	public ActionListenerViewRoster(ArrayList<Swimmer> Roster, JTextField tf2, JTextField tf3, JTextField tf4, JTextField tf5, JTextField tf6, JLabel l2, JLabel l3, JLabel l4, JLabel l5, JLabel l6, JLabel l7, JLabel l8, JLabel l9, JLabel l10, JLabel l11, JLabel l12, JLabel l13, JLabel l14, JLabel l15, JLabel l16, JLabel l17, JLabel l18, JLabel l19, JLabel l20, JLabel l21, JLabel l22, JLabel l23, JLabel l24, JLabel l25, JLabel l26, JLabel l27, JLabel l28, JLabel l29, JLabel l30, JLabel l31, JLabel l32, JLabel l33, JLabel l34, JLabel l35, JLabel l36, JLabel l37, JLabel l38, JLabel l39, JLabel l40, JLabel l41, JLabel l42, JLabel l43, JLabel l44, JLabel l45, JLabel l46, JLabel l47, JLabel l48, JLabel l49, JLabel l50, JLabel l51, JLabel l52, JLabel l53, JLabel l54, JLabel l55, JButton b3, JButton buttonViewHealth, JButton buttonViewTime) {
		this.Roster = Roster;
    	this.tf2 = tf2; this.tf3 = tf3; this.tf4 = tf4; this.tf5 = tf5; this.tf6 = tf6; 
    	this.l2 = l2; this.l3 = l3; this.l4 = l4; this.l5 = l5; this.l6 = l6; this.l7 = l7; this.l8 = l8; this.l9 = l9; this.l10 = l10; this.l11 = l11; this.l12 = l12; this.l13 = l13; this.l14 = l14; this.l15 = l15; this.l16 = l16; this.l17 = l17; this.l18 = l18; this.l19 = l19; this.l20 = l20; this.l21 = l21; this.l22 = l22; this.l23 = l23; this.l24 = l24; this.l25 = l25; this.l26 = l26; this.l27 = l27; this.l28 = l28; this.l29 = l29; this.l30 = l30; this.l31 = l31; this.l32 = l32; this.l33 = l33; this.l34 = l34; this.l35 = l35; this.l36 = l36; this.l37 = l37; this.l38 = l38; this.l39 = l39; this.l40 = l40; this.l41 = l41; this.l42 = l42; this.l43 = l43; this.l44 = l44; this.l45 = l45; this.l46 = l46; this.l47 = l47; this.l48 = l48; this.l49 = l49; this.l50 = l50; this.l51 = l51; this.l52 = l52; this.l53 = l53; this.l54 = l54; this.l55 = l55; 
		this.b3 = b3;
    	this.buttonViewHealth = buttonViewHealth;
    	this.buttonViewTime = buttonViewTime;

    }
			
	public void actionPerformed(ActionEvent e) {
		
		// ***************************** View Roster *****************************

		l2.setVisible(true); l3.setVisible(false); l4.setVisible(true); l5.setVisible(true); l6.setVisible(true); l7.setVisible(true); l8.setVisible(true); l9.setVisible(true); l10.setVisible(true); l11.setVisible(true); l12.setVisible(true); l13.setVisible(true); l14.setVisible(true); l15.setVisible(true); l16.setVisible(true); l17.setVisible(true); l18.setVisible(true); l19.setVisible(true); l20.setVisible(true); l21.setVisible(true); l22.setVisible(true); l23.setVisible(true); l24.setVisible(true); l25.setVisible(true); l26.setVisible(true); l27.setVisible(true); l28.setVisible(true); l29.setVisible(true); l30.setVisible(true); l31.setVisible(true); l32.setVisible(true); l33.setVisible(true); l34.setVisible(true); l35.setVisible(true); l36.setVisible(true); l37.setVisible(true); l38.setVisible(true); l39.setVisible(true); l40.setVisible(true); l41.setVisible(true); l42.setVisible(true); l43.setVisible(true); l44.setVisible(true); l45.setVisible(true); l46.setVisible(true); l47.setVisible(true); l48.setVisible(true); l49.setVisible(true); l50.setVisible(true); l51.setVisible(true); l52.setVisible(true); l53.setVisible(true); l54.setVisible(true); l55.setVisible(true);
		
		l2.setText("Roster");
		
		l4.setText(Roster.get(Roster.size()-1).getName());
		l5.setText(Roster.get(Roster.size()-2).getName());
		l6.setText(Roster.get(Roster.size()-3).getName());
		l7.setText(Roster.get(Roster.size()-4).getName());
		l8.setText(Roster.get(Roster.size()-5).getName());
		l9.setText(Roster.get(Roster.size()-6).getName());
		l10.setText(Roster.get(Roster.size()-7).getName());
		l11.setText(Roster.get(Roster.size()-8).getName());
		l12.setText(Roster.get(Roster.size()-9).getName());
		l13.setText(Roster.get(Roster.size()-10).getName());
		l14.setText(Roster.get(Roster.size()-11).getName());
		l15.setText(Roster.get(Roster.size()-12).getName());
		
		l17.setText(Roster.get(Roster.size()-1).getClassYear());
		l18.setText(Roster.get(Roster.size()-2).getClassYear());
		l19.setText(Roster.get(Roster.size()-3).getClassYear());
		l20.setText(Roster.get(Roster.size()-4).getClassYear());
		l21.setText(Roster.get(Roster.size()-5).getClassYear());
		l22.setText(Roster.get(Roster.size()-6).getClassYear());
		l23.setText(Roster.get(Roster.size()-7).getClassYear());
		l24.setText(Roster.get(Roster.size()-8).getClassYear());
		l25.setText(Roster.get(Roster.size()-9).getClassYear());
		l26.setText(Roster.get(Roster.size()-10).getClassYear());
		l27.setText(Roster.get(Roster.size()-11).getClassYear());
		l28.setText(Roster.get(Roster.size()-12).getClassYear());
		
		l30.setText(Roster.get(Roster.size()-1).getMajor());
		l31.setText(Roster.get(Roster.size()-2).getMajor());
		l32.setText(Roster.get(Roster.size()-3).getMajor());
		l33.setText(Roster.get(Roster.size()-4).getMajor());
		l34.setText(Roster.get(Roster.size()-5).getMajor());
		l35.setText(Roster.get(Roster.size()-6).getMajor());
		l36.setText(Roster.get(Roster.size()-7).getMajor());
		l37.setText(Roster.get(Roster.size()-8).getMajor());
		l38.setText(Roster.get(Roster.size()-9).getMajor());
		l39.setText(Roster.get(Roster.size()-10).getMajor());
		l40.setText(Roster.get(Roster.size()-11).getMajor());
		l41.setText(Roster.get(Roster.size()-12).getMajor());
		
		l43.setText(Roster.get(Roster.size()-1).getEmail());
		l44.setText(Roster.get(Roster.size()-2).getEmail());
		l45.setText(Roster.get(Roster.size()-3).getEmail());
		l46.setText(Roster.get(Roster.size()-4).getEmail());
		l47.setText(Roster.get(Roster.size()-5).getEmail());
		l48.setText(Roster.get(Roster.size()-6).getEmail());
		l49.setText(Roster.get(Roster.size()-7).getEmail());
		l50.setText(Roster.get(Roster.size()-8).getEmail());
		l51.setText(Roster.get(Roster.size()-9).getEmail());
		l52.setText(Roster.get(Roster.size()-10).getEmail());
		l53.setText(Roster.get(Roster.size()-11).getEmail());
		l54.setText(Roster.get(Roster.size()-12).getEmail());
		
		buttonViewTime.setVisible(false);
		buttonViewHealth.setVisible(false);
		tf2.setVisible(false);
		tf3.setVisible(false);
		tf4.setVisible(false);
		tf5.setVisible(false);
		tf6.setVisible(false);
		b3.setVisible(false);
	}
	
}