/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vinay sawant
 */
public class admin_home extends javax.swing.JFrame {

    /**
     * Creates new form admin_home
     */
    public admin_home() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        adminsettings4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        adminsettings = new javax.swing.JButton();
        adminsettings1 = new javax.swing.JButton();
        adminsettings2 = new javax.swing.JButton();
        adminsettings3 = new javax.swing.JButton();
        adminsettings5 = new javax.swing.JButton();
        adminsettings6 = new javax.swing.JButton();
        adminsettings7 = new javax.swing.JButton();

        adminsettings4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        adminsettings4.setText("MODULE/ EXAM ASSIGNMENT");
        adminsettings4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminsettings4ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(255, 204, 204));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("GLORIUS");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ADMIN HOME");

        adminsettings.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        adminsettings.setText("ADMIN SETTINGS");
        adminsettings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminsettingsActionPerformed(evt);
            }
        });

        adminsettings1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        adminsettings1.setText("STUDENT DETAILS");
        adminsettings1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminsettings1ActionPerformed(evt);
            }
        });

        adminsettings2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        adminsettings2.setText("ATTENDANCE");
        adminsettings2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminsettings2ActionPerformed(evt);
            }
        });

        adminsettings3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        adminsettings3.setText("MODULE/ EXAM ASSIGNMENT");
        adminsettings3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminsettings3ActionPerformed(evt);
            }
        });

        adminsettings5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        adminsettings5.setText("REPORTS");
        adminsettings5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminsettings5ActionPerformed(evt);
            }
        });

        adminsettings6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        adminsettings6.setText("LOGOUT");
        adminsettings6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminsettings6ActionPerformed(evt);
            }
        });

        adminsettings7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        adminsettings7.setText("FEE PAYMENT");
        adminsettings7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminsettings7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(303, 303, 303)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(233, 258, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(adminsettings5, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adminsettings2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adminsettings, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(adminsettings1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(adminsettings3)
                        .addGap(170, 170, 170))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(adminsettings7, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(275, 275, 275)
                .addComponent(adminsettings6, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adminsettings, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adminsettings1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adminsettings2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adminsettings3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adminsettings5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adminsettings7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(adminsettings6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adminsettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminsettingsActionPerformed
        setVisible(false); new admin_settings().setVisible(true);
    }//GEN-LAST:event_adminsettingsActionPerformed

    private void adminsettings1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminsettings1ActionPerformed
        setVisible(false);new student_details().setVisible(true);
    }//GEN-LAST:event_adminsettings1ActionPerformed

    private void adminsettings2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminsettings2ActionPerformed
        setVisible(false);new student_teacher_attendance().setVisible(true);
    }//GEN-LAST:event_adminsettings2ActionPerformed

    private void adminsettings3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminsettings3ActionPerformed
         setVisible(false);new set_modules().setVisible(true);     
    }//GEN-LAST:event_adminsettings3ActionPerformed

    private void adminsettings4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminsettings4ActionPerformed
        
    }//GEN-LAST:event_adminsettings4ActionPerformed

    private void adminsettings5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminsettings5ActionPerformed
     setVisible(false);new reports().setVisible(true);       
    }//GEN-LAST:event_adminsettings5ActionPerformed

    private void adminsettings6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminsettings6ActionPerformed
         setVisible(false);new admin_login().setVisible(true);
    }//GEN-LAST:event_adminsettings6ActionPerformed

    private void adminsettings7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminsettings7ActionPerformed
         setVisible(false);new fees_payment().setVisible(true);        
    }//GEN-LAST:event_adminsettings7ActionPerformed

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
            java.util.logging.Logger.getLogger(admin_home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin_home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin_home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin_home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin_home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adminsettings;
    private javax.swing.JButton adminsettings1;
    private javax.swing.JButton adminsettings2;
    private javax.swing.JButton adminsettings3;
    private javax.swing.JButton adminsettings4;
    private javax.swing.JButton adminsettings5;
    private javax.swing.JButton adminsettings6;
    private javax.swing.JButton adminsettings7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
