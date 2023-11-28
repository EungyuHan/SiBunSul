package app;

import javax.swing.*;

public class UIFrame {
	public JFrame f = new JFrame("Application");  
	public JMenuBar mb=new JMenuBar();
	public JPanel mainPanel = new JPanel();
    
	public JMenu addMenu =new JMenu("Add");
	public JMenu viewMenu =new JMenu("View");
	public JMenu clearMenu =new JMenu("Clear");
	public JMenuItem addTrainerMenu = new JMenuItem("Add Trainer");
	public JMenuItem addMemberMenu = new JMenuItem("Add Member");
	public JMenuItem viewMemberList =new JMenuItem("View Member");
	public JMenuItem viewTrainerList =new JMenuItem("View Trainer");
	public JMenuItem clearButton =new JMenuItem("Clear View");
	public JLabel trainerLabel =new JLabel("Welcome! Search for a Trainer here:");
	public JLabel memberLabel =new JLabel("Search for a Member here:");
	public JTextField trainerTextField =new JTextField();
	public JTextField memberTextField =new JTextField();
	public JButton searchTrainerButton =new JButton("Search Trainer");
	public JButton searchMemberButton =new JButton("Search Member");

}
