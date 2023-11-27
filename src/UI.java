package app;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Font;

public class UI implements ActionListener {
	
	AllVariables av = new AllVariables();
	UIFrame uif = new UIFrame();
	
	UI() {  
		
		/* ***************************** Setting Up J-Elements ***************************** */
		uif.panel.setLayout(null);

		uif.panel.setBounds(500, 50, 500, 600);
		uif.trainerLabel.setBounds(50,50,500,30);
		uif.trainerTextField.setBounds(50,100,200,20);
		uif.memberLabel.setBounds(50,150,500,30);
		uif.memberTextField.setBounds(50,200,200,20);
		uif.searchTrainerButton.setBounds(275,100,125,20);
		uif.searchMemberButton.setBounds(275,200,125,20);

		uif.nameLabel.setBounds(500,50,300,30);
		uif.nameLabel.setFont(new Font("TimesRoman", Font.BOLD, 20));
		uif.emailLabel.setBounds(500,100,500,30);
		uif.phoneLabel.setBounds(500,150,500,30);
		uif.majorLabel.setBounds(500,200,500,30);
		uif.gpaLabel.setBounds(500,250,500,30);
		uif.classYearLabel.setBounds(500,300,500,30);
		uif.healthRecordLabel.setBounds(500,350,500,30);
		uif.timeRecordLabel.setBounds(500,400,500,30);
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


		uif.tf2.setBounds(715,100,200,30);
		uif.tf3.setBounds(715,150,200,30);  
		uif.tf4.setBounds(715,200,200,30);  
		uif.tf5.setBounds(715,250,200,30);  
		uif.tf6.setBounds(715,300,200,30);

		uif.buttonViewHealth.setBounds(600,350,100,30);
		uif.buttonViewTime.setBounds(600,400,100,30);

		uif.submitButton.setBounds(820,50,100,30);

		uif.buttonViewTime.setVisible(false);
		uif.buttonViewHealth.setVisible(false);
		uif.submitButton.setVisible(false);
		uif.tf2.setVisible(false);
		uif.tf3.setVisible(false);
		uif.tf4.setVisible(false);
		uif.tf5.setVisible(false);
		uif.tf6.setVisible(false);

		// ***************************** Action Listener *****************************
		uif.searchTrainerButton.addActionListener(new ActionListenerTrainerSearch(av.trainerList, uif.panel, uif.trainerTextField));
		uif.searchMemberButton.addActionListener(new ActionListenerMemberSearch(av.trainerList, uif.panel, uif.trainerTextField ,uif.memberTextField));


		uif.addTrainerMenu.addActionListener(new ActionListenerAddTrainer(av.trainerList));

		uif.addMemberMenu.addActionListener(new ActionListenerAddMember(av.trainerList, av.memberList));

		// i7 : PT기록 보기
		uif.viewStatsMenu.addActionListener(new ActionListenerViewStats(av.ptRecordAll, uif.tf2, uif.tf3, uif.tf4, uif.tf5, uif.tf6, uif.nameLabel, uif.l3, uif.emailLabel, uif.phoneLabel, uif.majorLabel, uif.gpaLabel, uif.classYearLabel, uif.healthRecordLabel, uif.timeRecordLabel, uif.l11, uif.l12, uif.l13, uif.l14, uif.l15, uif.l16, uif.l17, uif.l18, uif.l19, uif.l20, uif.l21, uif.l22, uif.l23, uif.l24, uif.l25, uif.l26, uif.l27, uif.l28, uif.l29, uif.l30, uif.l31, uif.l32, uif.l33, uif.l34, uif.l35, uif.l36, uif.l37, uif.l38, uif.l39, uif.l40, uif.l41, uif.l42, uif.l43, uif.l44, uif.l45, uif.l46, uif.l47, uif.l48, uif.l49, uif.l50, uif.l51, uif.l52, uif.l53, uif.l54, uif.l55, uif.submitButton, uif.buttonViewHealth, uif.buttonViewTime));
		// i9 : 화면 제거
		uif.i9.addActionListener(new ActionListenerClearView(uif.panel));
		// ***************************** Add J-Elements to Frame *****************************
		
		uif.menu1.add(uif.addTrainerMenu); uif.menu1.add(uif.addMemberMenu); uif.menu2.add(uif.editTrainerMenu); uif.menu2.add(uif.editMemberMenu);
		uif.menu3.add(uif.viewGPAmenu); uif.menu3.add(uif.viewStatsMenu); uif.menu3.add(uif.i8); uif.menu4.add(uif.i9);
		
		uif.mb.add(uif.menu1); 
		uif.mb.add(uif.menu2);
		uif.mb.add(uif.menu3);
		uif.mb.add(uif.menu4);
		
		uif.f.add(uif.searchTrainerButton); uif.f.add(uif.submitButton);
		uif.panel.add(new JLabel("TEST"));
		uif.f.add(uif.panel);
		uif.panel.setVisible(true);
		uif.f.add(uif.trainerLabel); uif.f.add(uif.nameLabel); uif.f.add(uif.l3); uif.f.add(uif.emailLabel); uif.f.add(uif.phoneLabel); uif.f.add(uif.majorLabel); uif.f.add(uif.gpaLabel); uif.f.add(uif.classYearLabel); uif.f.add(uif.healthRecordLabel); uif.f.add(uif.timeRecordLabel);
		uif.f.add(uif.l11); uif.f.add(uif.l12); uif.f.add(uif.l13); uif.f.add(uif.l14); uif.f.add(uif.l15); uif.f.add(uif.l16); uif.f.add(uif.l17); uif.f.add(uif.l18); uif.f.add(uif.l19); uif.f.add(uif.l20);
		uif.f.add(uif.l21); uif.f.add(uif.l22); uif.f.add(uif.l23); uif.f.add(uif.l24); uif.f.add(uif.l25); uif.f.add(uif.l26); uif.f.add(uif.l27); uif.f.add(uif.l28); uif.f.add(uif.l29); uif.f.add(uif.l30); 
		uif.f.add(uif.l31); uif.f.add(uif.l32); uif.f.add(uif.l33); uif.f.add(uif.l34); uif.f.add(uif.l35); uif.f.add(uif.l36); uif.f.add(uif.l37); uif.f.add(uif.l38); uif.f.add(uif.l39); uif.f.add(uif.l40); 
		uif.f.add(uif.l41); uif.f.add(uif.l42); uif.f.add(uif.l43); uif.f.add(uif.l44); uif.f.add(uif.l45); uif.f.add(uif.l46); uif.f.add(uif.l47); uif.f.add(uif.l48); uif.f.add(uif.l49); uif.f.add(uif.l50); 
		uif.f.add(uif.l51); uif.f.add(uif.l52); uif.f.add(uif.l53); uif.f.add(uif.l54); uif.f.add(uif.l55); 
		uif.f.add(uif.buttonViewHealth); uif.f.add(uif.buttonViewTime); 
		uif.f.add(uif.trainerTextField); uif.f.add(uif.tf2); uif.f.add(uif.tf3); uif.f.add(uif.tf4); uif.f.add(uif.tf5); uif.f.add(uif.tf6); //uif.f.add(tf7); uif.f.add(tf8);
		uif.f.add(uif.memberLabel); uif.f.add(uif.memberTextField); uif.f.add(uif.searchMemberButton);

		uif.f.setJMenuBar(uif.mb); 
	          
		uif.f.setSize(1200,800);
		uif.f.setLayout(null);  
		uif.f.setVisible(true);
		uif.f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {};

}
