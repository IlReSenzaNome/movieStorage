package controlador;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Arrays;
import javax.swing.JOptionPane;
import modelo.ConsultasMoviestorage;
import vista.Frm_FormNewUsers;
import vista.Frm_Login;
import vista.Frm_MovieLibrary;

public class Moviestorage_controlador implements ActionListener {

    private Frm_Login frm_login;
    private Frm_MovieLibrary frm_movielibrary;
    private ConsultasMoviestorage ms_modelo;
    private Frm_FormNewUsers frm_formNewUsers;

    public Moviestorage_controlador(Frm_Login frm_Login, Frm_FormNewUsers frm_formNewUsers, Frm_MovieLibrary frm_MovieLibrary, ConsultasMoviestorage ms_modelo) {
        this.frm_login = frm_Login;
        this.frm_formNewUsers = frm_formNewUsers;
        this.ms_modelo = ms_modelo;
        this.frm_login.btn_signIn.addActionListener(this);
        this.frm_login.txt_Username.addActionListener(this);
        this.frm_login.pf_password.addActionListener(this);
        this.frm_formNewUsers.btn_Submit.addActionListener(this);
        this.frm_formNewUsers.txt_name.addActionListener(this);
        this.frm_formNewUsers.txt_lastname.addActionListener(this);
        this.frm_formNewUsers.txt_username.addActionListener(this);
        this.frm_formNewUsers.txt_passwordField.addActionListener(this);

        this.frm_login.jl_singup.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                frm_login.dispose();
                frm_formNewUsers.setVisible(true);
            }
        });
        this.frm_formNewUsers.lbl_SingIn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                frm_formNewUsers.dispose();
                frm_login.setVisible(true);
            }
        });
    }

    public void iniciarMovieStorage() {
        frm_login.setTitle("Movie Storage");
        frm_login.setLocationRelativeTo(null);
        frm_formNewUsers.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == frm_login.btn_signIn) {
            String username = frm_login.txt_Username.getText();
            char[] password = frm_login.pf_password.getPassword();
            if (username.trim().isEmpty() || password.length == 0) {
                JOptionPane.showMessageDialog(frm_login, "Both username and password must be filled in.");
            } else {
                ms_modelo.setUserName(username.trim());
                ms_modelo.setPassword(new String(password));
                if (ms_modelo.validUser(ms_modelo)) {
                    frm_login.dispose();
                    frm_movielibrary = new Frm_MovieLibrary();
                    frm_movielibrary.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(frm_login, "Invalid username or password");
                }
                Arrays.fill(password, '0');
            }
        } else if (e.getSource() == frm_formNewUsers.btn_Submit) {
            String name = frm_formNewUsers.txt_name.getText();
            String lastname = frm_formNewUsers.txt_lastname.getText();
            String username = frm_formNewUsers.txt_username.getText();
            char[] password = frm_formNewUsers.txt_passwordField.getPassword();
            if (name.trim().isEmpty() || lastname.trim().isEmpty() || username.trim().isEmpty() || password.length == 0) {
                JOptionPane.showMessageDialog(frm_formNewUsers, "All camps necesarry");
            } else {
                ms_modelo.setUserName(frm_formNewUsers.txt_username.getText().trim());
                ms_modelo.setName(frm_formNewUsers.txt_name.getText().trim());
                ms_modelo.setPassword(new String(password));
                ms_modelo.setLastname(frm_formNewUsers.txt_lastname.getText().trim());
                ms_modelo.setBiografia(frm_formNewUsers.txta_biografi.getText().trim());
                if (ms_modelo.ExistUser(ms_modelo)) {
                    JOptionPane.showMessageDialog(frm_formNewUsers, "User already exists");
                } else {
                    if (ms_modelo.createNewUser(ms_modelo)) {
                        JOptionPane.showMessageDialog(frm_formNewUsers, "User Create");
                        frm_formNewUsers.dispose();
                        frm_login.setVisible(true);
                    } else {
                        JOptionPane.showMessageDialog(frm_formNewUsers, "user not create");
                    }
                }
            }
        }
    }

}
