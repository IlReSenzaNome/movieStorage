package modelo;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {

    String bd = "movie";
    String url = "jdbc:mysql://localhost:3306/" + bd;
    String usuario = "root";
    String clave = "root";
    String driver = "com.mysql.cj.jdbc.Driver";
    Connection con;

    public Connection conectar() {
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, usuario, clave);
            System.out.println("Conexion exitosa");

        } catch (Exception e) {
            System.out.println("Conexion NO exitosa");
        }
        return con;
    }

    public void desconectar() {
        try {
            con.close();
        } catch (Exception e) {
            System.out.println("no se desconecto");
        }
    }
//esto es para verificar la conexion
/*
    public static void main(String[] args) {
        Conexion c = new Conexion();
        c.conectar();
    }
*/
}
