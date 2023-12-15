package app.Boundary;
import app.ApplicationLogic.*;
import app.Data;

import javax.swing.*;

public class UI{
	UIFrame uif = new UIFrame();
	
	public UI() {
		uif.mainPanel.setLayout(null);

		uif.mainPanel.setBounds(500, 50, 500, 600);
		uif.trainerLabel.setBounds(50,50,500,30);
		uif.trainerTextField.setBounds(50,100,200,20);
		uif.memberLabel.setBounds(50,150,500,30);
		uif.memberTextField.setBounds(50,200,200,20);
		uif.searchTrainerButton.setBounds(275,100,125,20);
		uif.searchMemberButton.setBounds(275,200,125,20);



		uif.searchTrainerButton.addActionListener(new ActionListenerTrainerSearch(uif.mainPanel, uif.trainerTextField));
		uif.searchMemberButton.addActionListener(new ActionListenerMemberSearch(uif.mainPanel, uif.memberTextField));

		uif.addTrainerMenu.addActionListener(new ActionListenerAddTrainer());
		uif.addMemberMenu.addActionListener(new ActionListenerAddMember());

		uif.viewTrainerListMenu.addActionListener(new ActionListenerViewTrainerList(uif.mainPanel));
		uif.viewMemberListMenu.addActionListener(new ActionListenerViewMemberList(uif.mainPanel, Data.memberList));

		uif.clearButton.addActionListener(new ActionListenerClearView(uif.mainPanel));
		uif.changePasswordMenu.addActionListener(new ActionListenerChangePassword());


		
		uif.addMenu.add(uif.addTrainerMenu); uif.addMenu.add(uif.addMemberMenu);
		uif.viewMenu.add(uif.viewMemberListMenu); uif.viewMenu.add(uif.viewTrainerListMenu);
		uif.clearMenu.add(uif.clearButton);
		uif.settingMenu.add(uif.changePasswordMenu);
		
		uif.mb.add(uif.addMenu);
		uif.mb.add(uif.viewMenu);
		uif.mb.add(uif.clearMenu);
		uif.mb.add(uif.settingMenu);
		
		uif.f.add(uif.searchTrainerButton);
		uif.f.add(uif.mainPanel);
		uif.mainPanel.setVisible(true);
		uif.f.add(uif.trainerLabel);
		uif.f.add(uif.trainerTextField);
		uif.f.add(uif.memberLabel); uif.f.add(uif.memberTextField); uif.f.add(uif.searchMemberButton);

		uif.f.setJMenuBar(uif.mb); 
	          
		uif.f.setSize(1200,800);
		uif.f.setLayout(null);  
		uif.f.setVisible(true);
		uif.f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
