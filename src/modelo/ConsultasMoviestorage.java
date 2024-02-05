package modelo;

import com.mysql.cj.jdbc.PreparedStatementWrapper;
import com.mysql.cj.jdbc.result.ResultSetFactory;
import com.mysql.cj.jdbc.result.ResultSetMetaData;
import com.mysql.cj.xdevapi.Result;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ConsultasMoviestorage extends Conexion {

    private String userName, password, name, lastname, biografia, comentario, favorito;
    private int userId, filmid, idbilioteca;
    private float calificacion;

    public int getIdbilioteca() {
        return idbilioteca;
    }

    public void setIdbilioteca(int idbilioteca) {
        this.idbilioteca = idbilioteca;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getFavorito() {
        return favorito;
    }

    public void setFavorito(String favorito) {
        this.favorito = favorito;
    }

    public float getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(float calificacion) {
        this.calificacion = calificacion;
    }

    public int getFilmid() {
        return filmid;
    }

    public void setFilmid(int filmid) {
        this.filmid = filmid;
    }

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
            ps.setString(1, ms.getUserName().trim());
            ps.setString(2, ms.getPassword().trim());
            ps.setString(3, ms.getBiografia().trim());
            ps.setString(4, ms.getName().trim());
            ps.setString(5, ms.getLastname().trim());
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

    public Map<String, String> getFilmData(int filmId) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = conectar();
        String sql = "SELECT * FROM pelicula WHERE idpelicula = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, filmId);
            rs = ps.executeQuery();
            if (rs.next()) {
                Map<String, String> FilmData = new HashMap<>();
                FilmData.put("nombre", rs.getString("nombre"));
                FilmData.put("sinopsis", rs.getString("sinopsis"));
                FilmData.put("calificacion", rs.getString("calificacion"));
                return FilmData;
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

    public boolean calificar(ConsultasMoviestorage ms, int filmId) {
        PreparedStatement ps = null;
        Connection con = conectar();
        String sql = "insert into biblioteca(idpelicula,idusuarios,calificacionusuario,comentario,favorita) values (?,?,?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, filmId); // use filmId instead of filmid
            ps.setInt(2, ms.getUserId()); // assuming getUserId() returns an integer
            ps.setFloat(3, ms.getCalificacion()); // setFloat instead of setString
            ps.setString(4, ms.getComentario().trim());
            ps.setString(5, ms.getFavorito().trim()); // setString instead of setFloat
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

    public boolean usuarioYaCalifico(ConsultasMoviestorage ms, int filmId) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = conectar();
        String sql = "SELECT * FROM biblioteca WHERE idusuarios = ? AND idpelicula = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, ms.getUserId());
            ps.setInt(2, filmId);
            rs = ps.executeQuery();
            return rs.next(); // return true if a row was found
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

    public boolean actualizarCalificacion(ConsultasMoviestorage ms, int filmId, float nuevaCalificacion) {
        PreparedStatement ps = null;
        Connection con = conectar();
        String sql = "UPDATE biblioteca SET calificacionusuario = ?, comentario = ?, favorita = ? WHERE idusuarios = ? AND idpelicula = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setFloat(1, nuevaCalificacion);
            ps.setString(2, ms.getComentario());
            ps.setString(3, ms.getFavorito());
            ps.setInt(4, ms.getUserId());
            ps.setInt(5, filmId);
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

    public void listarBiblioteca(DefaultTableModel modelo, ConsultasMoviestorage ms) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = conectar();
        String sql = "SELECT biblioteca.idpelicula, pelicula.nombre, biblioteca.favorita, biblioteca.comentario, biblioteca.calificacionusuario FROM biblioteca INNER JOIN pelicula ON biblioteca.idpelicula = pelicula.idpelicula WHERE biblioteca.idusuarios = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, ms.getUserId());
            rs = ps.executeQuery();

            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            // Define las columnas del modelo
            modelo.addColumn("ID Pelicula");
            modelo.addColumn("Nombre");
            modelo.addColumn("Favorita");
            modelo.addColumn("Comentario");
            modelo.addColumn("Calificacion");

            // Llena el modelo con las filas de la consulta
            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
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
    }

    public boolean eliminarCalificacion(int idpelicula) {
        PreparedStatement ps = null;
        Connection con = conectar();
        String sql = "DELETE FROM biblioteca WHERE idpelicula = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, idpelicula);
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
