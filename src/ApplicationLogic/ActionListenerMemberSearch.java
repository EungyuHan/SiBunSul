package app.ApplicationLogic;

import app.Entity.Member;
import app.Entity.PTrecord;
import app.Entity.Trainer;

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
                                JDialog healthRecordDialog = new JDialog();
                                healthRecordDialog.setTitle("Health Record");
                                JLabel titleLabel = new JLabel("Health Record");
                                titleLabel.setHorizontalAlignment(SwingConstants.CENTER);

                                JPanel healthPanel = new JPanel(new GridLayout(5, 2));
                                healthPanel.add(new JLabel("Height: "));
                                healthPanel.add(new JLabel(String.valueOf(member.getHealthRecord().getHeight())));
                                healthPanel.add(new JLabel("Weight: "));
                                healthPanel.add(new JLabel(String.valueOf(member.getHealthRecord().getWeight())));
                                healthPanel.add(new JLabel("Mass: "));
                                healthPanel.add(new JLabel(String.valueOf(member.getHealthRecord().getMass())));
                                healthPanel.add(new JLabel("Fat: "));
                                healthPanel.add(new JLabel(String.valueOf(member.getHealthRecord().getFat())));
                                healthPanel.add(new JLabel("Comments: "));
                                healthPanel.add(new JLabel(member.getHealthRecord().getComments()));
                                healthRecordDialog.add(healthPanel, BorderLayout.CENTER);

                                JButton editHealthButton = new JButton("Edit Health Record");
                                healthRecordDialog.add(editHealthButton, BorderLayout.SOUTH);
                                editHealthButton.addActionListener(new ActionListener() {
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

                                healthRecordDialog.add(titleLabel, BorderLayout.NORTH);
                                healthRecordDialog.setSize(300, 300);
                                healthRecordDialog.setLocationRelativeTo(null);
                                healthRecordDialog.setVisible(true);
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

                                    JFrame ptRecordHistoryFrame = new JFrame("PT Record History");

                                    JTextArea ptRecordTextArea = new JTextArea();
                                    ptRecordTextArea.setEditable(false);

                                    for (PTrecord record : member.getPtRecord()) {
                                        ptRecordTextArea.append(record.toString() + "\n");
                                    }

                                    if (member.getPtRecord().isEmpty()) {
                                        ptRecordTextArea.setText("No PT Record History");
                                    }

                                    JScrollPane scrollPane = new JScrollPane(ptRecordTextArea);



                                    JButton deleteButton = new JButton("Delete");
                                    deleteButton.addActionListener(new ActionListener() {
                                        @Override
                                        public void actionPerformed(ActionEvent e) {
                                            if (member.getPtRecord().isEmpty()) {
                                                JOptionPane.showMessageDialog(ptRecordHistoryFrame, "No PT Records to delete.");
                                                return;
                                            }

                                            Object[] ptRecordOptions = member.getPtRecord().toArray();

                                            Object selectedOption = JOptionPane.showInputDialog(ptRecordHistoryFrame, "Select a PT Record to delete:",
                                                    "Delete PT Record", JOptionPane.QUESTION_MESSAGE, null, ptRecordOptions, ptRecordOptions[0]);

                                            if (selectedOption != null) {
                                                PTrecord selectedRecord = (PTrecord) selectedOption;

                                                member.getPtRecord().remove(selectedRecord);

                                                ptRecordTextArea.setText("");
                                                for (PTrecord record : member.getPtRecord()) {
                                                    ptRecordTextArea.append(record.toString() + "\n");
                                                }

                                                if (member.getPtRecord().isEmpty()) {
                                                    ptRecordTextArea.setText("No PT Record History");
                                                }
                                            }
                                        }
                                    });
                                    ptRecordHistoryFrame.add(scrollPane);
                                    ptRecordHistoryFrame.add(deleteButton);

                                    ptRecordHistoryFrame.setLayout(new BorderLayout());
                                    ptRecordHistoryFrame.add(scrollPane, BorderLayout.CENTER);

                                    JPanel buttonPanel = new JPanel(new BorderLayout());
                                    buttonPanel.add(deleteButton, BorderLayout.SOUTH);

                                    ptRecordHistoryFrame.add(buttonPanel, BorderLayout.SOUTH);

                                    ptRecordHistoryFrame.setSize(500, 300);
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