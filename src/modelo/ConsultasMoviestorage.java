package modelo;

import com.mysql.cj.jdbc.PreparedStatementWrapper;
import com.mysql.cj.jdbc.result.ResultSetFactory;
import com.mysql.cj.xdevapi.Result;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import vista.Frm_Login;

public class ConsultasMoviestorage extends Conexion {

    private String userName, password, name, lastname, biografia;
    private int userId;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

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
        String sql = "select username,contrasena from usuarios where username = ? and contrasena = ? ";
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
        String sql = "select username from usuarios where username = ?";
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
        String sql = "insert into usuarios(nombre,apellido,username,contrasena,biografia) values (?,?,?,?,?);";
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

    public int getUserIdFromDatabase(String username) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = conectar();
        String sql = "SELECT idusuarios FROM usuarios WHERE username = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, username.trim());
            rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getInt("idusuarios");
            }
        } catch (SQLException e) {
            System.out.println("EX" + e);
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println("EX" + e);
            }
        }
        return -1; // return -1 if user not found
    }

    public Map<String, String> getUserData(int userId) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = conectar();
        String sql = "SELECT * FROM usuarios WHERE idusuarios = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, userId);
            rs = ps.executeQuery();
            if (rs.next()) {
                Map<String, String> userData = new HashMap<>();
                userData.put("username", rs.getString("username"));
                userData.put("password", rs.getString("contrasena"));
                userData.put("biografia", rs.getString("biografia"));
                userData.put("nombre", rs.getString("nombre"));
                userData.put("apellido", rs.getString("apellido"));
                return userData;
            }
        } catch (SQLException e) {
            System.out.println("EX" + e);
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println("EX" + e);
            }
        }
        return null; // return null if user not found
    }

    public boolean actualizar(ConsultasMoviestorage ms) {
        PreparedStatement ps = null;
        Connection con = conectar();
        String sql = "UPDATE usuarios SET username = ?, contrasena = ?, biografia = ?, nombre = ?, apellido = ? WHERE idusuarios = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, userName.trim());
            ps.setString(2, password.trim());
            ps.setString(3, biografia.trim());
            ps.setString(4, name.trim());
            ps.setString(5, lastname.trim());
            ps.setInt(6, userId);
            ps.executeUpdate();
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
