package ejercutor;

import controlador.Moviestorage_controlador;
import modelo.ConsultasMoviestorage;
import vista.*;

public class MovieStorage {

    public static void main(String[] args) {
        ConsultasMoviestorage ms_consultas = new ConsultasMoviestorage();
        Frm_Login frm_login = new Frm_Login();
        Frm_MovieLibrary frm_movielibrary = new Frm_MovieLibrary();
        Frm_FormNewUsers frm_formnewusers = new Frm_FormNewUsers();
        Frm_MovieLibrary frm_movieLibrary = new Frm_MovieLibrary();
        Frm_UserProfile frm_UserProfile = new Frm_UserProfile();
        Frm_NotesFilms frm_NotesFilms = new Frm_NotesFilms();
        Frm_library frm_library = new Frm_library();
        Moviestorage_controlador ms_controlador = new Moviestorage_controlador(frm_login, frm_formnewusers, frm_movieLibrary, frm_UserProfile, frm_NotesFilms, frm_library, ms_consultas);
        ms_controlador.iniciarMovieStorage();
        frm_login.setVisible(true);
    }

}
