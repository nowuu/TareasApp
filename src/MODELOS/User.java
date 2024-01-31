package MODELOS;

import MODELOS.Rol;

import java.sql.ResultSet;
import java.sql.SQLException;

public class User extends ModeloBase{
     private int idUser;
     private String username;

     private int password;
      private Rol rol;

    public User() {
    }

    public User(int idUser, String username, int password, Rol rol) {
        this.idUser = idUser;
        this.username = username;
        this.password = password;
        this.rol = rol;
    }

    public User(String username, String password) {
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "User{" +
                "idUser=" + idUser +
                ", username='" + username + '\'' +
                ", password=" + password +
                ", rol=" + rol +
                '}';
    }

    @Override
    protected String getNombreTabla() {
        return "user";
    }


    protected Object createObjectFromResultSet(ResultSet resultSet) throws SQLException {
        return null;
    }
}
