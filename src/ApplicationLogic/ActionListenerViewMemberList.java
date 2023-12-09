package app.ApplicationLogic;

import app.Entity.Member;
import app.Entity.PTrecord;
import app.Entity.Trainer;

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
	private int memberIndex;
	private int ptIndex;

	public ActionListenerViewMemberList(JPanel panel, ArrayList<Member> memberList, ArrayList<Trainer> trainerList){
		this.mainPanel = panel;
		this.memberList = memberList;
		this.trainerList = trainerList;
		this.memberIndex = 0;
		this.ptIndex = 0;

		subPanel = new JPanel();
		memberPanel = new JPanel();
		buttonPanel = new JPanel();

		subPanel.setLayout(new BorderLayout());
		subPanel.setBounds(0, 0, 500, 600);
		memberPanel.setLayout(new GridLayout(4,1));
		buttonPanel.setLayout(new GridLayout(1,2));

		nextButton = new JButton("Next");
		previousButton = new JButton("Previous");
		buttonPanel.add(previousButton);
		buttonPanel.add(nextButton);

		nextButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(memberIndex + 4 >= memberList.size()){
					JOptionPane.showMessageDialog(null, "마지막 페이지입니다.");
					return;
				}
				memberIndex += 4;
				updateMemberList();
			}
		});

		previousButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(memberIndex - 4 < 0){
					JOptionPane.showMessageDialog(null, "첫 페이지입니다.");
					return;
				}
				memberIndex -= 4;
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

		subPanel.add(buttonPanel, BorderLayout.SOUTH);
		mainPanel.revalidate();
		mainPanel.repaint();
	}

	private void updateMemberList() {
		memberPanel.removeAll();
		for(int i = memberIndex; i< memberIndex +4 && i<memberList.size(); i++){
			JPanel memberInfoLabel = new JPanel(new GridLayout(2, 1));
			Member member = memberList.get(i);
			JLabel memberLabel = new JLabel(member.toString());
			JPanel memberButtonPanel = new JPanel(new GridLayout(1, 4));
			JButton ptRecordButton = new JButton("PT Record");
			JButton healthRecordButton = new JButton("Health Record");
			JButton deleteButton = new JButton("Delete");

			memberButtonPanel.add(ptRecordButton);
			memberButtonPanel.add(healthRecordButton);
			memberButtonPanel.add(deleteButton);
			healthRecordButton.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null, "Health Record: \n" + member.getHealthRecord().toString());
				}
			});
			ptRecordButton.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					ArrayList<PTrecord> ptRecordList = member.getPtRecord();
					ptIndex = 0;
					if(ptRecordList.size() == 0){
						JOptionPane.showMessageDialog(null, "등록된 PT Record가 없습니다.");
						return;
					}
					JDialog dialog = new JDialog();
					JPanel ptRecordPanel = new JPanel();
					JPanel ptRecordButtonPanel = new JPanel();
					JLabel ptDateLabel = new JLabel(ptRecordList.get(ptIndex).getDate());
					JLabel ptMemoLabel = new JLabel(ptRecordList.get(ptIndex).getMemo());
					JButton nextButton = new JButton("Next");
					JButton previousButton = new JButton("Previous");

					ptRecordPanel.setLayout(new BorderLayout());
					ptRecordButtonPanel.setLayout(new GridLayout(1, 2));

					nextButton.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent e) {
							if(ptIndex + 1 >= ptRecordList.size()){
								JOptionPane.showMessageDialog(null, "마지막 페이지입니다.");
								return;
							}
							ptIndex += 1;
							ptDateLabel.setText(ptRecordList.get(ptIndex).getDate());
							ptMemoLabel.setText(ptRecordList.get(ptIndex).getMemo());
						}
					});
					previousButton.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent e) {
							if(ptIndex - 1 < 0){
								JOptionPane.showMessageDialog(null, "첫 페이지입니다.");
								return;
							}
							ptIndex -= 1;
							ptDateLabel.setText(ptRecordList.get(ptIndex).toString());
							ptMemoLabel.setText(ptRecordList.get(ptIndex).getMemo());
						}
					});

					ptRecordButtonPanel.add(previousButton);
					ptRecordButtonPanel.add(nextButton);
					ptRecordPanel.add(ptDateLabel, BorderLayout.NORTH);
					ptRecordPanel.add(ptMemoLabel, BorderLayout.CENTER);
					ptRecordPanel.add(ptRecordButtonPanel, BorderLayout.SOUTH);
					dialog.add(ptRecordPanel);
					dialog.setSize(500, 200);
					dialog.setVisible(true);
				}
			});
			deleteButton.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					int result = JOptionPane.showConfirmDialog(null, "정말로 삭제하시겠습니까?", "Delete", JOptionPane.YES_NO_OPTION);
					if(result == JOptionPane.YES_OPTION){
						for(Trainer trainer: trainerList){
							if(trainer.getName().equals(member.getTrainerName())){
								trainer.getMemberList().remove(member);
								memberList.remove(member);
								JOptionPane.showMessageDialog(null, "삭제되었습니다.");
								updateMemberList();
								return;
							}
						}
					}
				}
			});

			memberInfoLabel.add(memberLabel);
			memberInfoLabel.add(memberButtonPanel);
			memberPanel.add(memberInfoLabel);
		}
		memberPanel.revalidate();
		memberPanel.repaint();
	}
}
