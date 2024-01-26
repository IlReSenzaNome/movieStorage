package ejercutor;

import controlador.Moviestorage_controlador;
import modelo.ConsultasMoviestorage;
import vista.Frm_Login;
import vista.Frm_FormNewUsers;
import vista.Frm_MovieLibrary;

public class MovieStorage {

    public static void main(String[] args) {
        ConsultasMoviestorage ms_consultas = new ConsultasMoviestorage();
        Frm_Login frm_login = new Frm_Login();
        Frm_MovieLibrary frm_movielibrary = new Frm_MovieLibrary();
        Frm_FormNewUsers frm_formnewusers = new Frm_FormNewUsers();
        Frm_MovieLibrary frm_movieLibrary = new Frm_MovieLibrary();
        Moviestorage_controlador ms_controlador = new Moviestorage_controlador(frm_login, frm_formnewusers, frm_movieLibrary, ms_consultas);
        ms_controlador.iniciarMovieStorage();
        frm_login.setVisible(true);
    }

}
