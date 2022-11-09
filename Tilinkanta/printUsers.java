package Tilinkanta;

import java.sql.ResultSet;
import java.sql.Statement;

public class printUsers {
    Statement stmt = null;

    //Tulostetaan kaikki käyttäjät
    public void printUsersAll() {
        try {
            Connectio connectio = new Connectio();
            connectio.connect();

            stmt = connectio.connect().createStatement();

            ResultSet rs = stmt.executeQuery("SELECT * FROM TILINHALLINTA;");
            while (rs.next()) {
                String name = rs.getString("name");
                int age = rs.getInt("age");
                String country = rs.getString("country");
                float salary = rs.getFloat("salary");
                int id2 = rs.getInt("id");
                System.out.println("NAME = " + name);
                System.out.println("AGE = " + age);
                System.out.println("country = " + country);
                System.out.println("SALARY = " + salary);
                System.out.println( "ID = " + id2 );
                System.out.println();
            }
            rs.close();
            stmt.close();
            connectio.connect().close();

        } catch (Exception e) {
            System.out.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }
    //Tulostetaan tietty käyttäjä, pohjautuen käyttäjän antamaan ID:hen
    public void printUserSpecific(int id) {
        try {
            Connectio connectio = new Connectio();
            connectio.connect();

            stmt = connectio.connect().createStatement();

            ResultSet rs = stmt.executeQuery("SELECT * FROM TILINHALLINTA WHERE id=%s;".formatted(id));
            while (rs.next()) {
                String name = rs.getString("name");
                int age = rs.getInt("age");
                String country = rs.getString("country");
                float salary = rs.getFloat("salary");
                int id2 = rs.getInt("id");
                System.out.println("NAME = " + name);
                System.out.println("AGE = " + age);
                System.out.println("country = " + country);
                System.out.println("SALARY = " + salary);
                System.out.println( "ID = " + id2 );
                System.out.println();
            }
            rs.close();
            stmt.close();
            connectio.connect().close();

        } catch (Exception e) {
            System.out.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }

    }
}

