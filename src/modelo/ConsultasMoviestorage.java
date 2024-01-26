package modelo;

import com.mysql.cj.jdbc.PreparedStatementWrapper;
import com.mysql.cj.jdbc.result.ResultSetFactory;
import com.mysql.cj.xdevapi.Result;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import vista.Frm_Login;

public class ConsultasMoviestorage extends Conexion {

    private String userName, password, name, lastname, biografia;
    private Frm_Login frm_login;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getBiografia() {
        return biografia;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }

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

    public boolean validUser(ConsultasMoviestorage ms) {
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

    public boolean ExistUser(ConsultasMoviestorage ms) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = conectar();
        String sql = "select correo from usuarios where correo = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, ms.getUserName().trim());
            rs = ps.executeQuery();
            if (rs.next()) {
                return true;
            }
            return false;
        } catch (SQLException e) {
            System.out.println("EX" + e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println("EX" + e);
            }
        }
    }

    public boolean createNewUser(ConsultasMoviestorage ms) {
        PreparedStatement ps = null;
        Connection con = conectar();
        String sql = "insert into usuarios(nombre,apellido,correo,contrasena,biografia) values (?,?,?,?,?);";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, ms.getName().trim());
            ps.setString(2, ms.getLastname().trim());
            ps.setString(3, ms.getUserName().trim());
            ps.setString(4, ms.getPassword().trim());
            ps.setString(5, ms.getBiografia());
            ps.execute();
            return true;
        } catch (Exception e) {
            System.out.println("EX" + e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println("EX" + e);
            }
        }
    }

}
