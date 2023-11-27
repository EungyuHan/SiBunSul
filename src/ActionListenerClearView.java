package app;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ActionListenerClearView implements ActionListener {

	private JPanel panel;

	public ActionListenerClearView(JPanel panel){
		this.panel = panel;
	}
			
	public void actionPerformed(ActionEvent e) {
		panel.removeAll();
		panel.repaint();
		panel.revalidate();
	}
}