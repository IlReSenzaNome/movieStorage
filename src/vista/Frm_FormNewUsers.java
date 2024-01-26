package vista;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;

public class Frm_FormNewUsers extends javax.swing.JFrame {
    
    int xMouse, yMouse;
    
    public Frm_FormNewUsers() {
        initComponents();
        TextPrompt name = new TextPrompt("Name: ", txt_name);
        TextPrompt lastname = new TextPrompt("LastName: ", txt_lastname);
        TextPrompt username = new TextPrompt("Username", txt_username);
        TextPrompt password = new TextPrompt("************", txt_passwordField);
        setIconImage(getIconImage());
    }

    @Override
    public Image getIconImage(){
        Image retvalue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Vista/Resource/icon.png"));
        return retvalue;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NewUsers = new javax.swing.JPanel();
        btn_exit = new javax.swing.JLabel();
        sidebar = new javax.swing.JLabel();
        lbl_Title = new javax.swing.JLabel();
        SubTitle_label = new javax.swing.JLabel();
        FirstName_Label = new javax.swing.JLabel();
        LastName_Label = new javax.swing.JLabel();
        txt_name = new javax.swing.JTextField();
        txt_lastname = new javax.swing.JTextField();
        lbl_password = new javax.swing.JLabel();
        txt_username = new javax.swing.JTextField();
        lbl_username = new javax.swing.JLabel();
        txt_passwordField = new javax.swing.JPasswordField();
        SectionSeparator1 = new javax.swing.JSeparator();
        Bio = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txta_biografi = new javax.swing.JTextArea();
        btn_Submit = new javax.swing.JButton();
        lbl_SingIn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

        NewUsers.setBackground(new java.awt.Color(27, 27, 50));
        NewUsers.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        NewUsers.add(btn_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 0, 50, 50));

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
        NewUsers.add(sidebar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 540, 50));

        lbl_Title.setFont(new java.awt.Font("JetBrains Mono NL", 0, 24)); // NOI18N
        lbl_Title.setForeground(new java.awt.Color(245, 246, 247));
        lbl_Title.setText("Registration Form");
        NewUsers.add(lbl_Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, -1, -1));

        SubTitle_label.setFont(new java.awt.Font("JetBrains Mono NL", 0, 18)); // NOI18N
        SubTitle_label.setForeground(new java.awt.Color(245, 246, 247));
        SubTitle_label.setText("Place fill out this form with the required information");
        SubTitle_label.setToolTipText("");
        NewUsers.add(SubTitle_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, 60));

        FirstName_Label.setFont(new java.awt.Font("JetBrains Mono NL", 0, 14)); // NOI18N
        FirstName_Label.setForeground(new java.awt.Color(245, 246, 247));
        FirstName_Label.setText("Enter Your First Name: ");
        NewUsers.add(FirstName_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        LastName_Label.setFont(new java.awt.Font("JetBrains Mono NL", 0, 14)); // NOI18N
        LastName_Label.setForeground(new java.awt.Color(245, 246, 247));
        LastName_Label.setText("Enter Your Last Name: ");
        NewUsers.add(LastName_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, -1, -1));

        txt_name.setBackground(new java.awt.Color(10, 10, 35));
        txt_name.setForeground(new java.awt.Color(245, 246, 247));
        txt_name.setBorder(null);
        NewUsers.add(txt_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 200, 30));

        txt_lastname.setBackground(new java.awt.Color(10, 10, 35));
        txt_lastname.setForeground(new java.awt.Color(245, 246, 247));
        txt_lastname.setBorder(null);
        NewUsers.add(txt_lastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 200, 30));

        lbl_password.setFont(new java.awt.Font("JetBrains Mono NL", 0, 14)); // NOI18N
        lbl_password.setForeground(new java.awt.Color(245, 246, 247));
        lbl_password.setText("Enter Your Password: ");
        NewUsers.add(lbl_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, -1, -1));

        txt_username.setBackground(new java.awt.Color(10, 10, 35));
        txt_username.setForeground(new java.awt.Color(245, 246, 247));
        txt_username.setBorder(null);
        NewUsers.add(txt_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 200, 30));

        lbl_username.setFont(new java.awt.Font("JetBrains Mono NL", 0, 14)); // NOI18N
        lbl_username.setForeground(new java.awt.Color(245, 246, 247));
        lbl_username.setText("Enter Your UserName: ");
        NewUsers.add(lbl_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        txt_passwordField.setBackground(new java.awt.Color(10, 10, 35));
        txt_passwordField.setForeground(new java.awt.Color(245, 246, 247));
        txt_passwordField.setBorder(null);
        NewUsers.add(txt_passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 200, 30));

        SectionSeparator1.setBackground(new java.awt.Color(59, 59, 79));
        SectionSeparator1.setForeground(new java.awt.Color(59, 59, 79));
        NewUsers.add(SectionSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 594, 14));

        Bio.setFont(new java.awt.Font("JetBrains Mono NL", 0, 14)); // NOI18N
        Bio.setForeground(new java.awt.Color(245, 246, 247));
        Bio.setText("Provide a bio:");
        NewUsers.add(Bio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        txta_biografi.setBackground(new java.awt.Color(10, 10, 35));
        txta_biografi.setColumns(20);
        txta_biografi.setForeground(new java.awt.Color(245, 246, 247));
        txta_biografi.setRows(5);
        jScrollPane1.setViewportView(txta_biografi);

        NewUsers.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 480, -1));

        btn_Submit.setBackground(new java.awt.Color(59, 59, 79));
        btn_Submit.setForeground(new java.awt.Color(245, 246, 247));
        btn_Submit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/Resource/disquete.png"))); // NOI18N
        btn_Submit.setText("Submit");
        btn_Submit.setBorder(null);
        NewUsers.add(btn_Submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 420, 170, 50));

        lbl_SingIn.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbl_SingIn.setForeground(new java.awt.Color(245, 246, 247));
        lbl_SingIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/Resource/flecha-izquierda (1).png"))); // NOI18N
        lbl_SingIn.setText("SingIn");
        lbl_SingIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_SingInMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_SingInMouseExited(evt);
            }
        });
        NewUsers.add(lbl_SingIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 80, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(NewUsers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(NewUsers, javax.swing.GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btn_exitMouseClicked

    private void btn_exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_exitMouseEntered
        btn_exit.setForeground(new Color(255, 0, 0));
    }//GEN-LAST:event_btn_exitMouseEntered

    private void btn_exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_exitMouseExited
        btn_exit.setForeground(new Color(245, 246, 247));
    }//GEN-LAST:event_btn_exitMouseExited

    private void sidebarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sidebarMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_sidebarMouseDragged

    private void sidebarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sidebarMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_sidebarMousePressed

    private void lbl_SingInMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_SingInMouseEntered
        lbl_SingIn.setForeground(new Color(44, 44, 94));
    }//GEN-LAST:event_lbl_SingInMouseEntered

    private void lbl_SingInMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_SingInMouseExited
        lbl_SingIn.setForeground(new Color(245, 246, 247));
    }//GEN-LAST:event_lbl_SingInMouseExited

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
            java.util.logging.Logger.getLogger(Frm_FormNewUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_FormNewUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_FormNewUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_FormNewUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_FormNewUsers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bio;
    private javax.swing.JLabel FirstName_Label;
    private javax.swing.JLabel LastName_Label;
    private javax.swing.JPanel NewUsers;
    private javax.swing.JSeparator SectionSeparator1;
    private javax.swing.JLabel SubTitle_label;
    public javax.swing.JButton btn_Submit;
    private javax.swing.JLabel btn_exit;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel lbl_SingIn;
    private javax.swing.JLabel lbl_Title;
    private javax.swing.JLabel lbl_password;
    private javax.swing.JLabel lbl_username;
    private javax.swing.JLabel sidebar;
    public javax.swing.JTextField txt_lastname;
    public javax.swing.JTextField txt_name;
    public javax.swing.JPasswordField txt_passwordField;
    public javax.swing.JTextField txt_username;
    public javax.swing.JTextArea txta_biografi;
    // End of variables declaration//GEN-END:variables
}
