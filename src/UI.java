package app;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Font;

public class UI implements ActionListener {
	
	AllVariables av = new AllVariables();
	UIFrame uif = new UIFrame();
	
	UI() {  
		
		/* ***************************** Setting Up J-Elements ***************************** */
		uif.mainPanel.setLayout(null);

		uif.mainPanel.setBounds(500, 50, 500, 600);
		uif.trainerLabel.setBounds(50,50,500,30);
		uif.trainerTextField.setBounds(50,100,200,20);
		uif.memberLabel.setBounds(50,150,500,30);
		uif.memberTextField.setBounds(50,200,200,20);
		uif.searchTrainerButton.setBounds(275,100,125,20);
		uif.searchMemberButton.setBounds(275,200,125,20);

		uif.submitButton.setBounds(820,50,100,30);

		uif.submitButton.setVisible(false);
		// ***************************** Action Listener *****************************
		uif.searchTrainerButton.addActionListener(new ActionListenerTrainerSearch(av.trainerList, uif.mainPanel, uif.trainerTextField));
		uif.searchMemberButton.addActionListener(new ActionListenerMemberSearch(av.trainerList, uif.mainPanel, uif.trainerTextField ,uif.memberTextField));


		uif.addTrainerMenu.addActionListener(new ActionListenerAddTrainer(av.trainerList));
		uif.addMemberMenu.addActionListener(new ActionListenerAddMember(av.trainerList, av.memberList));

		uif.viewTrainerList.addActionListener(new ActionListenerViewTrainerList(uif.mainPanel, av.memberList, av.trainerList));
		uif.viewMemberList.addActionListener(new ActionListenerViewMemberList(uif.mainPanel, av.memberList, av.trainerList));

		// i9 : 화면 제거
		uif.clearButton.addActionListener(new ActionListenerClearView(uif.mainPanel));
		// ***************************** Add J-Elements to Frame *****************************
		
		uif.addMenu.add(uif.addTrainerMenu); uif.addMenu.add(uif.addMemberMenu);
		uif.viewMenu.add(uif.viewMemberList); uif.viewMenu.add(uif.viewTrainerList); uif.clearMenu.add(uif.clearButton);
		
		uif.mb.add(uif.addMenu);
		uif.mb.add(uif.viewMenu);
		uif.mb.add(uif.clearMenu);
		
		uif.f.add(uif.searchTrainerButton); uif.f.add(uif.submitButton);
		uif.mainPanel.add(new JLabel("TEST"));
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
	
	@Override
	public void actionPerformed(ActionEvent e) {};

}
