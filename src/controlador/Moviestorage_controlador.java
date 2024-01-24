package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import javax.swing.JOptionPane;
import modelo.ConsultasMoviestorage;
import vista.Frm_Login;

public class Moviestorage_controlador implements ActionListener {

    private Frm_Login frm_login;
    private ConsultasMoviestorage ms_modelo;

    public Moviestorage_controlador(Frm_Login frm_Login, ConsultasMoviestorage ms_modelo) {
        this.frm_login = frm_Login;
        this.ms_modelo = ms_modelo;
        this.frm_login.btn_signIn.addActionListener(this);
        this.frm_login.txt_Username.addActionListener(this);
        this.frm_login.pf_password.addActionListener(this);
    }

    public void iniciarMovieStorage() {
        frm_login.setTitle("Administrar estado civil");
        frm_login.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == frm_login.btn_signIn) {
            String username = frm_login.txt_Username.getText();
            char[] password = frm_login.pf_password.getPassword();
            if (username.trim().isEmpty() || password.length == 0) {
                JOptionPane.showMessageDialog(frm_login, "Both username and password must be filled in.");
            }else {
                Arrays.fill(password, '0');
            }
        }
    }

}
