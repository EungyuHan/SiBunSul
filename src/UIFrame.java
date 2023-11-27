package app;

import javax.swing.*;

public class UIFrame {
	
	public JFrame f = new JFrame("Application");  
	public JMenuBar mb=new JMenuBar(); 
    
	public JMenu menu1=new JMenu("Add");
	public JMenu menu2=new JMenu("Edit");
	public JMenu menu3=new JMenu("View");
	public JMenu menu4=new JMenu("Clear");

	public JMenuItem addTrainerMenu = new JMenuItem("Add Trainer");
	public JMenuItem addMemberMenu = new JMenuItem("Add Member");
	public JMenuItem i3=new JMenuItem("Add Announcement");
	public JMenuItem editTrainerMenu =new JMenuItem("Edit Trainer");
	public JMenuItem editMemberMenu =new JMenuItem("Edit Member");
	public JMenuItem viewGPAmenu =new JMenuItem("View GPA");
	public JMenuItem viewStatsMenu =new JMenuItem("View Stats"); // 원래 SwimTimeEntry 목록 보는 버튼
	public JMenuItem i8=new JMenuItem("View Roster");
	public JMenuItem i9=new JMenuItem("Clear View");
	
	public JLabel trainerLabel =new JLabel("Welcome! Search for a Trainer here:");
	public JLabel memberLabel =new JLabel("Search for a Member here:");
	public JLabel nameLabel =new JLabel();
	public JLabel l3 = new JLabel();
	public JPanel panel = new JPanel();
	public JLabel emailLabel = new JLabel(); 
	public JLabel phoneLabel = new JLabel();
	public JLabel majorLabel = new JLabel();
	public JLabel gpaLabel = new JLabel();
	public JLabel classYearLabel = new JLabel();
	public JLabel healthRecordLabel = new JLabel();
	public JLabel timeRecordLabel = new JLabel();
	public JLabel l11 = new JLabel();
	public JLabel l12 = new JLabel(); 
	public JLabel l13 = new JLabel();
	public JLabel l14 = new JLabel();
	public JLabel l15 = new JLabel(); 
	public JLabel l16 = new JLabel();
	public JLabel l17 = new JLabel();
	public JLabel l18 = new JLabel();
	public JLabel l19 = new JLabel();
	public JLabel l20 = new JLabel();
	public JLabel l21 = new JLabel(); 
	public JLabel l22 = new JLabel(); 
	public JLabel l23 = new JLabel(); 
	public JLabel l24 = new JLabel();
	public JLabel l25 = new JLabel(); 
	public JLabel l26 = new JLabel(); 
	public JLabel l27 = new JLabel(); 
	public JLabel l28 = new JLabel(); 
	public JLabel l29 = new JLabel(); 
	public JLabel l30 = new JLabel(); 
	public JLabel l31 = new JLabel(); 
	public JLabel l32 = new JLabel(); 
	public JLabel l33 = new JLabel(); 
	public JLabel l34 = new JLabel(); 
	public JLabel l35 = new JLabel(); 
	public JLabel l36 = new JLabel(); 
	public JLabel l37 = new JLabel(); 
	public JLabel l38 = new JLabel(); 
	public JLabel l39 = new JLabel(); 
	public JLabel l40 = new JLabel(); 
	public JLabel l41 = new JLabel(); 
	public JLabel l42 = new JLabel(); 
	public JLabel l43 = new JLabel(); 
	public JLabel l44 = new JLabel(); 
	public JLabel l45 = new JLabel(); 
	public JLabel l46 = new JLabel(); 
	public JLabel l47 = new JLabel(); 
	public JLabel l48 = new JLabel(); 
	public JLabel l49 = new JLabel(); 
	public JLabel l50 = new JLabel(); 
	public JLabel l51 = new JLabel(); 
	public JLabel l52 = new JLabel(); 
	public JLabel l53 = new JLabel(); 
	public JLabel l54 = new JLabel();		
	public JLabel l55 = new JLabel(); 
	
	public JButton buttonViewHealth = new JButton();
	public JButton buttonViewTime = new JButton();
			
    public JTextField trainerTextField =new JTextField();
	public JTextField memberTextField =new JTextField();
    public JTextField tf2=new JTextField();
    public JTextField tf3=new JTextField();
    public JTextField tf4=new JTextField();
    public JTextField tf5=new JTextField();
    public JTextField tf6=new JTextField();
    
    public JButton searchTrainerButton =new JButton("Search Trainer");
	public JButton searchMemberButton =new JButton("Search Member");
    public JButton submitButton =new JButton("Submit");
	
}
