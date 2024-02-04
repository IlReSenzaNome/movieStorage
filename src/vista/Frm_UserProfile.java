package vista;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;

public class Frm_UserProfile extends javax.swing.JFrame {

    int xMouse, yMouse;
    
    public Frm_UserProfile() {
        initComponents();
        setIconImage(getIconImage());
    }

    @Override
    public Image getIconImage(){
        Image retvalue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("vista/Resources/icon.png"));
        return retvalue;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        sidebar = new javax.swing.JLabel();
        btn_exit = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lbl_home = new javax.swing.JLabel();
        lbl_username = new javax.swing.JLabel();
        lbl_password = new javax.swing.JLabel();
        lbl_name = new javax.swing.JLabel();
        lbl_lastname = new javax.swing.JLabel();
        btn_updateDate = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txta_biografi = new javax.swing.JTextArea();
        txt_name = new javax.swing.JTextField();
        txt_lastaname = new javax.swing.JTextField();
        txt_username = new javax.swing.JTextField();
        btn_update = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txta_ubiografi = new javax.swing.JTextArea();
        pf_pasword = new javax.swing.JPasswordField();
        btn_cancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(27, 27, 50));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sidebar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                sidebarMouseDragged(evt);
            }
        });
        sidebar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                sidebarMousePressed(evt);
            }
        });
        jPanel1.add(sidebar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 50));

        btn_exit.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btn_exit.setForeground(new java.awt.Color(245, 246, 247));
        btn_exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_exit.setText("X");
        btn_exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_exitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_exitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_exitMouseExited(evt);
            }
        });
        jPanel1.add(btn_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 50, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/Resources/usuario.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        lbl_home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/Resources/casa.png"))); // NOI18N
        lbl_home.setToolTipText("Home");
        lbl_home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(lbl_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 60, 70));

        lbl_username.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbl_username.setForeground(new java.awt.Color(245, 246, 247));
        lbl_username.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.add(lbl_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 180, 20));

        lbl_password.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbl_password.setForeground(new java.awt.Color(245, 246, 247));
        lbl_password.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.add(lbl_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 180, 30));

        lbl_name.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbl_name.setForeground(new java.awt.Color(245, 246, 247));
        lbl_name.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.add(lbl_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 180, 20));

        lbl_lastname.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbl_lastname.setForeground(new java.awt.Color(245, 246, 247));
        lbl_lastname.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.add(lbl_lastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 180, 20));

        btn_updateDate.setBackground(new java.awt.Color(59, 59, 79));
        btn_updateDate.setForeground(new java.awt.Color(245, 246, 247));
        btn_updateDate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/Resources/actualizar-flecha.png"))); // NOI18N
        btn_updateDate.setText("Update Data");
        btn_updateDate.setBorder(null);
        jPanel1.add(btn_updateDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 110, 40));

        jScrollPane1.setBorder(null);
        jScrollPane1.setAutoscrolls(true);

        txta_biografi.setEditable(false);
        txta_biografi.setBackground(new java.awt.Color(27, 27, 50));
        txta_biografi.setColumns(3);
        txta_biografi.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txta_biografi.setForeground(new java.awt.Color(245, 246, 247));
        txta_biografi.setLineWrap(true);
        txta_biografi.setRows(2);
        txta_biografi.setWrapStyleWord(true);
        txta_biografi.setBorder(new javax.swing.border.MatteBorder(null));
        jScrollPane1.setViewportView(txta_biografi);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 180, 50));

        txt_name.setBackground(new java.awt.Color(10, 10, 35));
        txt_name.setForeground(new java.awt.Color(245, 246, 247));
        txt_name.setBorder(null);
        jPanel1.add(txt_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 100, 20));

        txt_lastaname.setBackground(new java.awt.Color(10, 10, 35));
        txt_lastaname.setForeground(new java.awt.Color(245, 246, 247));
        txt_lastaname.setBorder(null);
        jPanel1.add(txt_lastaname, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 100, 20));

        txt_username.setBackground(new java.awt.Color(10, 10, 35));
        txt_username.setForeground(new java.awt.Color(245, 246, 247));
        txt_username.setBorder(null);
        jPanel1.add(txt_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, 100, 20));

        btn_update.setBackground(new java.awt.Color(59, 59, 79));
        btn_update.setForeground(new java.awt.Color(245, 246, 247));
        btn_update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/Resources/actualizar-flecha.png"))); // NOI18N
        btn_update.setText("Update");
        btn_update.setBorder(null);
        jPanel1.add(btn_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 260, 100, 40));

        jScrollPane2.setBackground(new java.awt.Color(10, 10, 35));
        jScrollPane2.setBorder(null);

        txta_ubiografi.setBackground(new java.awt.Color(10, 10, 35));
        txta_ubiografi.setColumns(3);
        txta_ubiografi.setForeground(new java.awt.Color(245, 246, 247));
        txta_ubiografi.setLineWrap(true);
        txta_ubiografi.setRows(3);
        txta_ubiografi.setWrapStyleWord(true);
        jScrollPane2.setViewportView(txta_ubiografi);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, 100, 50));

        pf_pasword.setBackground(new java.awt.Color(10, 10, 35));
        pf_pasword.setForeground(new java.awt.Color(245, 246, 247));
        pf_pasword.setBorder(null);
        jPanel1.add(pf_pasword, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, 100, 30));

        btn_cancel.setBackground(new java.awt.Color(59, 59, 79));
        btn_cancel.setForeground(new java.awt.Color(245, 246, 247));
        btn_cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/Resources/cancelar.png"))); // NOI18N
        btn_cancel.setText("Cancel");
        btn_cancel.setBorder(null);
        jPanel1.add(btn_cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 100, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sidebarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sidebarMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_sidebarMouseDragged

    private void sidebarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sidebarMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_sidebarMousePressed

    private void btn_exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btn_exitMouseClicked

    private void btn_exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_exitMouseEntered
        btn_exit.setForeground(new Color(255, 0, 0));
    }//GEN-LAST:event_btn_exitMouseEntered

    private void btn_exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_exitMouseExited
        btn_exit.setForeground(new Color(245, 246, 247));
    }//GEN-LAST:event_btn_exitMouseExited

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
            java.util.logging.Logger.getLogger(Frm_UserProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_UserProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_UserProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_UserProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_UserProfile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_cancel;
    private javax.swing.JLabel btn_exit;
    public javax.swing.JButton btn_update;
    public javax.swing.JButton btn_updateDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JLabel lbl_home;
    public javax.swing.JLabel lbl_lastname;
    public javax.swing.JLabel lbl_name;
    public javax.swing.JLabel lbl_password;
    public javax.swing.JLabel lbl_username;
    public javax.swing.JPasswordField pf_pasword;
    private javax.swing.JLabel sidebar;
    public javax.swing.JTextField txt_lastaname;
    public javax.swing.JTextField txt_name;
    public javax.swing.JTextField txt_username;
    public javax.swing.JTextArea txta_biografi;
    public javax.swing.JTextArea txta_ubiografi;
    // End of variables declaration//GEN-END:variables
}
