package controlador;

import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Arrays;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;
import modelo.ConsultasMoviestorage;
import vista.*;

public class Moviestorage_controlador implements ActionListener {

    ImageIcon Imagen[] = new ImageIcon[15];
    int contador = 0;
    private Frm_Login frm_login;
    private Frm_MovieLibrary frm_movielibrary;
    private ConsultasMoviestorage ms_modelo;
    private Frm_FormNewUsers frm_formNewUsers;
    private Frm_UserProfile frm_UserProfile;
    private Frm_NotesFilms frm_NotesFilms;
    private Frm_library frm_library;
    public int biblioteca;

    public Moviestorage_controlador(Frm_Login frm_Login, Frm_FormNewUsers frm_formNewUsers, Frm_MovieLibrary frm_MovieLibrary, Frm_UserProfile frm_UserProfile, Frm_NotesFilms frm_NotesFilms, Frm_library frm_library, ConsultasMoviestorage ms_modelo) {
        this.frm_login = frm_Login;
        this.frm_formNewUsers = frm_formNewUsers;
        this.frm_movielibrary = frm_MovieLibrary;
        this.frm_UserProfile = frm_UserProfile;
        this.frm_NotesFilms = frm_NotesFilms;
        this.frm_library = frm_library;
        this.ms_modelo = ms_modelo;
        this.frm_login.btn_signIn.addActionListener(this);
        this.frm_login.txt_Username.addActionListener(this);
        this.frm_login.pf_password.addActionListener(this);
        this.frm_login.jl_singup.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                frm_login.dispose();
                frm_formNewUsers.lbl_SingIn.setForeground(new Color(245, 246, 247));
                frm_formNewUsers.setVisible(true);
            }
        });
        this.frm_formNewUsers.btn_Submit.addActionListener(this);
        this.frm_formNewUsers.txt_name.addActionListener(this);
        this.frm_formNewUsers.txt_lastname.addActionListener(this);
        this.frm_formNewUsers.txt_username.addActionListener(this);
        this.frm_formNewUsers.txt_passwordField.addActionListener(this);
        this.frm_formNewUsers.lbl_SingIn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                frm_formNewUsers.dispose();
                frm_Login.jl_singup.setForeground(new Color(245, 246, 247));
                frm_login.setVisible(true);
            }
        });
        this.frm_movielibrary.lbl_btnDerecho.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (contador <= 1) {
                    contador = 14;
                } else {
                    contador--;
                }
                frm_movielibrary.lbl_Poster.setIcon(Imagen[contador]);
            }
        });
        this.frm_movielibrary.lbl_btnIzquierdo.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (contador >= 14) {
                    contador = 1;
                } else {
                    contador++;
                }
                frm_movielibrary.lbl_Poster.setIcon(Imagen[contador]);
            }
        });
        this.frm_movielibrary.lbl_userIcon.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                frm_movielibrary.dispose();
                Map<String, String> userData = ms_modelo.getUserData(ms_modelo.getUserId());
                if (userData != null) {
                    String password = userData.get("password");
                    String passwordMask = new String(new char[password.length()]).replace("\0", "*");
                    frm_UserProfile.lbl_username.setText("Username: " + userData.get("username"));
                    frm_UserProfile.lbl_password.setText("Password: " + passwordMask);
                    frm_UserProfile.lbl_name.setText("Name: " + userData.get("nombre"));
                    frm_UserProfile.lbl_lastname.setText("LastName: " + userData.get("apellido"));
                    frm_UserProfile.txta_biografi.setText("Biografi: " + userData.get("biografia"));
                } else {
                    JOptionPane.showMessageDialog(null, "User not found");
                }
                frm_UserProfile.setVisible(true);
            }
        });
        this.frm_movielibrary.btn_singOut.addActionListener(this);
        this.frm_movielibrary.lbl_addFilm.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                frm_NotesFilms.setVisible(true);
                JTextArea textArea = (JTextArea) frm_NotesFilms.txta_sinopsis.getViewport().getView();
                Map<String, String> FilmData = ms_modelo.getFilmData(contador);
                if (FilmData != null) {
                    frm_NotesFilms.lbl_Title.setText("Title: " + FilmData.get("nombre"));
                    textArea.setText("Sinopsis: " + FilmData.get("sinopsis"));
                    frm_NotesFilms.lbl_Calificacion.setText("calificacion: " + FilmData.get("calificacion"));
                } else {
                    JOptionPane.showMessageDialog(null, "Film not found");
                }
            }
        });
        this.frm_movielibrary.lbl_librarylist.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                frm_MovieLibrary.dispose();
                frm_library.setVisible(true);
            }
        });
        this.frm_UserProfile.lbl_home.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                frm_UserProfile.dispose();
                enableUser();
                frm_UserProfile.btn_updateDate.setEnabled(true);
                frm_movielibrary.setVisible(true);
            }
        });
        this.frm_UserProfile.btn_update.addActionListener(this);
        this.frm_UserProfile.btn_updateDate.addActionListener(this);
        this.frm_UserProfile.btn_cancel.addActionListener(this);
        this.frm_UserProfile.txt_lastaname.addActionListener(this);
        this.frm_UserProfile.txt_name.addActionListener(this);
        this.frm_UserProfile.txt_username.addActionListener(this);
        this.frm_NotesFilms.lbl_dispose.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                frm_NotesFilms.dispose();
                frm_NotesFilms.lbl_dispose.setForeground(new Color(245, 246, 247));
                frm_NotesFilms.txt_califica.setText("");
                frm_NotesFilms.txta_comentario.setText("");
                frm_NotesFilms.txt_favorita.setText("");
            }
        });
        this.frm_NotesFilms.btn_Cancel.addActionListener(this);
        this.frm_NotesFilms.btn_Calificar.addActionListener(this);
        this.frm_NotesFilms.btn_update.addActionListener(this);
        this.frm_library.lbl_goBack.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                frm_library.dispose();
                frm_movielibrary.setVisible(true);
            }
        });
        this.frm_library.btn_delete.addActionListener(this);
    }

    public void iniciarMovieStorage() {
        frm_login.setTitle("Movie Storage");
        frm_login.setLocationRelativeTo(null);
        frm_formNewUsers.setLocationRelativeTo(null);
        frm_formNewUsers.setTitle("Registro");
        frm_movielibrary.setTitle("Library");
        frm_movielibrary.setLocationRelativeTo(null);
        frm_movielibrary.lbl_userIcon.setToolTipText("Profile");
        frm_UserProfile.setTitle("User Profile");
        frm_UserProfile.setLocationRelativeTo(null);
        frm_NotesFilms.setTitle("Notes");
        frm_NotesFilms.setLocationRelativeTo(null);
        frm_library.setTitle("User LIbrary");
        frm_library.setLocationRelativeTo(null);
        enableUser();
        carusel();
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
                    ms_modelo.setUserId(ms_modelo.getUserIdFromDatabase(username.trim()));
                    ms_modelo.listarBiblioteca(frm_library.modelo, ms_modelo);
                    frm_login.pf_password.setText("");
                    frm_login.txt_Username.setText("");
                    frm_login.dispose();
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
            String biografi = frm_formNewUsers.txta_biografi.getText();
            if (name.trim().isEmpty() || lastname.trim().isEmpty() || username.trim().isEmpty() || biografi.trim().isEmpty() || password.length == 0) {
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
        } else if (e.getSource() == frm_movielibrary.btn_singOut) {
            frm_movielibrary.dispose();
            frm_login.setVisible(true);
            limparTabla();
        } else if (e.getSource() == frm_UserProfile.btn_updateDate) {
            frm_UserProfile.btn_updateDate.setEnabled(false);
            frm_UserProfile.txt_username.requestFocus();
            frm_UserProfile.txt_lastaname.setEnabled(true);
            frm_UserProfile.txt_name.setEnabled(true);
            frm_UserProfile.txt_username.setEnabled(true);
            frm_UserProfile.txta_ubiografi.setEnabled(true);
            frm_UserProfile.pf_pasword.setEnabled(true);
            frm_UserProfile.btn_update.setEnabled(true);
            frm_UserProfile.btn_cancel.setEnabled(true);
        } else if (e.getSource() == frm_UserProfile.btn_cancel) {
            frm_UserProfile.btn_updateDate.setEnabled(true);
            enableUser();
        } else if (e.getSource() == frm_UserProfile.btn_update) {
            String Username = frm_UserProfile.txt_username.getText().trim();
            String Contrasena = new String(frm_UserProfile.pf_pasword.getPassword());
            String Biografia = frm_UserProfile.txta_ubiografi.getText().trim();
            String Nombre = frm_UserProfile.txt_name.getText().trim();
            String Apellido = frm_UserProfile.txt_lastaname.getText().trim();
            int userId = ms_modelo.getUserId();
            if (Username.trim().isEmpty() || Contrasena.trim().isEmpty() || Biografia.trim().isEmpty() || Nombre.trim().isEmpty() || Apellido.trim().isEmpty()) {
                JOptionPane.showMessageDialog(frm_formNewUsers, "All camps necesarry");
            } else {
                ms_modelo.setUserName(Username);
                ms_modelo.setPassword(Contrasena);
                ms_modelo.setBiografia(Biografia);
                ms_modelo.setName(Nombre);
                ms_modelo.setLastname(Apellido);
                ms_modelo.setUserId(userId);
                if (ms_modelo.ExistUser(ms_modelo)) {
                    JOptionPane.showMessageDialog(frm_UserProfile, "Username busy");
                } else {
                    if (ms_modelo.actualizar(ms_modelo)) {
                        JOptionPane.showMessageDialog(frm_UserProfile, "User updated successfully");
                        frm_UserProfile.txt_lastaname.setText("");
                        frm_UserProfile.pf_pasword.setText("");
                        frm_UserProfile.txt_name.setText("");
                        frm_UserProfile.txt_username.setText("");
                        frm_UserProfile.txta_ubiografi.setText("");
                        Map<String, String> userData = ms_modelo.getUserData(ms_modelo.getUserId());
                        if (userData != null) {
                            String password = userData.get("password");
                            String passwordMask = new String(new char[password.length()]).replace("\0", "*");
                            frm_UserProfile.lbl_username.setText("Username: " + userData.get("username"));
                            frm_UserProfile.lbl_password.setText("Password: " + passwordMask);
                            frm_UserProfile.lbl_name.setText("Name: " + userData.get("nombre"));
                            frm_UserProfile.lbl_lastname.setText("LastName: " + userData.get("apellido"));
                            frm_UserProfile.txta_biografi.setText("Biografi: " + userData.get("biografia"));
                        } else {
                            JOptionPane.showMessageDialog(null, "User not found");
                        }
                        enableUser();
                    } else {
                        JOptionPane.showMessageDialog(frm_UserProfile, "User update failed");
                    }
                }
            }
        } else if (e.getSource() == frm_NotesFilms.btn_Cancel) {
            frm_NotesFilms.dispose();
            frm_NotesFilms.txt_califica.setText("");
            frm_NotesFilms.txt_favorita.setText("");
            frm_NotesFilms.txta_comentario.setText("");
        } else if (e.getSource() == frm_NotesFilms.btn_Calificar) {
            String favorito = frm_NotesFilms.txt_favorita.getText().trim();
            String comentario = frm_NotesFilms.txta_comentario.getText().trim();
            String calificaciontext = frm_NotesFilms.txt_califica.getText().trim();
            float califica = Float.parseFloat(frm_NotesFilms.txt_califica.getText().trim());
            if (favorito.trim().isEmpty() || comentario.trim().isEmpty() || calificaciontext.trim().isEmpty() || califica < 0 || califica > 10) {
                JOptionPane.showMessageDialog(frm_NotesFilms, "All camps necesary");
            } else {
                if (ms_modelo.usuarioYaCalifico(ms_modelo, contador)) {
                    JOptionPane.showMessageDialog(frm_NotesFilms, "You have already qualified, I can only update the qualification.");
                } else {
                    ms_modelo.setFavorito(frm_NotesFilms.txt_favorita.getText().trim());
                    ms_modelo.setComentario(frm_NotesFilms.txta_comentario.getText().trim());
                    ms_modelo.setCalificacion(califica);
                    if (ms_modelo.calificar(ms_modelo, contador)) {
                        JOptionPane.showMessageDialog(frm_NotesFilms, "Movie added Successfully");
                        limparTabla();
                        ms_modelo.listarBiblioteca(frm_library.modelo, ms_modelo);
                        frm_NotesFilms.dispose();
                        frm_NotesFilms.txt_califica.setText("");
                        frm_NotesFilms.txt_favorita.setText("");
                        frm_NotesFilms.txta_comentario.setText("");
                    } else {
                        JOptionPane.showMessageDialog(frm_NotesFilms, "Movie added Wrong");
                    }
                }
            }
        } else if (e.getSource() == frm_NotesFilms.btn_update) {
            String favorito = frm_NotesFilms.txt_favorita.getText().trim();
            String comentario = frm_NotesFilms.txta_comentario.getText().trim();
            String calificaciontext = frm_NotesFilms.txt_califica.getText().trim();
            if (favorito.trim().isEmpty() || comentario.trim().isEmpty() || calificaciontext.trim().isEmpty()) {
                JOptionPane.showMessageDialog(frm_NotesFilms, "All camps necessary");
            } else {
                float califica = Float.parseFloat(calificaciontext);
                if (califica < 0 || califica > 10) {
                    JOptionPane.showMessageDialog(frm_NotesFilms, "Rating must be between 0 and 10");
                } else {
                    ms_modelo.setFavorito(favorito);
                    ms_modelo.setComentario(comentario);
                    ms_modelo.setCalificacion(califica);
                    if (ms_modelo.actualizarCalificacion(ms_modelo, contador, califica)) {
                        JOptionPane.showMessageDialog(frm_NotesFilms, "Update qualification film");
                        frm_NotesFilms.dispose();
                        limparTabla();
                        ms_modelo.listarBiblioteca(frm_library.modelo, ms_modelo);
                    } else {
                        JOptionPane.showMessageDialog(frm_NotesFilms, "Not update qualification film");
                    }
                }
            }
        } else if (e.getSource() == frm_library.btn_delete) {
            String idpelicula= frm_library.txt_idPelicula.getText().trim();
            if (idpelicula.trim().isEmpty()) {
                JOptionPane.showMessageDialog(frm_library, "Alll camps necesarry");
            } else {
                int id = Integer.parseInt(idpelicula);
                ms_modelo.setUserId(id);
                if (ms_modelo.eliminarCalificacion(id)) {
                    JOptionPane.showMessageDialog(frm_library, "Qualification delete");
                    limparTabla();
                    ms_modelo.listarBiblioteca(frm_library.modelo, ms_modelo);
                } else {
                    JOptionPane.showMessageDialog(frm_library, "quualification no delte");
                }
            }
        }

    }

    public void carusel() {
        for (int i = 1; i < 15; i++) {
            Imagen[i] = new ImageIcon(getClass().getResource("/Resources/image" + i + ".png"));
            contador++;
        }
        contador = 1;
        frm_movielibrary.lbl_Poster.setIcon(Imagen[1]);
    }

    public void enableUser() {
        frm_UserProfile.txt_name.setEnabled(false);
        frm_UserProfile.txt_username.setEnabled(false);
        frm_UserProfile.txta_ubiografi.setEnabled(false);
        frm_UserProfile.txt_lastaname.setEnabled(false);
        frm_UserProfile.pf_pasword.setEnabled(false);
        frm_UserProfile.btn_update.setEnabled(false);
        frm_UserProfile.btn_cancel.setEnabled(false);
    }

    private void limparTabla() {
        frm_library.modelo.setColumnCount(0);
        frm_library.modelo.setRowCount(0);
    }

}
