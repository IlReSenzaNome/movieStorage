/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;

public class Frm_NotesFilms extends javax.swing.JFrame {

    int xMouse, yMouse;
    
    public Frm_NotesFilms() {
        initComponents();
        setIconImage(getIconImage());
        TextPrompt favorita = new TextPrompt("Favorita si/no", txt_favorita);
        TextPrompt comentario = new TextPrompt("Comentario", txta_comentario);
        TextPrompt calificacion = new TextPrompt("CAlificacion", txt_califica);
    }

     @Override
    public Image getIconImage() {
        Image retvalue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("vista/Resources/icon.png"));
        return retvalue;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        sidebar = new javax.swing.JLabel();
        lbl_dispose = new javax.swing.JLabel();
        btn_Cancel = new javax.swing.JButton();
        lbl_Title = new javax.swing.JLabel();
        lbl_Calificacion = new javax.swing.JLabel();
        txta_sinopsis = new javax.swing.JScrollPane();
        txta_biografi = new javax.swing.JTextArea();
        txta_sinopsis1 = new javax.swing.JScrollPane();
        txta_comentario = new javax.swing.JTextArea();
        txt_califica = new javax.swing.JTextField();
        txt_favorita = new javax.swing.JTextField();
        btn_Calificar = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();

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
        jPanel1.add(sidebar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 260, 50));

        lbl_dispose.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lbl_dispose.setForeground(new java.awt.Color(245, 246, 247));
        lbl_dispose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_dispose.setText("X");
        lbl_dispose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_dispose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_disposeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_disposeMouseExited(evt);
            }
        });
        jPanel1.add(lbl_dispose, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        btn_Cancel.setBackground(new java.awt.Color(59, 59, 79));
        btn_Cancel.setForeground(new java.awt.Color(245, 246, 247));
        btn_Cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/Resources/cancelar.png"))); // NOI18N
        btn_Cancel.setText("Cancel");
        btn_Cancel.setBorder(null);
        jPanel1.add(btn_Cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 90, 40));

        lbl_Title.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbl_Title.setForeground(new java.awt.Color(245, 246, 247));
        lbl_Title.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.add(lbl_Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 260, 30));

        lbl_Calificacion.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbl_Calificacion.setForeground(new java.awt.Color(245, 246, 247));
        lbl_Calificacion.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.add(lbl_Calificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 260, 30));

        txta_sinopsis.setBorder(null);
        txta_sinopsis.setAutoscrolls(true);

        txta_biografi.setEditable(false);
        txta_biografi.setBackground(new java.awt.Color(27, 27, 50));
        txta_biografi.setColumns(3);
        txta_biografi.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txta_biografi.setForeground(new java.awt.Color(245, 246, 247));
        txta_biografi.setLineWrap(true);
        txta_biografi.setRows(2);
        txta_biografi.setWrapStyleWord(true);
        txta_biografi.setBorder(new javax.swing.border.MatteBorder(null));
        txta_sinopsis.setViewportView(txta_biografi);

        jPanel1.add(txta_sinopsis, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 260, 80));

        txta_sinopsis1.setBorder(null);
        txta_sinopsis1.setAutoscrolls(true);

        txta_comentario.setBackground(new java.awt.Color(10, 10, 35));
        txta_comentario.setColumns(3);
        txta_comentario.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txta_comentario.setForeground(new java.awt.Color(245, 246, 247));
        txta_comentario.setLineWrap(true);
        txta_comentario.setRows(2);
        txta_comentario.setWrapStyleWord(true);
        txta_comentario.setBorder(null);
        txta_sinopsis1.setViewportView(txta_comentario);

        jPanel1.add(txta_sinopsis1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 170, 80));

        txt_califica.setBackground(new java.awt.Color(10, 10, 35));
        txt_califica.setForeground(new java.awt.Color(245, 246, 247));
        txt_califica.setBorder(null);
        jPanel1.add(txt_califica, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 170, 30));

        txt_favorita.setBackground(new java.awt.Color(10, 10, 35));
        txt_favorita.setForeground(new java.awt.Color(245, 246, 247));
        txt_favorita.setBorder(null);
        jPanel1.add(txt_favorita, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 170, 30));

        btn_Calificar.setBackground(new java.awt.Color(59, 59, 79));
        btn_Calificar.setForeground(new java.awt.Color(245, 246, 247));
        btn_Calificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/Resources/alta-calidad.png"))); // NOI18N
        btn_Calificar.setText("Calificar");
        btn_Calificar.setBorder(null);
        jPanel1.add(btn_Calificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, 90, 40));

        btn_update.setBackground(new java.awt.Color(59, 59, 79));
        btn_update.setForeground(new java.awt.Color(245, 246, 247));
        btn_update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/Resources/actualizar-flecha.png"))); // NOI18N
        btn_update.setText("Update");
        btn_update.setBorder(null);
        jPanel1.add(btn_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 90, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
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

    private void lbl_disposeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_disposeMouseEntered
        lbl_dispose.setForeground(new Color(255, 0, 0));
    }//GEN-LAST:event_lbl_disposeMouseEntered

    private void lbl_disposeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_disposeMouseExited
        lbl_dispose.setForeground(new Color(245, 246, 247));
    }//GEN-LAST:event_lbl_disposeMouseExited

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
            java.util.logging.Logger.getLogger(Frm_NotesFilms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_NotesFilms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_NotesFilms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_NotesFilms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_NotesFilms().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_Calificar;
    public javax.swing.JButton btn_Cancel;
    public javax.swing.JButton btn_update;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JLabel lbl_Calificacion;
    public javax.swing.JLabel lbl_Title;
    public javax.swing.JLabel lbl_dispose;
    private javax.swing.JLabel sidebar;
    public javax.swing.JTextField txt_califica;
    public javax.swing.JTextField txt_favorita;
    public javax.swing.JTextArea txta_biografi;
    public javax.swing.JTextArea txta_comentario;
    public javax.swing.JScrollPane txta_sinopsis;
    public javax.swing.JScrollPane txta_sinopsis1;
    // End of variables declaration//GEN-END:variables
}
