package app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ActionListenerViewMemberList implements ActionListener {
	private JPanel mainPanel;
	private JPanel subPanel;
	private JPanel memberPanel;
	private JPanel buttonPanel;
	private JButton nextButton;
	private JButton previousButton;
	private ArrayList<Member> memberList;
	private ArrayList<Trainer> trainerList;
	private int index;

	public ActionListenerViewMemberList(JPanel panel, ArrayList<Member> memberList, ArrayList<Trainer> trainerList){
		this.mainPanel = panel;
		this.memberList = memberList;
		this.trainerList = trainerList;
		this.index = 0;

		subPanel = new JPanel();
		memberPanel = new JPanel();
		buttonPanel = new JPanel();

		subPanel.setLayout(new BorderLayout());
		subPanel.setBounds(0, 0, 500, 600);
		memberPanel.setLayout(new GridLayout(4,1));
		buttonPanel.setLayout(new GridLayout(1,2));

		nextButton = new JButton("Next");
		previousButton = new JButton("Previous");

		nextButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(index + 4 >= memberList.size()){
					JOptionPane.showMessageDialog(null, "마지막 페이지입니다.");
					return;
				}
				index += 4;
				updateMemberList();
			}
		});

		previousButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(index - 4 < 0){
					JOptionPane.showMessageDialog(null, "첫 페이지입니다.");
					return;
				}
				index -= 4;
				updateMemberList();
			}
		});
	}

	public void actionPerformed(ActionEvent e) {
		if(memberList.size() == 0){
			JOptionPane.showMessageDialog(null, "등록된 회원이 없습니다.");
			return;
		}
		mainPanel.removeAll();
		mainPanel.add(subPanel);
		subPanel.add(memberPanel, BorderLayout.CENTER);

		updateMemberList();

		buttonPanel.add(previousButton);
		buttonPanel.add(nextButton);
		subPanel.add(buttonPanel, BorderLayout.SOUTH);
		mainPanel.revalidate();
		mainPanel.repaint();
	}

	private void updateMemberList() {
		memberPanel.removeAll();
		for(int i=index; i<index+4 && i<memberList.size(); i++){
			JPanel rowPanel = new JPanel(new GridLayout(2, 1));
			JLabel memberLabel = new JLabel(memberList.get(i).toString());
			JPanel memberButtonPanel = new JPanel(new GridLayout(1, 3));
			JButton ptRecordButton = new JButton("PT Record");
			JButton healthRecordButton = new JButton("Health Record");
			JButton deleteButton = new JButton("Delete");

			memberButtonPanel.add(ptRecordButton);
			memberButtonPanel.add(healthRecordButton);
			memberButtonPanel.add(deleteButton);
			rowPanel.add(memberLabel);
			rowPanel.add(memberButtonPanel);
			memberPanel.add(rowPanel);
		}
		memberPanel.revalidate();
		memberPanel.repaint();
	}
}
