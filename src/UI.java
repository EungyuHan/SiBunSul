package app;
import java.awt.event.*;
import java.awt.Font;

public class UI implements ActionListener {
	
	AllVariables av = new AllVariables();
	UIFrame uif = new UIFrame();
	
	UI() {  
		
		// ***************************** Setting Up J-Elements *****************************
		
		uif.l1.setBounds(50,50,500,30);
		uif.l2.setBounds(500,50,300,30);
		uif.l2.setFont(new Font("TimesRoman", Font.BOLD, 20));
		uif.l4.setBounds(500,100,500,30);
		uif.l5.setBounds(500,150,500,30);
		uif.l6.setBounds(500,200,500,30);
		uif.l7.setBounds(500,250,500,30);
		uif.l8.setBounds(500,300,500,30);
		uif.l9.setBounds(500,350,500,30);
		uif.l10.setBounds(500,400,500,30);
		uif.l11.setBounds(500,450,500,30);
		uif.l12.setBounds(500,500,500,30);
		uif.l13.setBounds(500,550,500,30);
		uif.l14.setBounds(500,600,500,30);
		uif.l15.setBounds(500,650,500,30);
		uif.l16.setBounds(500,700,500,30);	
		uif.l17.setBounds(625,100,500,30);
		uif.l18.setBounds(625,150,500,30);
		uif.l19.setBounds(625,200,500,30);
		uif.l20.setBounds(625,250,500,30);
		uif.l21.setBounds(625,300,500,30); 
		uif.l22.setBounds(625,350,500,30); 
		uif.l23.setBounds(625,400,500,30); 
		uif.l24.setBounds(625,450,500,30);
		uif.l25.setBounds(625,500,500,30); 
		uif.l26.setBounds(625,550,500,30); 
		uif.l27.setBounds(625,600,500,30); 
		uif.l28.setBounds(625,650,500,30); 
		uif.l29.setBounds(625,700,500,30); 
		uif.l30.setBounds(750,100,500,30); 
		uif.l31.setBounds(750,150,500,30); 
		uif.l32.setBounds(750,200,500,30); 
		uif.l33.setBounds(750,250,500,30); 
		uif.l34.setBounds(750,300,500,30); 
		uif.l35.setBounds(750,350,500,30); 
		uif.l36.setBounds(750,400,500,30); 
		uif.l37.setBounds(750,450,500,30); 
		uif.l38.setBounds(750,500,500,30); 
		uif.l39.setBounds(750,550,500,30); 
		uif.l40.setBounds(750,600,500,30); 
		uif.l41.setBounds(750,650,500,30); 
		uif.l42.setBounds(750,700,500,30); 
		uif.l43.setBounds(900,100,500,30); 
		uif.l44.setBounds(900,150,500,30); 
		uif.l45.setBounds(900,200,500,30); 
		uif.l46.setBounds(900,250,500,30); 
		uif.l47.setBounds(900,300,500,30); 
		uif.l48.setBounds(900,350,500,30); 
		uif.l49.setBounds(900,400,500,30); 
		uif.l50.setBounds(900,450,500,30); 
		uif.l51.setBounds(900,500,500,30); 
		uif.l52.setBounds(900,550,500,30); 
		uif.l53.setBounds(900,600,500,30); 
		uif.l54.setBounds(900,650,500,30);		
		uif.l55.setBounds(900,700,500,30); 

		uif.tf1.setBounds(50,100,200,20);  
		uif.tf2.setBounds(715,100,200,30);
		uif.tf3.setBounds(715,150,200,30);  
		uif.tf4.setBounds(715,200,200,30);  
		uif.tf5.setBounds(715,250,200,30);  
		uif.tf6.setBounds(715,300,200,30);

		uif.buttonViewHealth.setBounds(600,350,100,30);
		uif.buttonViewTime.setBounds(600,400,100,30);
		uif.b1.setBounds(275,100,100,20);
		uif.b3.setBounds(820,50,100,30);

		uif.buttonViewTime.setVisible(false);
		uif.buttonViewHealth.setVisible(false);
		uif.b3.setVisible(false);
		uif.tf2.setVisible(false);
		uif.tf3.setVisible(false);
		uif.tf4.setVisible(false);
		uif.tf5.setVisible(false);
		uif.tf6.setVisible(false);
		
		av.timeRecordAll.add(av.timeEntry1); av.timeRecordAll.add(av.timeEntry2); av.timeRecordAll.add(av.timeEntry4); av.timeRecordAll.add(av.timeEntry5); av.timeRecordAll.add(av.timeEntry6); av.timeRecordAll.add(av.timeEntry7); av.timeRecordAll.add(av.timeEntry8); av.timeRecordAll.add(av.timeEntry9); av.timeRecordAll.add(av.timeEntry10); av.timeRecordAll.add(av.timeEntry11); av.timeRecordAll.add(av.timeEntry12); av.timeRecordAll.add(av.timeEntry13);
		av.timeRecordSample.add(av.timeEntry6); av.timeRecordSample.add(av.timeEntry7); av.timeRecordSample.add(av.timeEntry8); av.timeRecordSample.add(av.timeEntry9); av.timeRecordSample.add(av.timeEntry10); av.timeRecordSample.add(av.timeEntry1);
		av.Roster.add(av.sw12); av.Roster.add(av.sw11); av.Roster.add(av.sw10); av.Roster.add(av.sw9); av.Roster.add(av.sw8); av.Roster.add(av.sw7); av.Roster.add(av.sw6); av.Roster.add(av.sw5); av.Roster.add(av.sw4); av.Roster.add(av.sw3); av.Roster.add(av.sw2); av.Roster.add(av.sw1);
		
		// ***************************** Action Listener *****************************
		
		uif.b1.addActionListener(new ActionListenerSearch(av.timeRecordSample, av.Roster, uif.tf1, uif.l2, uif.l3, uif.l4, uif.l5, uif.l6, uif.l7, uif.l8, uif.l9, uif.l10, uif.l11, uif.l12, uif.l13, uif.l14, uif.l15, uif.l16, uif.l17, uif.l18, uif.l19, uif.l20, uif.l21, uif.l22, uif.l23, uif.l24, uif.l25, uif.l26, uif.l27, uif.l28, uif.l29, uif.l30, uif.l31, uif.l32, uif.l33, uif.l34, uif.l35, uif.l36, uif.l37, uif.l38, uif.l39, uif.l40, uif.l41, uif.l42, uif.l43, uif.l44, uif.l45, uif.l46, uif.l47, uif.l48, uif.l49, uif.l50, uif.l51, uif.l52, uif.l53, uif.l54, uif.l55, uif.buttonViewHealth, uif.buttonViewTime));
	    uif.b3.addActionListener(new ActionListenerEditStudentSubmit(av.Roster, uif.b3, uif.tf2, uif.tf3, uif.tf4, uif.tf5, uif.tf6, uif.l2, uif.l4, uif.l5, uif.l6, uif.l7, uif.l8));		
		uif.i1.addActionListener(new ActionListenerAddStats(av.timeRecordAll));
		uif.i2.addActionListener(new ActionListenerAddStudent(av.Roster, av.timeRecordSample, av.health4));
		uif.i3.addActionListener(new ActionListenerMakeAnnouncement());
		uif.i4.addActionListener(new ActionListenerEditStudent(av.Roster, uif.l2, uif.tf2, uif.tf3, uif.tf4, uif.tf5, uif.tf6, uif.b3));
		uif.i6.addActionListener(new ActionListenerViewGpa(av.Roster));
		uif.i7.addActionListener(new ActionListenerViewStats(av.timeRecordAll, uif.tf2, uif.tf3, uif.tf4, uif.tf5, uif.tf6, uif.l2, uif.l3, uif.l4, uif.l5, uif.l6, uif.l7, uif.l8, uif.l9, uif.l10, uif.l11, uif.l12, uif.l13, uif.l14, uif.l15, uif.l16, uif.l17, uif.l18, uif.l19, uif.l20, uif.l21, uif.l22, uif.l23, uif.l24, uif.l25, uif.l26, uif.l27, uif.l28, uif.l29, uif.l30, uif.l31, uif.l32, uif.l33, uif.l34, uif.l35, uif.l36, uif.l37, uif.l38, uif.l39, uif.l40, uif.l41, uif.l42, uif.l43, uif.l44, uif.l45, uif.l46, uif.l47, uif.l48, uif.l49, uif.l50, uif.l51, uif.l52, uif.l53, uif.l54, uif.l55, uif.b3, uif.buttonViewHealth, uif.buttonViewTime));
		uif.i8.addActionListener(new ActionListenerViewRoster(av.Roster, uif.tf2, uif.tf3, uif.tf4, uif.tf5, uif.tf6, uif.l2, uif.l3, uif.l4, uif.l5, uif.l6, uif.l7, uif.l8, uif.l9, uif.l10, uif.l11, uif.l12, uif.l13, uif.l14, uif.l15, uif.l16, uif.l17, uif.l18, uif.l19, uif.l20, uif.l21, uif.l22, uif.l23, uif.l24, uif.l25, uif.l26, uif.l27, uif.l28, uif.l29, uif.l30, uif.l31, uif.l32, uif.l33, uif.l34, uif.l35, uif.l36, uif.l37, uif.l38, uif.l39, uif.l40, uif.l41, uif.l42, uif.l43, uif.l44, uif.l45, uif.l46, uif.l47, uif.l48, uif.l49, uif.l50, uif.l51, uif.l52, uif.l53, uif.l54, uif.l55, uif.b3, uif.buttonViewHealth, uif.buttonViewTime));
		uif.i9.addActionListener(new ActionListenerClearView(uif.tf2, uif.tf3, uif.tf4, uif.tf5, uif.tf6, uif.l2, uif.l3, uif.l4, uif.l5, uif.l6, uif.l7, uif.l8, uif.l9, uif.l10, uif.l11, uif.l12, uif.l13, uif.l14, uif.l15, uif.l16, uif.l17, uif.l18, uif.l19, uif.l20, uif.l21, uif.l22, uif.l23, uif.l24, uif.l25, uif.l26, uif.l27, uif.l28, uif.l29, uif.l30, uif.l31, uif.l32, uif.l33, uif.l34, uif.l35, uif.l36, uif.l37, uif.l38, uif.l39, uif.l40, uif.l41, uif.l42, uif.l43, uif.l44, uif.l45, uif.l46, uif.l47, uif.l48, uif.l49, uif.l50, uif.l51, uif.l52, uif.l53, uif.l54, uif.l55, uif.b3, uif.buttonViewHealth, uif.buttonViewTime));
	          
		// ***************************** Add J-Elements to Frame *****************************
		
		uif.menu1.add(uif.i1); uif.menu1.add(uif.i2); uif.menu1.add(uif.i3); uif.menu2.add(uif.i4); uif.menu3.add(uif.i6); uif.menu3.add(uif.i7); uif.menu3.add(uif.i8); uif.menu4.add(uif.i9); 
		
		uif.mb.add(uif.menu1); 
		uif.mb.add(uif.menu2);
		uif.mb.add(uif.menu3);
		uif.mb.add(uif.menu4);
		
		uif.f.add(uif.b1); uif.f.add(uif.b3);
		uif.f.add(uif.l1); uif.f.add(uif.l2); uif.f.add(uif.l3); uif.f.add(uif.l4); uif.f.add(uif.l5); uif.f.add(uif.l6); uif.f.add(uif.l7); uif.f.add(uif.l8); uif.f.add(uif.l9); uif.f.add(uif.l10);
		uif.f.add(uif.l11); uif.f.add(uif.l12); uif.f.add(uif.l13); uif.f.add(uif.l14); uif.f.add(uif.l15); uif.f.add(uif.l16); uif.f.add(uif.l17); uif.f.add(uif.l18); uif.f.add(uif.l19); uif.f.add(uif.l20);
		uif.f.add(uif.l21); uif.f.add(uif.l22); uif.f.add(uif.l23); uif.f.add(uif.l24); uif.f.add(uif.l25); uif.f.add(uif.l26); uif.f.add(uif.l27); uif.f.add(uif.l28); uif.f.add(uif.l29); uif.f.add(uif.l30); 
		uif.f.add(uif.l31); uif.f.add(uif.l32); uif.f.add(uif.l33); uif.f.add(uif.l34); uif.f.add(uif.l35); uif.f.add(uif.l36); uif.f.add(uif.l37); uif.f.add(uif.l38); uif.f.add(uif.l39); uif.f.add(uif.l40); 
		uif.f.add(uif.l41); uif.f.add(uif.l42); uif.f.add(uif.l43); uif.f.add(uif.l44); uif.f.add(uif.l45); uif.f.add(uif.l46); uif.f.add(uif.l47); uif.f.add(uif.l48); uif.f.add(uif.l49); uif.f.add(uif.l50); 
		uif.f.add(uif.l51); uif.f.add(uif.l52); uif.f.add(uif.l53); uif.f.add(uif.l54); uif.f.add(uif.l55); 
		uif.f.add(uif.buttonViewHealth); uif.f.add(uif.buttonViewTime); 
		uif.f.add(uif.tf1); uif.f.add(uif.tf2); uif.f.add(uif.tf3); uif.f.add(uif.tf4); uif.f.add(uif.tf5); uif.f.add(uif.tf6); //uif.f.add(tf7); uif.f.add(tf8);
		
		uif.f.setJMenuBar(uif.mb); 
	          
		uif.f.setSize(1200,800);
		uif.f.setLayout(null);  
		uif.f.setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {};

}
