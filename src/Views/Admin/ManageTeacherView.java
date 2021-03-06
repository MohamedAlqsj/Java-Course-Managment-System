/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views.Admin;

import Controller.Admin.ManageTeacherViewController;
import Model.User;
import Views.CreateUserView;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author BaDlUcK
 */
public class ManageTeacherView extends javax.swing.JFrame {

    User authUser;

    public JLabel getTeacherInfoJLabel() {
        return teacherInfoJLabel;
    }

    public void setTeacherInfoJLabel(JLabel teacherInfoJLabel) {
        this.teacherInfoJLabel = teacherInfoJLabel;
    }

    public JTextField getSearchTeacherNameJTextField() {
        return searchTeacherNameJTextField;
    }

    public void setSearchTeacherNameJTextField(JTextField searchTeacherNameJTextField) {
        this.searchTeacherNameJTextField = searchTeacherNameJTextField;
    }

    /**
     * Creates new form ManageTeacherView
     */
    ManageTeacherViewController manageTeacherViewController;

    public ManageTeacherView(User user) {
        initComponents();
        setLocationRelativeTo(null);

        this.authUser = user;
        manageTeacherViewController = new ManageTeacherViewController(this);
        manageTeacherViewController.initTable();
    }

    public JLabel getImageJLabel() {
        return imageJLabel;
    }

    public void setImageJLabel(JLabel imageJLabel) {
        this.imageJLabel = imageJLabel;
    }

    public JTable getTeachersJTable() {
        return teachersJTable;
    }

    public void setTeachersJTable(JTable teacherJTable) {
        this.teachersJTable = teacherJTable;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleJLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        teachersJTable = new javax.swing.JTable();
        imageJLabel = new javax.swing.JLabel();
        searchTeacherNameJTextField = new javax.swing.JTextField();
        searchJLabel = new javax.swing.JLabel();
        createUserJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        deleteJButton = new javax.swing.JButton();
        updateJButton = new javax.swing.JButton();
        teacherInfoJLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleJLabel.setFont(new java.awt.Font("Plantagenet Cherokee", 0, 24)); // NOI18N
        titleJLabel.setText("Manage Teacher ");

        teachersJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "Name", "Username", "Email", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        teachersJTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                teachersJTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(teachersJTable);
        if (teachersJTable.getColumnModel().getColumnCount() > 0) {
            teachersJTable.getColumnModel().getColumn(0).setMinWidth(0);
            teachersJTable.getColumnModel().getColumn(0).setMaxWidth(0);
            teachersJTable.getColumnModel().getColumn(1).setResizable(false);
            teachersJTable.getColumnModel().getColumn(2).setResizable(false);
            teachersJTable.getColumnModel().getColumn(4).setMinWidth(0);
            teachersJTable.getColumnModel().getColumn(4).setPreferredWidth(0);
            teachersJTable.getColumnModel().getColumn(4).setMaxWidth(0);
        }

        imageJLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        searchTeacherNameJTextField.setToolTipText("Enter the name of the teacher");
        searchTeacherNameJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTeacherNameJTextFieldActionPerformed(evt);
            }
        });
        searchTeacherNameJTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchTeacherNameJTextFieldKeyPressed(evt);
            }
        });

        searchJLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        searchJLabel.setText("Search :");

        createUserJButton.setText("Create");
        createUserJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createUserJButtonActionPerformed(evt);
            }
        });

        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        deleteJButton.setText("Delete");
        deleteJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteJButtonActionPerformed(evt);
            }
        });

        updateJButton.setText("Update");
        updateJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateJButtonActionPerformed(evt);
            }
        });

        teacherInfoJLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        teacherInfoJLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        teacherInfoJLabel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Teacher Info", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(titleJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(createUserJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(updateJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(deleteJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(33, 33, 33))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(teacherInfoJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(24, 24, 24))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(searchJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchTeacherNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(imageJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titleJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backJButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(searchJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchTeacherNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(imageJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(teacherInfoJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createUserJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void teachersJTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_teachersJTableMouseClicked
        // TODO add your handling code here:
        manageTeacherViewController.onClickAction();
    }//GEN-LAST:event_teachersJTableMouseClicked

    private void searchTeacherNameJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTeacherNameJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchTeacherNameJTextFieldActionPerformed

    private void searchTeacherNameJTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchTeacherNameJTextFieldKeyPressed
        // TODO add your handling code here:
        manageTeacherViewController.reset();
        manageTeacherViewController.keyPressedAction();
    }//GEN-LAST:event_searchTeacherNameJTextFieldKeyPressed

    private void createUserJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createUserJButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
        CreateUserView createUserView = new CreateUserView(authUser);
        createUserView.setFromView("teacher");
        createUserView.setVisible(true);
    }//GEN-LAST:event_createUserJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new HomeView(authUser).setVisible(true);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void updateJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateJButtonActionPerformed
        // TODO add your handling code here:
        User updateUser = manageTeacherViewController.updateButtonAction();
        if (updateUser != null) {
            this.dispose();
            new UpdateUserView(authUser, updateUser).setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Please select teacher");
        }

    }//GEN-LAST:event_updateJButtonActionPerformed

    private void deleteJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteJButtonActionPerformed
        // TODO add your handling code here:
        manageTeacherViewController.deleteButtonActtion();
        manageTeacherViewController.reset();
        manageTeacherViewController.initTable();
    }//GEN-LAST:event_deleteJButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ManageTeacherView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageTeacherView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageTeacherView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageTeacherView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new ManageTeacherView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton createUserJButton;
    private javax.swing.JButton deleteJButton;
    private javax.swing.JLabel imageJLabel;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel searchJLabel;
    private javax.swing.JTextField searchTeacherNameJTextField;
    private javax.swing.JLabel teacherInfoJLabel;
    private javax.swing.JTable teachersJTable;
    private javax.swing.JLabel titleJLabel;
    private javax.swing.JButton updateJButton;
    // End of variables declaration//GEN-END:variables
}
