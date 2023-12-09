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



		uif.searchTrainerButton.addActionListener(new ActionListenerTrainerSearch(Data.trainerList, uif.mainPanel, uif.trainerTextField));
		uif.searchMemberButton.addActionListener(new ActionListenerMemberSearch(Data.trainerList, uif.mainPanel, uif.trainerTextField ,uif.memberTextField));

		uif.addTrainerMenu.addActionListener(new ActionListenerAddTrainer(Data.trainerList));
		uif.addMemberMenu.addActionListener(new ActionListenerAddMember(Data.trainerList, Data.memberList));

		uif.viewTrainerList.addActionListener(new ActionListenerViewTrainerList(uif.mainPanel, Data.memberList, Data.trainerList));
		uif.viewMemberList.addActionListener(new ActionListenerViewMemberList(uif.mainPanel, Data.memberList, Data.trainerList));

		uif.clearButton.addActionListener(new ActionListenerClearView(uif.mainPanel));
		uif.changePassword.addActionListener(new ActionListenerChangePassword());


		
		uif.addMenu.add(uif.addTrainerMenu); uif.addMenu.add(uif.addMemberMenu);
		uif.viewMenu.add(uif.viewMemberList); uif.viewMenu.add(uif.viewTrainerList);
		uif.clearMenu.add(uif.clearButton);
		uif.settingMenu.add(uif.changePassword);
		
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
