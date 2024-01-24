package modelo;

import com.mysql.cj.jdbc.PreparedStatementWrapper;
import com.mysql.cj.jdbc.result.ResultSetFactory;
import com.mysql.cj.xdevapi.Result;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import vista.Frm_Login;

public class ConsultasMoviestorage extends Conexion {
    private String userName;
    private String password;
    private Frm_Login frm_login;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Frm_Login getFrm_login() {
        return frm_login;
    }

    public void setFrm_login(Frm_Login frm_login) {
        this.frm_login = frm_login;
    }

    public String getBd() {
        return bd;
    }

    public void setBd(String bd) {
        this.bd = bd;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }

    public boolean validUser(ConsultasMoviestorage ms){
        PreparedStatement ps = null;
        Connection con = conectar();
        String sql = "select correo,contrasena from usuarios where correo = ? and contrasena = ? ";
        ResultSet rs = null;
        try {
           ps = con.prepareStatement(sql);
           ps.setString(1, ms.getUserName().trim());
           ps.setString(2, ms.getPassword().trim());
           rs = ps.executeQuery();
            if (rs.next()) {
                return true;
            }
            return false;
        } catch (Exception e) {
            System.out.println("EX " + e);
            return false;
        } finally {
            try {
                con.close();
            } catch (Exception e) {
                System.out.println("EX " + e);
            }
        }
    }
    
}

