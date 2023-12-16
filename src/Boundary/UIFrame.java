package app.Boundary;

import javax.swing.*;

public class UIFrame {
	public JFrame f = new JFrame("헬스장 회원 관리 시스템");  
	public JMenuBar mb=new JMenuBar();
	public JPanel mainPanel = new JPanel();
    
	public JMenu addMenu =new JMenu("등록");
	public JMenu viewMenu =new JMenu("보기");
	public JMenu clearMenu =new JMenu("초기화");
	public JMenu settingMenu=new JMenu("설정");
	public JMenuItem addTrainerMenu = new JMenuItem("트레이너 등록");
	public JMenuItem addMemberMenu = new JMenuItem("회원 등록");
	public JMenuItem viewMemberListMenu =new JMenuItem("회원 목록 보기");
	public JMenuItem viewTrainerListMenu =new JMenuItem("트레이너 목록 보기");
	public JMenuItem clearButton =new JMenuItem("화면 초기화");
	public JMenuItem changePasswordMenu = new JMenuItem("비밀번호 변경");
	public JLabel trainerLabel =new JLabel("트레이너 이름을 입력하세요:");
	public JLabel memberLabel =new JLabel("회원 이름을 입력하세요:");
	public JTextField trainerTextField =new JTextField();
	public JTextField memberTextField =new JTextField();
	public JButton searchTrainerButton =new JButton("트레이너 검색");
	public JButton searchMemberButton =new JButton("회원 검색");

}
