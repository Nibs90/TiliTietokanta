package Tilinkanta;

import java.sql.Statement;

public class addNewUser {

    Statement stmt = null;

    //Lisätään uusi käyttäjä, käyttäjältä kysyttyjen tietojen perusteella
    public void addUser(String name, int age, String country, double salary) {
        try {
            Connectio connectio = new Connectio();
            connectio.connect();

            stmt = connectio.connect().createStatement();

            String sql = "INSERT INTO TILINHALLINTA (NAME,AGE,country,SALARY) "
                    + "VALUES ('%s', %s, '%s', %s );".formatted(name, age, country, salary);

            stmt.executeUpdate(sql);

            stmt.close();
            connectio.connect().close();

        } catch (Exception e) {
            System.out.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }

        System.out.println("Käyttäjän lisäys onnistui loistavasti!");
    }
}
