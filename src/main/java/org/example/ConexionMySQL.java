package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionMySQL {

    // Nombre de la base de datos
    public String database = "nba";

    // Host
    public String hostname = "localhost";

    // Puerto
    public String port = "3306";

    // Ruta de nuestra base de datos (desactivamos el uso de SSL con "?useSSL=false")
    public String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database + "?useSSL=false";

    // Nombre de usuario
    public String username = "javaUser";

    // Clave de usuario
    public String password = "123456789";

    public Connection conectarMySQL() {
        Connection conn = null;

        try {
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("He conseguido conectar");

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return conn;
    }

}
