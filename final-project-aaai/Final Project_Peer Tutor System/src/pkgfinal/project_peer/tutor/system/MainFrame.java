package pkgfinal.project_peer.tutor.system;

import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Me
 */
public class MainFrame extends javax.swing.JFrame {

    // create a system (system functionalities class) to keep track of info to display
    SystemFunctionalities system = new SystemFunctionalities();
    
    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        // make buttons invisible before correct values are selected
        tuteeConfirmButton.setVisible(false);
        tutorConfirmButton.setVisible(false);
        removeMatchButton.setVisible(false);
        MatchButtonT.setVisible(false);
        TutorInfoTutee.setVisible(false);
        RemoveTutor.setVisible(false);
        backToTuteeButton.setVisible(false);
        
        
        // get the info onto the screens
        refreshScreens();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane4 = new javax.swing.JScrollPane();
        mainTabbedPane = new javax.swing.JTabbedPane();
        mainPanel1 = new pkgfinal.project_peer.tutor.system.MainPanel();
        mainTitleLabel = new javax.swing.JLabel();
        tuteeListLabel = new javax.swing.JLabel();
        tutorListLabel = new javax.swing.JLabel();
        tuteeInstructionsLabel = new javax.swing.JLabel();
        tutorInstructionsLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tuteeList = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tutorList = new javax.swing.JList<>();
        seeMatchedButton = new javax.swing.JButton();
        tuteeConfirmButton = new javax.swing.JButton();
        tutorConfirmButton = new javax.swing.JButton();
        tutorPanel1 = new pkgfinal.project_peer.tutor.system.TutorPanel();
        jPanel1 = new javax.swing.JPanel();
        RemoveTutor = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        TutorNameTutorP = new javax.swing.JLabel();
        BackTutorPanel = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        ExtraInfoTutor = new javax.swing.JTextArea();
        backToTuteeButton = new javax.swing.JButton();
        tuteePanel1 = new pkgfinal.project_peer.tutor.system.TuteePanel();
        BackTuteeP = new javax.swing.JButton();
        MatchButtonT = new javax.swing.JButton();
        //get text
        TuteeInfo = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane7 = new javax.swing.JScrollPane();
        TuteeInfoExtra = new javax.swing.JTextArea();
        TutorInfoTutee = new javax.swing.JButton();
        matchedPanel1 = new pkgfinal.project_peer.tutor.system.MatchedPanel();
        matchedTitleLabel = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        matchedList = new javax.swing.JList<>();
        backButtonMatched = new javax.swing.JButton();
        removeMatchButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        mainTitleLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mainTitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mainTitleLabel.setText("Peer Tutor Management System");

        tuteeListLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tuteeListLabel.setText("Tutees");

        tutorListLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tutorListLabel.setText("Tutors");

        tuteeInstructionsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tuteeInstructionsLabel.setText("Click a tutee to match with a tutor");
        tuteeInstructionsLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        tutorInstructionsLabel.setText("Click a tutor to see more information/remove.");

        tuteeList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        tuteeList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                tuteeListValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(tuteeList);

        tutorList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        tutorList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                tutorListValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(tutorList);

