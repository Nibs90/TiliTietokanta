package Tilinkanta;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

//Otetaan yhteyttä tietokantaan.
public class Connectio {
    private final String url = "jdbc:postgresql://localhost/tili";
    private final String user = "Jarno";
    private final String password = "123Java";

    public Connection connect() throws ClassNotFoundException {
        Class.forName("org.postgresql.Driver");
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return conn;
    }
}
