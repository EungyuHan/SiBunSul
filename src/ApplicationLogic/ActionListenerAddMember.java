package app.ApplicationLogic;

import app.Entity.HealthRecord;
import app.Entity.Member;
import app.Entity.PTrecord;
import app.Entity.Trainer;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ActionListenerAddMember implements ActionListener {

	private ArrayList<Trainer> trainerList;
	private ArrayList<Member> memberList;
	private Trainer trainer;

	public ActionListenerAddMember(ArrayList<Trainer> trainerList, ArrayList<Member> memberList) {
		this.trainerList = trainerList;
		this.memberList = memberList;
	}


			
	public void actionPerformed(ActionEvent e) {

// ***************************** Add Student *****************************

		JFrame f = new JFrame("Add Student");
			
		JPanel trainerPane = new JPanel();
		trainerPane.setLayout(new GridLayout(0, 2, 2, 2));

		JTextField TrainerField = new JTextField(10);

		trainerPane.add(new JLabel("Trainer: "));
		trainerPane.add(TrainerField);
		int option = JOptionPane.showConfirmDialog(f, trainerPane, "Add Member", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
		if(option == JOptionPane.YES_OPTION) {
			String trainerInput = TrainerField.getText();
			trainer = null;
			for(Trainer t : trainerList) {
				if(t.getName().equals(trainerInput)) {
					trainer = t;
				}
			}
			if(trainer == null) {
				JOptionPane.showMessageDialog(f, "Trainer not found");
				return;
			}
			JPanel pane = new JPanel();
			pane.setLayout(new GridLayout(9, 2, 2, 2));

			JTextField nameField = new JTextField(10);
			JTextField addressField = new JTextField(10);
			JTextField emailField = new JTextField(10);
			JTextField phoneField = new JTextField(10);

			JTextField heightField = new JTextField(10);
			JTextField weightField = new JTextField(10);
			JTextField massField = new JTextField(10);
			JTextField fatField = new JTextField(10);
			JTextField commentsField = new JTextField(10);

			pane.add(new JLabel("Name: "));
			pane.add(nameField);
			pane.add(new JLabel("Address: "));
			pane.add(addressField);
			pane.add(new JLabel("Email: "));
			pane.add(emailField);
			pane.add(new JLabel("Phone: "));
			pane.add(phoneField);
			pane.add(new JLabel("Height: "));
			pane.add(heightField);
			pane.add(new JLabel("Weight: "));
			pane.add(weightField);
			pane.add(new JLabel("Mass: "));
			pane.add(massField);
			pane.add(new JLabel("Fat: "));
			pane.add(fatField);
			pane.add(new JLabel("Comments: "));
			pane.add(commentsField);

			option = JOptionPane.showConfirmDialog(f, pane, "Add Member", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
			if (option == JOptionPane.YES_OPTION) {

				String nameInput = nameField.getText();
				String addressInput = addressField.getText();
				String emailInput = emailField.getText();
				String phoneInput = phoneField.getText();

				if(nameInput.equals("") || addressInput.equals("") || emailInput.equals("") || phoneInput.equals("")) {
					JOptionPane.showMessageDialog(f, "모든 정보를 입력해주세요");
					return;
				}

				double heightInput, weightInput, massInput, fatInput;
				try{
					heightInput = Double.parseDouble(heightField.getText());
					weightInput = Double.parseDouble(weightField.getText());
					massInput = Double.parseDouble(massField.getText());
					fatInput = Double.parseDouble(fatField.getText());
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(f, "유효한 값을 입력해주세요");
					return;
				}
				if(heightInput <= 0 || weightInput <= 0 || massInput <= 0 || fatInput <= 0) {
					JOptionPane.showMessageDialog(f, "유효한 값을 입력해주세요");
					return;
				}

				String commentsInput = commentsField.getText();

				HealthRecord healthRecord = new HealthRecord(heightInput, weightInput, massInput, fatInput, commentsInput);
				Member member = new Member(nameInput, addressInput, emailInput, phoneInput, trainer.getName(), new ArrayList<PTrecord>(), healthRecord);
				trainer.getMemberList().add(member);
				memberList.add(member);
			}
		}
	}
}