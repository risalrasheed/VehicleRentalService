/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiclerentalservice;

import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

/**
 *
 * @author rr1
 */
public class AdminDashboard extends javax.swing.JFrame {

    /**
     * Creates new form AdminDashboard
     * @param username
     */
    public AdminDashboard(String username) {
        
        initComponents();
        this.username = username;
        Border emptyBorder = BorderFactory.createEmptyBorder();
        //Button remove border
        btn_profileicon.setBorder(emptyBorder);
        btn_messageicon.setBorder(emptyBorder);
        btn_calendaricon.setBorder(emptyBorder);
        btn_passwordicon.setBorder(emptyBorder);
        btn_caricon.setBorder(emptyBorder);
        btn_usersicon.setBorder(emptyBorder);
        btn_adminicon.setBorder(emptyBorder);
        btn_bookingsicon.setBorder(emptyBorder);
     

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_vehiclerentalservice = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btn_profileicon = new javax.swing.JButton();
        btn_messageicon = new javax.swing.JButton();
        btn_calendaricon = new javax.swing.JButton();
        btn_passwordicon = new javax.swing.JButton();
        btn_caricon = new javax.swing.JButton();
        btn_adminicon = new javax.swing.JButton();
        btn_usersicon = new javax.swing.JButton();
        btn_bookingsicon = new javax.swing.JButton();
        btn_logout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(123, 104, 238));

        lbl_vehiclerentalservice.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lbl_vehiclerentalservice.setForeground(new java.awt.Color(255, 255, 255));
        lbl_vehiclerentalservice.setText("VEHICLE RENTAL SERVICE");

        jPanel2.setBackground(new java.awt.Color(72, 61, 139));

