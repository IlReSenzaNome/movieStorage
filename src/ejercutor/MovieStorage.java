package ejercutor;

import controlador.Moviestorage_controlador;
import modelo.ConsultasMoviestorage;
import vista.Frm_Login;

public class MovieStorage {

    public static void main(String[] args) {
        ConsultasMoviestorage ms_consultas = new ConsultasMoviestorage();
        Frm_Login frm_login = new Frm_Login();
        Moviestorage_controlador ms_controlador = new Moviestorage_controlador(frm_login,ms_consultas);
        ms_controlador.iniciarMovieStorage();
        frm_login.setVisible(true);
    }
    
}
