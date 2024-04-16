package org.example;
import java.sql.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        ConexionMySQL cx = new ConexionMySQL();
        Connection cnx = cx.conectarMySQL();

        try {
            Statement stmt = cnx.createStatement(); // Se crea una sentencia jdbc para realizar la consulta
            String sql = "SELECT * FROM peliculas"; // Se prepara el string SQL de la consulta
            ResultSet rs = stmt.executeQuery(sql); // Se ejecuta la sentencia y se recibe un resultado
            while (rs.next()) {// Se recorre el resultado
                String titulo = rs.getString("titulo");
                String id = rs.getString("id");
                System.out.println("El título de la pelicula "+id+" es: " + titulo);
                //int id = rs.getInt(“deono)
            }
            rs.close();

            String sqli = "INSERT INTO peliculas VALUES (10,'Eternals','Aventuras','2024-02-02','2024-02-02')";
            stmt.execute(sqli); // Se ejecuta la inserción

            stmt.close();
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
        }
    }
}