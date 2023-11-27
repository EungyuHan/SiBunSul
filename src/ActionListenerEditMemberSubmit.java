package app;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

public class ActionListenerEditMemberSubmit implements ActionListener {
	private Member member;

	public ActionListenerEditMemberSubmit(Member member) {
		this.member = member;
	}
			
	public void actionPerformed(ActionEvent e) {
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

		JLabel nameLabel = new JLabel("Name: ");
		JLabel addressLabel = new JLabel("Address: ");
		JLabel emailLabel = new JLabel("Email: ");
		JLabel phoneLabel = new JLabel("Phone: ");
		JTextField nameField = new JTextField(member.getName());
		JTextField addressField = new JTextField(member.getAddress());
		JTextField emailField = new JTextField(member.getEmail());
		JTextField phoneField = new JTextField(member.getPhone());
		JButton editPTRecordButton = new JButton("Edit PT Record");
		JButton editHealthRecordButton = new JButton("Edit Health Record");

		// PT Record 수정부분, PT Record 추가가 구현이 안되어있어서 임시로 구현, PT Record 추가 구현하면 수정해야함
		editPTRecordButton.addActionListener(new ActionListener(){
			int index = 0;
			public void actionPerformed(ActionEvent e) {
				if(member.getPtRecord().size() == 0){
					JOptionPane.showMessageDialog(null, "No PT Record");
					return;
				}
				JDialog dialog = new JDialog();
				dialog.setLayout(new GridLayout(3,1));
				JLabel ptLabel = new JLabel("PT Record");

				JPanel editPanel = new JPanel();
				editPanel.setLayout(new GridLayout(4,2));
				JLabel yearLabel = new JLabel("Year: ");
				JLabel monthLabel = new JLabel("Month: ");
				JLabel dayLabel = new JLabel("Day: ");
				JLabel memoLabel = new JLabel("Memo: ");
				JTextField yearField = new JTextField(member.getPtRecord().get(index).getYear());
				JTextField monthField = new JTextField(member.getPtRecord().get(index).getMonth());
				JTextField dayField = new JTextField(member.getPtRecord().get(index).getDay());
				JTextField memoField = new JTextField(member.getPtRecord().get(index).getMemo());
				editPanel.add(yearLabel); editPanel.add(yearField); editPanel.add(monthLabel); editPanel.add(monthField);


				JPanel buttonPanel = new JPanel();
				buttonPanel.setLayout(new GridLayout(3,1));
				JButton previousButton = new JButton("Previous");
				JButton confirmButton = new JButton("Confirm");
				JButton nextButton = new JButton("Next");
				buttonPanel.add(previousButton);
				buttonPanel.add(confirmButton);
				buttonPanel.add(nextButton);

				previousButton.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e) {
						if(index > 0){
							index--;
							yearField.setText(member.getPtRecord().get(index).getYear());
							monthField.setText(member.getPtRecord().get(index).getMonth());
							dayField.setText(member.getPtRecord().get(index).getDay());
							memoField.setText(member.getPtRecord().get(index).getMemo());
						} else JOptionPane.showMessageDialog(null, "첫 번째 기록입니다.");
					}
				});
				nextButton.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e) {
						if(index < member.getPtRecord().size()-1){
							index++;
							yearField.setText(member.getPtRecord().get(index).getYear());
							monthField.setText(member.getPtRecord().get(index).getMonth());
							dayField.setText(member.getPtRecord().get(index).getDay());
							memoField.setText(member.getPtRecord().get(index).getMemo());
						} else JOptionPane.showMessageDialog(null, "마지막 기록입니다.");
					}
				});
				confirmButton.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e) {
						member.getPtRecord().get(index).setYear(yearField.getText());
						member.getPtRecord().get(index).setMonth(monthField.getText());
						member.getPtRecord().get(index).setDay(dayField.getText());
						member.getPtRecord().get(index).setMemo(memoField.getText());
						JOptionPane.showMessageDialog(null, "수정되었습니다.");
					}
				});

				dialog.add(ptLabel);
				dialog.add(editPanel);
				dialog.add(buttonPanel);
				dialog.setSize(300, 300);
				dialog.setVisible(true);
			}
		});
		editHealthRecordButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JPanel panel = new JPanel();

				JLabel heightLabel = new JLabel("Height: ");
				JLabel weightLabel = new JLabel("Weight: ");
				JLabel massLabel = new JLabel("Mass: ");
				JLabel fatLabel = new JLabel("Fat: ");
				JLabel commentLabel = new JLabel("Comment: ");

				JTextField heightField = new JTextField(String.valueOf(member.getHealthRecord().getHeight()));
				JTextField weightField = new JTextField(String.valueOf(member.getHealthRecord().getWeight()));
				JTextField massField = new JTextField(String.valueOf(member.getHealthRecord().getMass()));
				JTextField fatField = new JTextField(String.valueOf(member.getHealthRecord().getFat()));
				JTextField commentField = new JTextField(member.getHealthRecord().getComments());

				panel.setLayout(new GridLayout(6,2));
				panel.add(heightLabel); panel.add(heightField);
				panel.add(weightLabel); panel.add(weightField);
				panel.add(massLabel); panel.add(massField);
				panel.add(fatLabel); panel.add(fatField);
				panel.add(commentLabel); panel.add(commentField);

				int result = JOptionPane.showConfirmDialog(null, panel, "Edit Health Record", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
				if(result == JOptionPane.OK_OPTION){
					member.getHealthRecord().setHeight(Double.parseDouble(heightField.getText()));
					member.getHealthRecord().setWeight(Double.parseDouble(weightField.getText()));
					member.getHealthRecord().setMass(Double.parseDouble(massField.getText()));
					member.getHealthRecord().setFat(Double.parseDouble(fatField.getText()));
					member.getHealthRecord().setComments(commentField.getText());
					JOptionPane.showMessageDialog(null, "수정되었습니다.");
				}
			}
		});


		panel.add(nameLabel);
		panel.add(nameField);
		panel.add(addressLabel);
		panel.add(addressField);
		panel.add(emailLabel);
		panel.add(emailField);
		panel.add(phoneLabel);
		panel.add(phoneField);
		panel.add(editPTRecordButton);
		panel.add(editHealthRecordButton);

		int result = JOptionPane.showConfirmDialog(null, panel, "Edit Member", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
	}
	
}
