package app.ApplicationLogic;

import app.Data;
import app.Entity.HealthRecord;
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
    private JPanel mainPanel;
    private JPanel subPanel;
    private JPanel memberPanel;
    private JPanel buttonPanel;
    private JButton nextButton;
    private JButton previousButton;
    private JTextField memberField;
    private int memberIndex;
    private int ptIndex;
    public ActionListenerMemberSearch(JPanel panel, JTextField memberField){
        this.mainPanel = panel;
        this.memberField = memberField;
        this.memberIndex = 0;
        this.ptIndex = 0;
        subPanel = new JPanel();
        memberPanel = new JPanel();
        buttonPanel = new JPanel();
        subPanel.setLayout(new BorderLayout());
        subPanel.setBounds(0, 0, 800, 600);
        memberPanel.setLayout(new GridLayout(4,1));
        buttonPanel.setLayout(new GridLayout(1,2));
        nextButton = new JButton("다음");
        previousButton = new JButton("이전");
        buttonPanel.add(previousButton);
        buttonPanel.add(nextButton);
        nextButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                if(memberIndex + 4 >= Data.memberList.size()){
                    JOptionPane.showMessageDialog(null, "마지막 페이지입니다.");
                    return;
                }
                memberIndex += 4;
                updateMemberList();
            }
        });
        previousButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                if(memberIndex - 4 < 0){
                    JOptionPane.showMessageDialog(null, "첫 페이지입니다.");
                    return;
                }
                memberIndex -= 4;
                updateMemberList();
            }
        });
        updateMemberList();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(Data.memberList.size() == 0){
            JOptionPane.showMessageDialog(null, "등록된 회원이 없습니다.");
            return;
        }
        for(int i = 0; i< Data.memberList.size(); i++){
            Member member = Data.memberList.get(i);
            if(member.getName().equals(memberField.getText())){
                break;
            }
            if(i == Data.memberList.size() - 1){
                JOptionPane.showMessageDialog(null, "해당 이름의 회원이 없습니다.");
                return;
            }
        }
        mainPanel.removeAll();
        mainPanel.add(subPanel);
        subPanel.add(memberPanel, BorderLayout.CENTER);

        updateMemberList();

        subPanel.add(buttonPanel, BorderLayout.SOUTH);
        mainPanel.revalidate();
        mainPanel.repaint();
    }

    private void updateMemberList() {
        memberPanel.removeAll();
        String searchName = memberField.getText();
        boolean isFound = false;
        for(int i = memberIndex; i< memberIndex +4 && i<Data.memberList.size(); i++){
            Member member = Data.memberList.get(i);
            if(!member.getName().equals(searchName)){
                continue;
            }
            isFound = true;
            JPanel memberInfoLabel = new JPanel(new GridLayout(2, 1));
            JLabel memberLabel = new JLabel(member.toString());
            JPanel memberButtonPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
            JButton ptRecordButton = new JButton("PT 기록");
            JButton healthRecordButton = new JButton("건강 정보");
            JButton editButton = new JButton("회원 정보 수정");
            JButton deleteButton = new JButton("회원 삭제");
            JButton setTrainerButton = new JButton("트레이너 설정");

            memberButtonPanel.add(ptRecordButton);
            memberButtonPanel.add(healthRecordButton);
            memberButtonPanel.add(editButton);
            memberButtonPanel.add(deleteButton);

            healthRecordButton.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e) {
                    JDialog dialog = new JDialog();
                    JPanel healthRecordPanel = new JPanel();
                    JButton editButton = new JButton("수정");
                    healthRecordPanel.setLayout(new GridLayout(4, 1));
                    healthRecordPanel.add(new JLabel("키: " + member.getHealthRecord().getHeight()));
                    healthRecordPanel.add(new JLabel("몸무게: " + member.getHealthRecord().getWeight()));
                    healthRecordPanel.add(new JLabel("근육량: " + member.getHealthRecord().getMass()));
                    healthRecordPanel.add(new JLabel("지방량: " + member.getHealthRecord().getFat()));
                    healthRecordPanel.add(new JLabel("특이사항: " + member.getHealthRecord().getComments()));
                    dialog.add(healthRecordPanel, BorderLayout.CENTER);
                    dialog.add(editButton, BorderLayout.SOUTH);

                    editButton.addActionListener(new ActionListener(){
                        public void actionPerformed(ActionEvent e) {
                            JDialog editDialog = new JDialog();
                            JPanel editPanel = new JPanel();
                            editPanel.setLayout(new GridLayout(6, 2));
                            HealthRecord memberHealthRecord = member.getHealthRecord();
                            JTextField heightTextField = new JTextField(String.valueOf(memberHealthRecord.getHeight()));
                            JTextField weightTextField = new JTextField(String.valueOf(memberHealthRecord.getWeight()));
                            JTextField massTextField = new JTextField(String.valueOf(memberHealthRecord.getMass()));
                            JTextField fatTextField = new JTextField(String.valueOf(memberHealthRecord.getFat()));
                            JTextField commentTextField = new JTextField(memberHealthRecord.getComments());

                            JButton saveButton = new JButton("변경사항 저장");
                            saveButton.addActionListener(new ActionListener(){
                                public void actionPerformed(ActionEvent e) {
                                    String height = heightTextField.getText();
                                    String weight = weightTextField.getText();
                                    String mass = massTextField.getText();
                                    String fat = fatTextField.getText();
                                    String comment = commentTextField.getText();

                                    memberHealthRecord.setHeight(Double.parseDouble(height));
                                    memberHealthRecord.setWeight(Double.parseDouble(weight));
                                    memberHealthRecord.setMass(Double.parseDouble(mass));
                                    memberHealthRecord.setFat(Double.parseDouble(fat));
                                    memberHealthRecord.setComments(comment);
                                    editDialog.dispose();
                                }
                            });
                            editPanel.add(new JLabel("키: "));
                            editPanel.add(heightTextField);
                            editPanel.add(new JLabel("몸무게: "));
                            editPanel.add(weightTextField);
                            editPanel.add(new JLabel("근육량: "));
                            editPanel.add(massTextField);
                            editPanel.add(new JLabel("지방량: "));
                            editPanel.add(fatTextField);
                            editPanel.add(new JLabel("특이사항: "));
                            editPanel.add(commentTextField);
                            editPanel.add(saveButton);
                            editDialog.add(editPanel);
                            editDialog.setSize(300, 200);
                            editDialog.setVisible(true);
                        }
                    });
                    dialog.setSize(300, 200);
                    dialog.setVisible(true);

                }
            });
            ptRecordButton.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e) {
                    ArrayList<PTrecord> ptRecordList = member.getPtRecord();
                    ptIndex = 0;
                    if (ptRecordList.size() == 0) {
                        JDialog emptyListDialog = new JDialog();
                        JPanel emptyListPanel = new JPanel();
                        JButton addButton = new JButton("PT 기록 추가");

                        addButton.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                JDialog addRecordDialog = new JDialog();
                                JPanel addRecordPanel = new JPanel();
                                JTextField dateTextField = new JTextField(10);
                                JTextField memoTextField = new JTextField(20);
                                JButton saveButton = new JButton("추가");

                                saveButton.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        // Get the input values
                                        String date = dateTextField.getText();
                                        String memo = memoTextField.getText();

                                        String[] dateParts = date.split("/");
                                        if (dateParts.length != 3) {
                                            JOptionPane.showMessageDialog(null, "날짜는 반드시 년/월/일 형식을 따라야 합니다.");
                                            return;
                                        }
                                        String year = dateParts[0];
                                        String month = dateParts[1];
                                        String day = dateParts[2];

                                        PTrecord newRecord = new PTrecord(year, month, day, memo);
                                        ptRecordList.add(newRecord);
                                        addRecordDialog.dispose();
                                    }
                                });
                                addRecordPanel.add(new JLabel("날짜:"));
                                addRecordPanel.add(dateTextField);
                                addRecordPanel.add(new JLabel("특이사항:"));
                                addRecordPanel.add(memoTextField);
                                addRecordPanel.add(saveButton);

                                addRecordDialog.add(addRecordPanel);
                                addRecordDialog.setSize(300, 150);
                                addRecordDialog.setVisible(true);
                            }
                        });
                        emptyListPanel.add(new JLabel("PT 기록이 없습니다. 추가하시겠습니까?"));
                        emptyListPanel.add(addButton);
                        emptyListDialog.add(emptyListPanel);
                        emptyListDialog.setSize(300, 100);
                        emptyListDialog.setVisible(true);
                        return;
                    }
                    JDialog dialog = new JDialog();
                    JPanel ptRecordPanel = new JPanel();
                    JPanel ptRecordButtonPanel = new JPanel();
                    JLabel ptDateLabel = new JLabel(ptRecordList.get(ptIndex).getDate());
                    JLabel ptMemoLabel = new JLabel(ptRecordList.get(ptIndex).getMemo());
                    JButton nextButton = new JButton("다음");
                    JButton previousButton = new JButton("이전");
                    JButton addButton = new JButton("PT 기록 추가");
                    JButton editButton = new JButton("현재 기록 수정");

                    ptRecordPanel.setLayout(new BorderLayout());
                    ptRecordButtonPanel.setLayout(new GridLayout(1, 2));
                    nextButton.addActionListener(new ActionListener(){
                        public void actionPerformed(ActionEvent e) {
                            if(ptIndex + 1 >= ptRecordList.size()){
                                JOptionPane.showMessageDialog(null, "마지막 페이지입니다.");
                                return;
                            }
                            ptIndex += 1;
                            ptDateLabel.setText(ptRecordList.get(ptIndex).getDate());
                            ptMemoLabel.setText(ptRecordList.get(ptIndex).getMemo());
                        }
                    });
                    previousButton.addActionListener(new ActionListener(){
                        public void actionPerformed(ActionEvent e) {
                            if(ptIndex - 1 < 0){
                                JOptionPane.showMessageDialog(null, "첫 페이지입니다.");
                                return;
                            }
                            ptIndex -= 1;
                            ptDateLabel.setText(ptRecordList.get(ptIndex).toString());
                            ptMemoLabel.setText(ptRecordList.get(ptIndex).getMemo());
                        }
                    });
                    addButton.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            JPanel inputPanel = new JPanel(new GridLayout(4, 2)); // 4행 2열의 그리드 레이아웃으로 패널 생성

                            inputPanel.add(new JLabel("년도:"));
                            JTextField yearField = new JTextField();
                            inputPanel.add(yearField);

                            inputPanel.add(new JLabel("월:"));
                            JTextField monthField = new JTextField();
                            inputPanel.add(monthField);

                            inputPanel.add(new JLabel("일:"));
                            JTextField dayField = new JTextField();
                            inputPanel.add(dayField);

                            inputPanel.add(new JLabel("메모:"));
                            JTextField memoField = new JTextField();
                            inputPanel.add(memoField);

                            int result = JOptionPane.showConfirmDialog(null, inputPanel, "데이터 입력", JOptionPane.OK_CANCEL_OPTION);
                            if (result == JOptionPane.OK_OPTION) {
                                String newYear = yearField.getText();
                                String newMonth = monthField.getText();
                                String newDay = dayField.getText();
                                String newMemo = memoField.getText();

                                PTrecord newRecord = new PTrecord(newYear, newMonth, newDay, newMemo);
                                ptRecordList.add(newRecord);

                                ptIndex = ptRecordList.size() - 1;

                                ptDateLabel.setText(ptRecordList.get(ptIndex).getDate());
                                ptMemoLabel.setText(ptRecordList.get(ptIndex).getMemo());
                            }
                        }
                    });
                    editButton.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            if (ptIndex < 0 || ptIndex >= ptRecordList.size()) {
                                JOptionPane.showMessageDialog(null, "편집할 데이터가 없습니다.");
                                return;
                            }

                            JPanel inputPanel = new JPanel(new GridLayout(4, 2)); // 4행 2열의 그리드 레이아웃으로 패널 생성

                            PTrecord selectedRecord = ptRecordList.get(ptIndex);
                            JTextField yearField = new JTextField(selectedRecord.getYear());
                            JTextField monthField = new JTextField(selectedRecord.getMonth());
                            JTextField dayField = new JTextField(selectedRecord.getDay());
                            String memo = selectedRecord.getMemo().replace("특이사항: ", "");
                            JTextField memoField = new JTextField(memo);

                            inputPanel.add(new JLabel("년도:"));
                            inputPanel.add(yearField);

                            inputPanel.add(new JLabel("월:"));
                            inputPanel.add(monthField);

                            inputPanel.add(new JLabel("일:"));
                            inputPanel.add(dayField);

                            inputPanel.add(new JLabel("메모:"));
                            inputPanel.add(memoField);

                            int result = JOptionPane.showConfirmDialog(null, inputPanel, "데이터 편집", JOptionPane.OK_CANCEL_OPTION);
                            if (result == JOptionPane.OK_OPTION) {
                                String updatedYear = yearField.getText();
                                String updatedMonth = monthField.getText();
                                String updatedDay = dayField.getText();
                                String updatedMemo = memoField.getText();

                                PTrecord updatedRecord = new PTrecord(updatedYear, updatedMonth, updatedDay, updatedMemo);
                                ptRecordList.set(ptIndex, updatedRecord);

                                ptDateLabel.setText(ptRecordList.get(ptIndex).getDate());
                                ptMemoLabel.setText(ptRecordList.get(ptIndex).getMemo());
                            }
                        }
                    });
                    ptRecordButtonPanel.add(previousButton);
                    ptRecordButtonPanel.add(nextButton);
                    ptRecordButtonPanel.add(editButton);
                    ptRecordButtonPanel.add(addButton);
                    ptRecordPanel.add(ptDateLabel, BorderLayout.NORTH);
                    ptRecordPanel.add(ptMemoLabel, BorderLayout.CENTER);
                    ptRecordPanel.add(ptRecordButtonPanel, BorderLayout.SOUTH);
                    dialog.add(ptRecordPanel);
                    dialog.setSize(500, 200);
                    dialog.setVisible(true);
                }
            });
            deleteButton.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e) {
                    int result = JOptionPane.showConfirmDialog(null, "정말로 삭제하시겠습니까?", "Delete", JOptionPane.YES_NO_OPTION);
                    if(result == JOptionPane.YES_OPTION){
                        for(Trainer trainer: Data.trainerList){
                            if(trainer.getName().equals(member.getTrainerName())){
                                trainer.getMemberList().remove(member);
                                Data.memberList.remove(member);
                                JOptionPane.showMessageDialog(null, "삭제되었습니다.");
                                updateMemberList();
                                return;
                            }
                        }
                    }
                }
            });

            editButton.addActionListener(new ActionListenerEditMember(member));

            if(member.getTrainerName().equals("")){
                memberButtonPanel.add(setTrainerButton);
                setTrainerButton.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e) {
                        if(Data.trainerList.size() == 0){
                            JOptionPane.showMessageDialog(null, "등록된 트레이너가 없습니다.");
                            return;
                        }
                        String[] trainerNameList = new String[Data.trainerList.size()];
                        for(int i = 0; i<Data.trainerList.size(); i++){
                            trainerNameList[i] = Data.trainerList.get(i).getName();
                        }
                        String trainerName = (String) JOptionPane.showInputDialog(null, "트레이너를 선택하세요.", "Set Trainer", JOptionPane.QUESTION_MESSAGE, null, trainerNameList, trainerNameList[0]);
                        if(trainerName == null){
                            return;
                        }
                        for(Trainer trainer: Data.trainerList){
                            if(trainer.getName().equals(trainerName)){
                                trainer.getMemberList().add(member);
                                member.setTrainerName(trainerName);
                                JOptionPane.showMessageDialog(null, "트레이너가 설정되었습니다.");
                                updateMemberList();
                                return;
                            }
                        }
                    }
                });
            }

            memberInfoLabel.add(memberLabel);
            memberInfoLabel.add(memberButtonPanel);
            memberPanel.add(memberInfoLabel);
        }
        memberPanel.revalidate();
        memberPanel.repaint();
    }
}