        btn_profileicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vehiclerentalservice/admin_images/profile-icon-color3.jpg"))); // NOI18N
        btn_profileicon.setBorderPainted(false);
        btn_profileicon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_profileiconMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_profileiconMouseExited(evt);
            }
        });
        btn_profileicon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_profileiconActionPerformed(evt);
            }
        });

        btn_messageicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vehiclerentalservice/admin_images/message-icon-color3.jpg"))); // NOI18N
        btn_messageicon.setBorderPainted(false);
        btn_messageicon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_messageiconMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_messageiconMouseExited(evt);
            }
        });

        btn_calendaricon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vehiclerentalservice/admin_images/calendar-icon-color3.jpg"))); // NOI18N
        btn_calendaricon.setBorderPainted(false);
        btn_calendaricon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_calendariconMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_calendariconMouseExited(evt);
            }
        });

        btn_passwordicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vehiclerentalservice/admin_images/password-icon-color3.jpg"))); // NOI18N
        btn_passwordicon.setBorderPainted(false);
        btn_passwordicon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_passwordiconMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_passwordiconMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_passwordicon)
                    .addComponent(btn_messageicon)
                    .addComponent(btn_profileicon)
                    .addComponent(btn_calendaricon))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(btn_profileicon)
                .addGap(18, 18, 18)
                .addComponent(btn_messageicon)
                .addGap(18, 18, 18)
                .addComponent(btn_calendaricon)
                .addGap(18, 18, 18)
                .addComponent(btn_passwordicon)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_caricon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vehiclerentalservice/admin_images/car-icon-color1.jpg"))); // NOI18N
        btn_caricon.setBorderPainted(false);
        btn_caricon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_cariconMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_cariconMouseExited(evt);
            }
        });

        btn_adminicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vehiclerentalservice/admin_images/admin-icon-color1.jpg"))); // NOI18N
        btn_adminicon.setBorderPainted(false);
        btn_adminicon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_adminiconMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_adminiconMouseExited(evt);
            }
        });

        btn_usersicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vehiclerentalservice/admin_images/users-icon-color1.jpg"))); // NOI18N
        btn_usersicon.setBorderPainted(false);
        btn_usersicon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_usersiconMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_usersiconMouseExited(evt);
            }
        });

        btn_bookingsicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vehiclerentalservice/admin_images/bookings-icon-color1.jpg"))); // NOI18N
        btn_bookingsicon.setBorderPainted(false);
        btn_bookingsicon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_bookingsiconMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_bookingsiconMouseExited(evt);
            }
        });

        btn_logout.setBackground(new java.awt.Color(123, 104, 238));
        btn_logout.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_logout.setForeground(new java.awt.Color(255, 255, 255));
        btn_logout.setText("LOGOUT");
        btn_logout.setBorderPainted(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_adminicon)
                            .addComponent(btn_caricon))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_usersicon)
                        .addGap(69, 69, 69))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_bookingsicon)
                                .addGap(51, 51, 51))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_logout)
                                .addGap(74, 74, 74))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbl_vehiclerentalservice)
                                .addGap(80, 80, 80))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lbl_vehiclerentalservice)
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_usersicon)
                    .addComponent(btn_caricon))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_adminicon)
                    .addComponent(btn_bookingsicon))
                .addGap(59, 59, 59)
                .addComponent(btn_logout)
                .addGap(321, 321, 321))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 594, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_profileiconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_profileiconActionPerformed
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(AdminViewProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminViewProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminViewProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminViewProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminViewProfile(username).setVisible(true);
            }
        });
    }//GEN-LAST:event_btn_profileiconActionPerformed

    private void btn_profileiconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_profileiconMouseEntered
        // TODO add your handling code here:
        try {
           btn_profileicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vehiclerentalservice/admin_images/profile-icon-color2.jpg"))); 
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null,"Error. Contact admin.");
        }
        
    }//GEN-LAST:event_btn_profileiconMouseEntered

    private void btn_profileiconMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_profileiconMouseExited
        // TODO add your handling code here:
        try {
            btn_profileicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vehiclerentalservice/admin_images/profile-icon-color3.jpg")));
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null,"Error. Contact admin.");
        }
        
    }//GEN-LAST:event_btn_profileiconMouseExited

    private void btn_messageiconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_messageiconMouseEntered
        // TODO add your handling code here:
        try {
            btn_messageicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vehiclerentalservice/admin_images/message-icon-color2.jpg")));
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null,"Error. Contact admin.");
        }
        
    }//GEN-LAST:event_btn_messageiconMouseEntered

    private void btn_messageiconMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_messageiconMouseExited
        // TODO add your handling code here:
        try {
            btn_messageicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vehiclerentalservice/admin_images/message-icon-color3.jpg")));
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null,"Error. Contact admin.");
        }
        
    }//GEN-LAST:event_btn_messageiconMouseExited

    private void btn_calendariconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_calendariconMouseEntered
        // TODO add your handling code here:
        try {
            btn_calendaricon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vehiclerentalservice/admin_images/calendar-icon-color2.jpg")));
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null,"Error. Contact admin.");
        }
        
    }//GEN-LAST:event_btn_calendariconMouseEntered

    private void btn_calendariconMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_calendariconMouseExited
        // TODO add your handling code here:
        try {
            btn_calendaricon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vehiclerentalservice/admin_images/calendar-icon-color3.jpg")));
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null,"Error. Contact admin.");
        }
        
    }//GEN-LAST:event_btn_calendariconMouseExited

    private void btn_passwordiconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_passwordiconMouseEntered
        // TODO add your handling code here:
        try {
            btn_passwordicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vehiclerentalservice/admin_images/password-icon-color2.jpg")));
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null,"Error. Contact admin.");
        }
        
    }//GEN-LAST:event_btn_passwordiconMouseEntered

    private void btn_passwordiconMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_passwordiconMouseExited
        // TODO add your handling code here:
        try {
            btn_passwordicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vehiclerentalservice/admin_images/password-icon-color3.jpg")));
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null,"Error. Contact admin.");
        }
        
    }//GEN-LAST:event_btn_passwordiconMouseExited

    private void btn_cariconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cariconMouseEntered
        // TODO add your handling code here:
        try {
            btn_caricon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vehiclerentalservice/admin_images/car-icon-color2.jpg")));
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null,"Error. Contact admin.");
        }
        
    }//GEN-LAST:event_btn_cariconMouseEntered

    private void btn_cariconMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cariconMouseExited
        // TODO add your handling code here:
        try {
            btn_caricon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vehiclerentalservice/admin_images/car-icon-color1.jpg")));
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null,"Error. Contact admin.");
        }
        
    }//GEN-LAST:event_btn_cariconMouseExited

    private void btn_usersiconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_usersiconMouseEntered
        // TODO add your handling code here:
        try {
            btn_usersicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vehiclerentalservice/admin_images/users-icon-color2.jpg")));
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null,"Error. Contact admin.");
        }
        
    }//GEN-LAST:event_btn_usersiconMouseEntered

    private void btn_usersiconMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_usersiconMouseExited
        // TODO add your handling code here:
        try {
            btn_usersicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vehiclerentalservice/admin_images/users-icon-color1.jpg")));
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null,"Error. Contact admin.");
        }
        
    }//GEN-LAST:event_btn_usersiconMouseExited

    private void btn_adminiconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_adminiconMouseEntered
        // TODO add your handling code here:
        try {
            btn_adminicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vehiclerentalservice/admin_images/admin-icon-color2.jpg")));
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null,"Error. Contact admin.");
        }
        
    }//GEN-LAST:event_btn_adminiconMouseEntered

    private void btn_adminiconMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_adminiconMouseExited
        // TODO add your handling code here:
        try {
            btn_adminicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vehiclerentalservice/admin_images/admin-icon-color1.jpg")));
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null,"Error. Contact admin.");
        }
        
    }//GEN-LAST:event_btn_adminiconMouseExited

    private void btn_bookingsiconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_bookingsiconMouseEntered
        // TODO add your handling code here:
        try {
            btn_bookingsicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vehiclerentalservice/admin_images/bookings-icon-color2.jpg")));
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null,"Error. Contact admin.");
        }
        
    }//GEN-LAST:event_btn_bookingsiconMouseEntered

    private void btn_bookingsiconMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_bookingsiconMouseExited
        // TODO add your handling code here:
        try {
            btn_bookingsicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vehiclerentalservice/admin_images/bookings-icon-color1.jpg")));
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null,"Error. Contact admin.");
        }
        
    }//GEN-LAST:event_btn_bookingsiconMouseExited

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
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminDashboard("user1").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_adminicon;
    private javax.swing.JButton btn_bookingsicon;
    private javax.swing.JButton btn_calendaricon;
    private javax.swing.JButton btn_caricon;
    private javax.swing.JButton btn_logout;
    private javax.swing.JButton btn_messageicon;
    private javax.swing.JButton btn_passwordicon;
    private javax.swing.JButton btn_profileicon;
    private javax.swing.JButton btn_usersicon;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_vehiclerentalservice;
    // End of variables declaration//GEN-END:variables
    private String username;
}
