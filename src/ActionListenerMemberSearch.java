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


    public ActionListenerMemberSearch(ArrayList<Trainer> trainerList, JPanel panel, JTextField trainerField, JTextField memberField) {
        this.trainerList = trainerList;
        this.panel = panel;
        this.trainerField = trainerField;
        this.memberField = memberField;
    }

    public void actionPerformed(ActionEvent e) {

        // ***************************** Search *****************************

        String trainerName = trainerField.getText();
        String memberName = memberField.getText();
        boolean trainerFound = false;
        boolean memberFound = false;

        for (Trainer trainer : trainerList) {
            if (trainer.getName().equals(trainerName)) {
                trainerFound = true;
                for (Member member : trainer.getMemberList()) {
                    if (member.getName().equals(memberName)) {
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
                        JButton editButton = new JButton("Edit Profile");
                        healthRecordButton.setBounds(0, 200, 150, 30);
                        ptRecordButton.setBounds(0, 250, 150, 30);
                        editButton.setBounds(0, 300, 150, 30);

                        healthRecordButton.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                JOptionPane.showMessageDialog(null, "Health Record: \n" + member.getHealthRecord().toString());
                            }
                        });
                        ptRecordButton.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                // Create a new frame for PT record input
                                JFrame ptRecordFrame = new JFrame("PT Record Input");

                                // Create components for PT record input
                                JPanel ptRecordPane = new JPanel(new GridLayout(4, 2));
                                JTextField yearField = new JTextField();
                                JTextField monthField = new JTextField();
                                JTextField dayField = new JTextField();
                                JTextField memoField = new JTextField();
                                ptRecordPane.add(new JLabel("Year: "));
                                ptRecordPane.add(yearField);
                                ptRecordPane.add(new JLabel("Month: "));
                                ptRecordPane.add(monthField);
                                ptRecordPane.add(new JLabel("Day: "));
                                ptRecordPane.add(dayField);
                                ptRecordPane.add(new JLabel("Memo: "));
                                ptRecordPane.add(memoField);

                                int option = JOptionPane.showConfirmDialog(ptRecordFrame, ptRecordPane, "Enter PT Record", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
                                if (option == JOptionPane.OK_OPTION) {
                                    String yearInput = yearField.getText();
                                    String monthInput = monthField.getText();
                                    String dayInput = dayField.getText();
                                    String memoInput = memoField.getText();

                                    if (!isValidNumberInput(yearInput) || !isValidNumberInput(monthInput) || !isValidNumberInput(dayInput)) {
                                        JOptionPane.showMessageDialog(ptRecordFrame, "Invalid input for numeric fields");
                                        return;
                                    }

                                    PTrecord ptRecord = new PTrecord(yearInput, monthInput, dayInput, memoInput);
                                    member.getPtRecord().add(ptRecord);

                                    JFrame ptRecordHistoryFrame = new JFrame("PT Record");

                                    JTextArea ptRecordTextArea = new JTextArea();
                                    ptRecordTextArea.setEditable(false);

                                    for (PTrecord record : member.getPtRecord()) {
                                        ptRecordTextArea.append(record.toString() + "\n");
                                    }

                                    if (member.getPtRecord().isEmpty()) {
                                        ptRecordTextArea.setText("No PT Record History");
                                    }

                                    JScrollPane scrollPane = new JScrollPane(ptRecordTextArea);

                                    // Add the scroll pane to the frame
                                    ptRecordHistoryFrame.add(scrollPane);

                                    //ptRecord 지우는 버튼 구현 수정해야함
//                                    JButton deleteButton = new JButton("Delete Selected Record");
//                                    deleteButton.setPreferredSize(new Dimension(120,20));
//                                    deleteButton.addActionListener(new ActionListener() {
//                                        public void actionPerformed(ActionEvent e) {
//                                            int start = ptRecordTextArea.getSelectionStart();
//                                            int end = ptRecordTextArea.getSelectionEnd();
//
//                                            if (start != end) {
//                                                String selectedText = ptRecordTextArea.getSelectedText();
//                                                PTrecord selectedRecord = parsePTRecord(selectedText);
//
//                                                if (selectedRecord != null && member.getPtRecord().contains(selectedRecord)) {
//                                                    member.getPtRecord().remove(selectedRecord);
//                                                    ptRecordTextArea.setText("");
//                                                    for (PTrecord record : member.getPtRecord()) {
//                                                        ptRecordTextArea.append(record.toString() + "\n");
//                                                    }
//                                                    if (member.getPtRecord().isEmpty()) {
//                                                        ptRecordTextArea.setText("No PT Record History");
//                                                    }
//                                                }
//                                            }
//                                        }
//                                    });
//                                    ptRecordHistoryFrame.add(deleteButton);


                                    ptRecordHistoryFrame.setSize(300, 200);
                                    ptRecordHistoryFrame.setLocationRelativeTo(null); // Center the frame
                                    ptRecordHistoryFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                                    ptRecordHistoryFrame.setVisible(true);
                                }
                            }
                        });

                        editButton.addActionListener(new ActionListenerEditMember(member));

                        panel.add(nameLabel);
                        panel.add(addressLabel);
                        panel.add(emailLabel);
                        panel.add(phoneLabel);
                        panel.add(healthRecordButton);
                        panel.add(ptRecordButton);
                        panel.add(editButton);

                        panel.revalidate();
                        panel.repaint();
                        break;
                    }
                }
                break;
            }
        }
        if (!trainerFound) {
            JOptionPane.showMessageDialog(null, "Trainer not found");
        } else if (!memberFound) {
            JOptionPane.showMessageDialog(null, "Member not found");
        }
    }

    private boolean isValidNumberInput(String input) {
        try {
            Integer.parseInt(input);  // Assuming the input should be an integer, adjust as needed
            return true;
        } catch (NumberFormatException e) {
            return false;
        }

    }
    private PTrecord parsePTRecord(String text) {
        // Split the text and create a PTrecord object
        String[] parts = text.split("\\s+"); // Assuming space-separated values
        if (parts.length == 4) {
            String year = parts[0];
            String month = parts[1];
            String day = parts[2];
            String memo = parts[3];
            return new PTrecord(year, month, day, memo);
        } else {
            return null; // Return null if the format is not as expected
        }
    }

}