/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blood.bank.management.system;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author Bipon
 */
public class Delete_Donor extends javax.swing.JFrame {

    /**
     * Creates new form Delete_Donor
     */
    public Delete_Donor() {
        initComponents();
        Toolkit toolkit= getToolkit();
        Dimension size= toolkit.getScreenSize();
        setLocation(size.width/2-getWidth()/2,size.height/2- getHeight()/2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jTextField_search = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jTextField_n = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField_fn = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField_mn = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField_dob = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField_mob = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField_gender = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField_email = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField_bg = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextField_ct = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_add = new javax.swing.JTextArea();
        jSeparator3 = new javax.swing.JSeparator();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Algerian", 1, 45)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("delete DONOR DETAILS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 559, -1));

        jSeparator1.setForeground(new java.awt.Color(51, 51, 51));
        jSeparator1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 87, 1250, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("DONOR ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 110, 120, 39));

        jTextField_search.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        getContentPane().add(jTextField_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, 260, 39));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/search1.png"))); // NOI18N
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 110, -1, 39));

        jSeparator2.setForeground(new java.awt.Color(51, 51, 51));
        jSeparator2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 168, 1240, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Full Name");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 140, 30));

        jTextField_n.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jTextField_n.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_nActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField_n, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 260, 33));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Father Name");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 145, 30));

        jTextField_fn.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        getContentPane().add(jTextField_fn, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 260, 33));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Mother Name");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 145, 34));

        jTextField_mn.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        getContentPane().add(jTextField_mn, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, 260, 33));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Date Of Birth");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 145, 32));

        jTextField_dob.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        getContentPane().add(jTextField_dob, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 430, 260, 33));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Mobile No.");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 490, 145, 34));

        jTextField_mob.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        getContentPane().add(jTextField_mob, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 490, 260, 33));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Gender");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 550, 145, 34));

        jTextField_gender.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jTextField_gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_genderActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField_gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 550, 260, 33));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Email");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 240, 140, 32));

        jTextField_email.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jTextField_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_emailActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 240, 306, 33));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Blood Group");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 300, 140, 32));

        jTextField_bg.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jTextField_bg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_bgActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField_bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 300, 306, 33));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("City");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 360, 145, 32));

        jTextField_ct.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jTextField_ct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_ctActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField_ct, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 360, 306, 33));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Address");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 420, 145, 32));

        jTextArea_add.setColumns(20);
        jTextArea_add.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextArea_add.setRows(5);
        jScrollPane1.setViewportView(jTextArea_add);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 420, -1, 138));

        jSeparator3.setForeground(new java.awt.Color(51, 51, 51));
        jSeparator3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 683, 1240, -1));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/delete.png"))); // NOI18N
        jButton4.setText("Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 730, -1, 47));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Update details.png"))); // NOI18N
        jButton3.setText("Reset");
        jButton3.setActionCommand("Save");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 730, 120, 47));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Exit application.png"))); // NOI18N
        jButton2.setText("Close");
        jButton2.setActionCommand("Save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 730, -1, 47));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ALL BG.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1250, 810));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField_nActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_nActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_nActionPerformed

    private void jTextField_genderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_genderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_genderActionPerformed

    private void jTextField_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_emailActionPerformed

    private void jTextField_bgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_bgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_bgActionPerformed

    private void jTextField_ctActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_ctActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_ctActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        setVisible(false);
        new Dashboard().setVisible(true);       
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Delete_Donor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Delete_Donor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Delete_Donor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Delete_Donor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Delete_Donor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextArea jTextArea_add;
    private javax.swing.JTextField jTextField_bg;
    private javax.swing.JTextField jTextField_ct;
    private javax.swing.JTextField jTextField_dob;
    private javax.swing.JTextField jTextField_email;
    private javax.swing.JTextField jTextField_fn;
    private javax.swing.JTextField jTextField_gender;
    private javax.swing.JTextField jTextField_mn;
    private javax.swing.JTextField jTextField_mob;
    private javax.swing.JTextField jTextField_n;
    private javax.swing.JTextField jTextField_search;
    // End of variables declaration//GEN-END:variables
}
