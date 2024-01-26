package vista;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;

public class Frm_Login extends javax.swing.JFrame {

    int xMouse, yMouse;

    public Frm_Login() {
        initComponents();
        TextPrompt user = new TextPrompt("Username", txt_Username);
        TextPrompt password = new TextPrompt("Password", pf_password);
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

        Main = new javax.swing.JPanel();
        btn_exit = new javax.swing.JLabel();
        img_user = new javax.swing.JLabel();
        sidebar = new javax.swing.JLabel();
        jl_password = new javax.swing.JLabel();
        jl_user1 = new javax.swing.JLabel();
        txt_Username = new javax.swing.JTextField();
        jl_singup = new javax.swing.JLabel();
        btn_signIn = new javax.swing.JButton();
        pf_password = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        Main.setBackground(new java.awt.Color(27, 27, 50));
        Main.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        Main.add(btn_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        img_user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/Resource/usuario.png"))); // NOI18N
        Main.add(img_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, -1, -1));

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
        Main.add(sidebar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 50));

        jl_password.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jl_password.setForeground(new java.awt.Color(245, 246, 247));
        jl_password.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_password.setText("Password: ");
        Main.add(jl_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        jl_user1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jl_user1.setForeground(new java.awt.Color(245, 246, 247));
        jl_user1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_user1.setText("Username: ");
        Main.add(jl_user1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        txt_Username.setBackground(new java.awt.Color(10, 10, 35));
        txt_Username.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txt_Username.setForeground(new java.awt.Color(245, 246, 247));
        txt_Username.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Username.setBorder(null);
        Main.add(txt_Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 260, 50));

        jl_singup.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jl_singup.setForeground(new java.awt.Color(245, 246, 247));
        jl_singup.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_singup.setText("Sing Up?");
        jl_singup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jl_singupMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jl_singupMouseExited(evt);
            }
        });
        Main.add(jl_singup, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 390, -1, -1));

        btn_signIn.setBackground(new java.awt.Color(59, 59, 79));
        btn_signIn.setForeground(new java.awt.Color(245, 246, 247));
        btn_signIn.setText("Sing In");
        btn_signIn.setBorder(null);
        Main.add(btn_signIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 414, 120, 40));

        pf_password.setBackground(new java.awt.Color(10, 10, 35));
        pf_password.setForeground(new java.awt.Color(245, 246, 247));
        pf_password.setBorder(null);
        Main.add(pf_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 260, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Main, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Main, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btn_exitMouseClicked

    private void sidebarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sidebarMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_sidebarMousePressed

    private void sidebarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sidebarMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_sidebarMouseDragged

    private void jl_singupMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_singupMouseEntered
        jl_singup.setForeground(new Color(44, 44, 94));
    }//GEN-LAST:event_jl_singupMouseEntered

    private void jl_singupMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_singupMouseExited
        jl_singup.setForeground(new Color(245, 246, 247));
    }//GEN-LAST:event_jl_singupMouseExited

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
            java.util.logging.Logger.getLogger(Frm_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Main;
    private javax.swing.JLabel btn_exit;
    public javax.swing.JButton btn_signIn;
    private javax.swing.JLabel img_user;
    private javax.swing.JLabel jl_password;
    public javax.swing.JLabel jl_singup;
    private javax.swing.JLabel jl_user1;
    public javax.swing.JPasswordField pf_password;
    private javax.swing.JLabel sidebar;
    public javax.swing.JTextField txt_Username;
    // End of variables declaration//GEN-END:variables
}
