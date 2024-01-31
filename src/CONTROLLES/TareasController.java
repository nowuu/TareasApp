package CONTROLLES;

import BASEDEDATOS.Conexion;
import MODELOS.Rol;
import MODELOS.Task;
import MODELOS.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TareasController {
    private List<User> usersList;
    private User userLogged;
    private List<Task> tasks;
    private List<Rol> rolList;


    public TareasController() {

        usersList = new ArrayList<>();


    }

    public void addUser(User user) {
        usersList.add(user);
    }

    public User getUserLogged() {
        return userLogged;
    }

    public boolean login(String username, String password) {
        Connection connection = Conexion.conectar();
        String sql = "select T0.username,T0.iduser,T1.id,T1.descripcion from user T0 " +
                "left join rol T1 on T0.rol=T1.id where username=? and password=?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                User user = new User();
                user.setIdUser(resultSet.getInt("iduser"));
                user.setUsername(resultSet.getString("username"));
                Rol rol = new Rol();
                rol.setIdRol(resultSet.getInt("id"));
                rol.setDescripcion(resultSet.getString("descripcion"));
                user.setRol(rol);
                userLogged = user;
                return true;
            } else {
                userLogged = null;
                return false;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }


    public boolean newUsuario(String username, String password,int rol) {
        // Verificar si el nombre de usuario ya existe
        if (userExists(username,password)) {
            System.out.println("El nombre de usuario ya existe. Por favor, elige otro.");
            return false;
        }

        // Crear un nuevo usuario
        User newUser = new User();

        // Agregar el nuevo usuario a la lista
        return newUser.insertar("(username,password,idrol) values(?,?,?)", username, password,rol);


    }


    private boolean userExists(String username, String password) {
        Connection connection = Conexion.conectar();
        String sql = "SELECT T0.username, T0.iduser, T1.id, T1.descripcion FROM user T0 " +
                "LEFT JOIN rol T1 ON T0.rol = T1.id WHERE username=? AND password=?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            ResultSet resultSet = preparedStatement.executeQuery();

            // Verificar si el conjunto de resultados tiene al menos una fila
            if (resultSet.next()) {
                // El usuario existe
                return true;
            } else {
                // El usuario no existe
                return false;
            }
        } catch (SQLException e) {
            // Manejar excepciones SQL
            e.printStackTrace(); // O manejar de otra manera
            return false;
        }
    }
    private boolean borrarUsers (String username,String password){
        User newUser = new User(username, password);
if (newUser.borrar("username,password,idrol)"));

    }


}
