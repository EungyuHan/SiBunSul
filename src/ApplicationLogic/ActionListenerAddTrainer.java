package app.ApplicationLogic;

import app.Data;
import app.Entity.Member;
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

public class ActionListenerAddTrainer implements ActionListener  {

	public ActionListenerAddTrainer(){

    }
			
	public void actionPerformed(ActionEvent e) {
		
		// ***************************** Add Stats *****************************
		
		JFrame f = new JFrame("트레이너 등록");
		
		JPanel pane = new JPanel();
	    pane.setLayout(new GridLayout(0, 2, 2, 2));

	    JTextField nameField = new JTextField(10);
	    JTextField addressField = new JTextField(10);
	    JTextField emailField = new JTextField(10);
	    JTextField phoneField = new JTextField(10);

	    pane.add(new JLabel("이름: "));
	    pane.add(nameField);

	    pane.add(new JLabel("주소: "));
	    pane.add(addressField);

	    pane.add(new JLabel("이메일: "));
	    pane.add(emailField);

	    pane.add(new JLabel("휴대폰: "));
	    pane.add(phoneField);
	
	    int option = JOptionPane.showConfirmDialog(f, pane, "트레이너 등록", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
	    
	    if (option == JOptionPane.YES_OPTION) {

	        String nameInput = nameField.getText();
	        String addressInput = addressField.getText();
	        String emailInput = emailField.getText();
	        String phoneInput = phoneField.getText();

			if(nameInput.equals("") || addressInput.equals("") || emailInput.equals("") || phoneInput.equals("")) {
				JOptionPane.showMessageDialog(f, "모든 정보를 입력해주세요");
				return;
			}

	        Trainer trainer = new Trainer(nameInput, addressInput, emailInput, phoneInput, new ArrayList<Member>());
	        Data.trainerList.add(trainer);
	    }
	}
}