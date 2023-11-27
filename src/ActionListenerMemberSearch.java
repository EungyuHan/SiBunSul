package app;

import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ActionListenerMemberSearch implements ActionListener {
    JPanel panel;
    private ArrayList<Trainer> trainerList;
    private JTextField trainerField, memberField;



    public ActionListenerMemberSearch(ArrayList<Trainer> trainerList, JPanel panel, JTextField trainerField, JTextField memberField){
        this.trainerList = trainerList;
        this.panel = panel;
        this.trainerField = trainerField;
        this.memberField = memberField;
    }

    public void actionPerformed(ActionEvent e) {

        // ***************************** Search *****************************

        String trainerName = trainerField.getText();
        String memberName = memberField.getText();
//        System.out.println("Trainer Name: " + trainerName);
//        System.out.println("Member Name: " + memberName);

        boolean trainerFound = false;
        boolean memberFound = false;

        for(Trainer trainer : trainerList){
            if(trainer.getName().equals(trainerName)){
                trainerFound = true;
                for(Member member : trainer.getMemberList()){
                    System.out.println("Member Name: " + member.getName());
                    System.out.println("Input Member Name: " + memberName);
                    if(member.getName().equals(memberName)){
                        memberFound = true;
                        panel.removeAll();

                        JLabel nameLabel = new JLabel("Trianer Name: " + member.getName());
                        nameLabel.setFont(new Font("TimesRoman", Font.BOLD, 20));
                        JLabel addressLabel = new JLabel("Address: " + member.getAddress());
                        JLabel emailLabel = new JLabel("Email: " + member.getEmail());
                        JLabel phoneLabel = new JLabel("Phone: " + member.getPhone());
                        nameLabel.setBounds(0, 0, 300, 30);
                        addressLabel.setBounds(0, 50, 300, 30);
                        emailLabel.setBounds(0, 100, 300, 30);
                        phoneLabel.setBounds(0, 150, 300, 30);

                        JButton healthRecordButton = new JButton("Health Record");
                        JButton ptRecordButton = new JButton("PT Record");
                        healthRecordButton.setBounds(0, 200, 150, 30);
                        ptRecordButton.setBounds(0, 250, 150, 30);

                        healthRecordButton.addActionListener(new ActionListener(){
                            public void actionPerformed(ActionEvent e) {
                                JOptionPane.showMessageDialog(null, "Health Record: " + member.getHealthRecord().toString());
                            }
                        });
                        ptRecordButton.addActionListener(new ActionListener(){
                            public void actionPerformed(ActionEvent e) {
                                String message="";
                                for(PTrecord ptRecord : member.getPtRecord()){
                                    message += ptRecord.toString() + "\n";
                                }
                                if(message.equals(""))
                                    message = "No PT Record";
                                JOptionPane.showMessageDialog(null, message);
                            }
                        });

                        panel.add(nameLabel);
                        panel.add(addressLabel);
                        panel.add(emailLabel);
                        panel.add(phoneLabel);
                        panel.add(healthRecordButton);
                        panel.add(ptRecordButton);

                        panel.revalidate();
                        panel.repaint();
                        break;
                    }
                }
                break;
            }
        }

        if(!trainerFound){
            JOptionPane.showMessageDialog(null, "Trainer not found");
        }
        else if(!memberFound){
            System.out.println(memberName);
            JOptionPane.showMessageDialog(null, "Member not found");
        }
    }

}