        seeMatchedButton.setText("See Matched Students");
        seeMatchedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seeMatchedButtonActionPerformed(evt);
            }
        });

        tuteeConfirmButton.setText("jButton1");
        tuteeConfirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tuteeConfirmButtonActionPerformed(evt);
            }
        });

        tutorConfirmButton.setText("jButton1");
        tutorConfirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tutorConfirmButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanel1Layout = new javax.swing.GroupLayout(mainPanel1);
        mainPanel1.setLayout(mainPanel1Layout);
        mainPanel1Layout.setHorizontalGroup(
            mainPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainTitleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(mainPanel1Layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(tuteeListLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tutorListLabel)
                .addGap(119, 119, 119))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanel1Layout.createSequentialGroup()
                .addGroup(mainPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(tuteeInstructionsLabel))
                    .addGroup(mainPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(mainPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tuteeConfirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addGroup(mainPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tutorInstructionsLabel)
                    .addGroup(mainPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(mainPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(tutorConfirmButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(mainPanel1Layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(seeMatchedButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainPanel1Layout.setVerticalGroup(
            mainPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainTitleLabel)
                .addGap(18, 18, 18)
                .addGroup(mainPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tuteeListLabel)
                    .addComponent(tutorListLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tuteeInstructionsLabel)
                    .addComponent(tutorInstructionsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tutorConfirmButton)
                    .addComponent(tuteeConfirmButton))
                .addGap(27, 27, 27)
                .addComponent(seeMatchedButton)
                .addGap(30, 30, 30))
        );

        mainTabbedPane.addTab("Main", mainPanel1);

        RemoveTutor.setText("Remove Tutor");
        RemoveTutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveTutorActionPerformed(evt);
            }
        });

        TutorNameTutorP.setText(null);

        BackTutorPanel.setText("Back to Main Menu");
        BackTutorPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackTutorPanelActionPerformed(evt);
            }
        });

        ExtraInfoTutor.setEnabled(false);
        ExtraInfoTutor.setColumns(20);
        ExtraInfoTutor.setRows(5);
        jScrollPane5.setViewportView(ExtraInfoTutor);

        backToTuteeButton.setText("Back to Tutee");
        backToTuteeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backToTuteeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(TutorNameTutorP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(89, 89, 89))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(BackTutorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(backToTuteeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(RemoveTutor, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(TutorNameTutorP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                .addGap(70, 70, 70)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(backToTuteeButton, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(BackTutorPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(RemoveTutor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout tutorPanel1Layout = new javax.swing.GroupLayout(tutorPanel1);
        tutorPanel1.setLayout(tutorPanel1Layout);
        tutorPanel1Layout.setHorizontalGroup(
            tutorPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        tutorPanel1Layout.setVerticalGroup(
            tutorPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tutorPanel1Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        mainTabbedPane.addTab("Tutor", tutorPanel1);

        BackTuteeP.setText("Back");
        BackTuteeP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackTuteePActionPerformed(evt);
            }
        });

        MatchButtonT.setText("Match");
        MatchButtonT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MatchButtonTActionPerformed(evt);
            }
        });

        jList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList1ValueChanged(evt);
            }
        });
        jScrollPane6.setViewportView(jList1);

        TuteeInfoExtra.setEnabled(false);
        TuteeInfoExtra.setColumns(20);
        TuteeInfoExtra.setRows(5);
        jScrollPane7.setViewportView(TuteeInfoExtra);

        TutorInfoTutee.setText("Tutor Info");
        TutorInfoTutee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TutorInfoTuteeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tuteePanel1Layout = new javax.swing.GroupLayout(tuteePanel1);
        tuteePanel1.setLayout(tuteePanel1Layout);
        tuteePanel1Layout.setHorizontalGroup(
            tuteePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tuteePanel1Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(BackTuteeP, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(TutorInfoTutee)
                .addGap(55, 55, 55)
                .addComponent(MatchButtonT, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93))
            .addGroup(tuteePanel1Layout.createSequentialGroup()
                .addGroup(tuteePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tuteePanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(TuteeInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(tuteePanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        tuteePanel1Layout.setVerticalGroup(
            tuteePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tuteePanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(tuteePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(tuteePanel1Layout.createSequentialGroup()
                        .addComponent(TuteeInfo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane7)))
                .addGap(54, 54, 54)
                .addGroup(tuteePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BackTuteeP, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MatchButtonT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TutorInfoTutee))
                .addGap(26, 26, 26))
        );

        mainTabbedPane.addTab("Tutee", tuteePanel1);

        matchedTitleLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        matchedTitleLabel.setText("Matched Students");

        matchedList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        matchedList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                matchedListValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(matchedList);

        backButtonMatched.setText("Back to Main Menu");
        backButtonMatched.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonMatchedActionPerformed(evt);
            }
        });

        removeMatchButton.setText("Remove Match");
        removeMatchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeMatchButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout matchedPanel1Layout = new javax.swing.GroupLayout(matchedPanel1);
        matchedPanel1.setLayout(matchedPanel1Layout);
        matchedPanel1Layout.setHorizontalGroup(
            matchedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(matchedPanel1Layout.createSequentialGroup()
                .addGroup(matchedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(matchedPanel1Layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(matchedTitleLabel))
                    .addGroup(matchedPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(matchedPanel1Layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addGroup(matchedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(backButtonMatched, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(removeMatchButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        matchedPanel1Layout.setVerticalGroup(
            matchedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(matchedPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(matchedTitleLabel)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(removeMatchButton)
                .addGap(18, 18, 18)
                .addComponent(backButtonMatched)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        mainTabbedPane.addTab("Matched", matchedPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainTabbedPane)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainTabbedPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void seeMatchedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seeMatchedButtonActionPerformed
        // switch to matched tab
        mainTabbedPane.setSelectedIndex(3);
    }//GEN-LAST:event_seeMatchedButtonActionPerformed

    private void backButtonMatchedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonMatchedActionPerformed
        // switch to main tab
        mainTabbedPane.setSelectedIndex(0);
    }//GEN-LAST:event_backButtonMatchedActionPerformed

    private void tuteeListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_tuteeListValueChanged
        // make confirm button visible and change text for the selected tutee
        tuteeConfirmButton.setText("Match " + tuteeList.getSelectedValue());
        tuteeConfirmButton.setVisible(true);
        
                
    }//GEN-LAST:event_tuteeListValueChanged

    private void tuteeConfirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tuteeConfirmButtonActionPerformed
        // switch to the tutee tab
        mainTabbedPane.setSelectedIndex(2);
        //get selected value
        String Temp22= tuteeList.getSelectedValue();
        //set tutee info on tutee panel to selected value
        TuteeInfo.setText(Temp22);
        TuteeInfoExtra.setText(system.tuteeList.get(tuteeList.getSelectedIndex()).toString());
              
        // get the possible matches onto the tutee's list
        // turn the tutor list into an array of strings
        ArrayList<Tutor> pTutors = system.match(system.tuteeList.get(tuteeList.getSelectedIndex()));
        String[] possibleTutors = new String[pTutors.size()];
        for (int i = 0; i < pTutors.size(); i++) {
            possibleTutors[i] = pTutors.get(i).getFirstName() + " " + pTutors.get(i).getLastName();
        }
        // display possible tutors
        jList1.setListData(possibleTutors); 
        
        // reset the selection and make tutee screen buttons invisible to avoid errors
        tutorList.setSelectedIndex(-1);
        tuteeList.setSelectedIndex(-1);
        TutorInfoTutee.setVisible(false);
        MatchButtonT.setVisible(false);
        
        
    }//GEN-LAST:event_tuteeConfirmButtonActionPerformed

    private void tutorListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_tutorListValueChanged
        // make confirm button visible and change text for the selected tutor
        tutorConfirmButton.setText("View " + tutorList.getSelectedValue());
        tutorConfirmButton.setVisible(true);
        
    }//GEN-LAST:event_tutorListValueChanged

    private void tutorConfirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tutorConfirmButtonActionPerformed
        // if a tutor hasn't been selected
        if (tutorConfirmButton.getText().equals("View null") || tutorConfirmButton.getText().equals("Please select a tutor")) {
            // remind user to select a tutor
            tutorConfirmButton.setText("Please select a tutor");
        // otherwise carry out normal functions
        } else {
            // switch to the tutor tab
            mainTabbedPane.setSelectedIndex(1);
            // make remove tutor visible
            RemoveTutor.setVisible(true);

            // add the full info for the tutor onto the screen
            //get selected value
            String Temp11=tutorList.getSelectedValue();
            //set tutor info on tutor panel to selected value
            TutorNameTutorP.setText(Temp11);
            ExtraInfoTutor.setText(system.tutorList.get(tutorList.getSelectedIndex()).toString());

            // reset the selection and make tutor screen buttons invisible to avoid errors
            tutorList.setSelectedIndex(-1);
            tuteeList.setSelectedIndex(-1);
            backToTuteeButton.setVisible(false);
            
        }
       
        
    }//GEN-LAST:event_tutorConfirmButtonActionPerformed

    private void BackTutorPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackTutorPanelActionPerformed
        //switch to main tab
        mainTabbedPane.setSelectedIndex(0);
    }//GEN-LAST:event_BackTutorPanelActionPerformed

    private void BackTuteePActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackTuteePActionPerformed
        //switch to main tab
        mainTabbedPane.setSelectedIndex(0);
    }//GEN-LAST:event_BackTuteePActionPerformed

    private void MatchButtonTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MatchButtonTActionPerformed

        //call on matched list method and use correct vaaiables
        system.matchedList(jList1.getSelectedValue(),TuteeInfo.getText());
        
        // refresh the info on the screens
        refreshScreens();
        // switch back to the main screen
        mainTabbedPane.setSelectedIndex(0);
        // make the main screen match button invisible again
        tuteeConfirmButton.setVisible(false);        
        // make match button invisible again
        MatchButtonT.setVisible(false);
        
    }//GEN-LAST:event_MatchButtonTActionPerformed

    private void RemoveTutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveTutorActionPerformed
        
        //call on remove tutor method and use correct variables
        String[] tutorName = TutorNameTutorP.getText().split(" ");
        system.removeTutor(tutorName[0], tutorName[1]);
        
        // change the extra info to let the user know the tutor has been removed
        ExtraInfoTutor.setText("Tutor Removed");
        
        // refresh the info on the screens
        refreshScreens();
        // make the remove button invisible again        
        RemoveTutor.setVisible(false);
                
    }//GEN-LAST:event_RemoveTutorActionPerformed

    private void removeMatchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeMatchButtonActionPerformed
        // removes the selected matched students from the list
        String[] theMatch = matchedList.getSelectedValue().split(" ");
        String theTutor = theMatch[0] + " " + theMatch[1];
        String theTutee = theMatch[5] + " " + theMatch[6];
        system.removeMatched(theTutor, theTutee);
        
        // refresh the info on the screens
        refreshScreens();
        
        // make remove button invisible again
        removeMatchButton.setVisible(false);
    }//GEN-LAST:event_removeMatchButtonActionPerformed

    private void matchedListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_matchedListValueChanged
        // make remove button visible for the selected match
        removeMatchButton.setVisible(true);
    }//GEN-LAST:event_matchedListValueChanged

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        
    }//GEN-LAST:event_formWindowClosed

    private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList1ValueChanged
        // show the match and tutor info buttons
        MatchButtonT.setVisible(true);
        TutorInfoTutee.setVisible(true);
        
        String Temp22=jList1.getSelectedValue();
        //set tutor name on tutor panel to selected value
        TutorNameTutorP.setText(Temp22);
        //set extra info to info
        
        
        
    }//GEN-LAST:event_jList1ValueChanged

    private void TutorInfoTuteeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TutorInfoTuteeActionPerformed
        // switch to the tutor tab
        mainTabbedPane.setSelectedIndex(1);
        // make button to go back to tutee available
        backToTuteeButton.setVisible(true);
        // don't let user remove when just looking from tutee's list
        RemoveTutor.setVisible(false);
        
        //set extra info to info
        String[] theinfo = jList1.getSelectedValue().split(" ");
        String FnT = theinfo[0];
        String LnT = theinfo[1];
        ExtraInfoTutor.setText((system.searchTutor(FnT,LnT)).toString());
        
    }//GEN-LAST:event_TutorInfoTuteeActionPerformed

    private void backToTuteeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backToTuteeButtonActionPerformed
        // switch back to the tutee tab
        mainTabbedPane.setSelectedIndex(2);
        // set invisible again
        backToTuteeButton.setVisible(false);
    }//GEN-LAST:event_backToTuteeButtonActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // rewrite the files
        system.rewriteFiles();
    }//GEN-LAST:event_formWindowClosing

    
    private void refreshScreens() {
        // get the system tutee info onto the screen
        // turn the tutee list into an array of strings
        String[] tutees = new String[system.tuteeList.size()];
        for (int i = 0; i < system.tuteeList.size(); i++) {
            tutees[i] = system.tuteeList.get(i).getFirstName() + " " + system.tuteeList.get(i).getLastName();
        }
        // display tutees
        tuteeList.setListData(tutees);
        
        // get the system tutor info onto the screen
        // turn the tutor list into an array of strings
        String[] tutors = new String[system.tutorList.size()];
        for (int i = 0; i < system.tutorList.size(); i++) {
            tutors[i] = system.tutorList.get(i).getFirstName() + " " + system.tutorList.get(i).getLastName();
        }
        // display tutors
        tutorList.setListData(tutors);  
        
        // get the system matched students info onto the screen
        // turn the matched list into an array of strings
        String[] matched = new String[system.matchedList.size()];
        for (int i = 0; i < system.matchedList.size(); i++) {
            matched[i] = system.matchedList.get(i);
        }
        // display matches
        matchedList.setListData(matched);        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackTuteeP;
    private javax.swing.JButton BackTutorPanel;
    private javax.swing.JTextArea ExtraInfoTutor;
    private javax.swing.JButton MatchButtonT;
    private javax.swing.JButton RemoveTutor;
    public javax.swing.JLabel TuteeInfo;
    private javax.swing.JTextArea TuteeInfoExtra;
    private javax.swing.JButton TutorInfoTutee;
    private javax.swing.JLabel TutorNameTutorP;
    private javax.swing.JButton backButtonMatched;
    private javax.swing.JButton backToTuteeButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private pkgfinal.project_peer.tutor.system.MainPanel mainPanel1;
    private javax.swing.JTabbedPane mainTabbedPane;
    private javax.swing.JLabel mainTitleLabel;
    private javax.swing.JList<String> matchedList;
    private pkgfinal.project_peer.tutor.system.MatchedPanel matchedPanel1;
    private javax.swing.JLabel matchedTitleLabel;
    private javax.swing.JButton removeMatchButton;
    private javax.swing.JButton seeMatchedButton;
    private javax.swing.JButton tuteeConfirmButton;
    private javax.swing.JLabel tuteeInstructionsLabel;
    private javax.swing.JList<String> tuteeList;
    private javax.swing.JLabel tuteeListLabel;
    private pkgfinal.project_peer.tutor.system.TuteePanel tuteePanel1;
    private javax.swing.JButton tutorConfirmButton;
    private javax.swing.JLabel tutorInstructionsLabel;
    private javax.swing.JList<String> tutorList;
    private javax.swing.JLabel tutorListLabel;
    private pkgfinal.project_peer.tutor.system.TutorPanel tutorPanel1;
    // End of variables declaration//GEN-END:variables
}

