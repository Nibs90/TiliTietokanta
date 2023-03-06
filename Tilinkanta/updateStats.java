package Tilinkanta;

import java.sql.ResultSet;
import java.sql.Statement;

/*This Java code defines a class named updateStats, which has four methods: changeName, changeAge, changeCountry, and changeSalary. 
Each of these methods updates a particular field (name, age, country, or salary) of a row in a database table named TILINHALLINTA, given an id value. 
The new value for the field is passed as a parameter to the method.

The code establishes a database connection using a Connectio class, which is not shown here. It then creates a Statement object and 
uses it to execute a SQL update statement, which modifies the appropriate field in the database. It then retrieves the updated row from the database
using a SQL select statement and prints out the values of all the fields in the row using System.out.println(). Finally, it closes the ResultSet, 
Statement, and database connection objects.

If an exception is thrown during the database operations, the code prints the exception message and exits the program.*/

public class updateStats {
    Statement stmt;
    //Nimenvaihto, käyttäjältä kysytään sekä nimeä että ID:tä, jonka avulla suoritetaan nimenmuutos
    public void changeName(String uusiNimi, int id) {
        try {
            Connectio connectio = new Connectio();
            connectio.connect();

            stmt = connectio.connect().createStatement();
            String sql = "UPDATE TILINHALLINTA set NAME = '%s' where id=%s;".formatted(uusiNimi, id);
            stmt.executeUpdate(sql);

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
                System.out.println("ID = " + id2);
                System.out.println();
            }
            rs.close();
            stmt.close();
            connectio.connect().close();
            System.out.println("Käyttäjän tieto päivitetty");

        } catch (Exception e) {
            System.out.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }

    }
    //Iän vaihto, käyttäjältä kysytään sekä ikää että ID:tä, jonka avulla suoritetaan iän muutos

    public void changeAge(int age, int id) {
        try {
            Connectio connectio = new Connectio();
            connectio.connect();

            stmt = connectio.connect().createStatement();
            String sql = "UPDATE TILINHALLINTA set AGE = %s where id=%s;".formatted(age, id);
            stmt.executeUpdate(sql);

            ResultSet rs = stmt.executeQuery("SELECT * FROM TILINHALLINTA WHERE id=%s;".formatted(id));
            while (rs.next()) {
                String name = rs.getString("name");
                int age2 = rs.getInt("age");
                String country = rs.getString("country");
                float salary = rs.getFloat("salary");
                int id2 = rs.getInt("id");
                System.out.println("NAME = " + name);
                System.out.println("AGE = " + age2);
                System.out.println("country = " + country);
                System.out.println("SALARY = " + salary);
                System.out.println("ID = " + id2);
                System.out.println();
            }
            rs.close();
            stmt.close();
            connectio.connect().close();
            System.out.println("Käyttäjän tieto päivitetty");

        } catch (Exception e) {
            System.out.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }

    }
    //Maan vaihto, käyttäjältä kysytään sekä uutta maata että ID:tä, jonka avulla suoritetaan maan muutos

    public void changeCountry(String country, int id) {
        try {
            Connectio connectio = new Connectio();
            connectio.connect();

            stmt = connectio.connect().createStatement();
            String sql = "UPDATE TILINHALLINTA set country = '%s' where id=%s;".formatted(country, id);
            stmt.executeUpdate(sql);

            ResultSet rs = stmt.executeQuery("SELECT * FROM TILINHALLINTA WHERE id=%s;".formatted(id));
            while (rs.next()) {
                String name = rs.getString("name");
                int age = rs.getInt("age");
                String country2 = rs.getString("country");
                float salary = rs.getFloat("salary");
                int id2 = rs.getInt("id");
                System.out.println("NAME = " + name);
                System.out.println("AGE = " + age);
                System.out.println("country = " + country2);
                System.out.println("SALARY = " + salary);
                System.out.println("ID = " + id2);
                System.out.println();
            }
            rs.close();
            stmt.close();
            connectio.connect().close();
            System.out.println("Käyttäjän tieto päivitetty");

        } catch (Exception e) {
            System.out.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }

    }
    //Tilintietojen vaihto, käyttäjältä kysytään sekä uutta tiliä että ID:tä, jonka avulla suoritetaan tilin muutos

    public void changeSalary(double salary, int id) {
        try {
            Connectio connectio = new Connectio();
            connectio.connect();

            stmt = connectio.connect().createStatement();
            String sql = "UPDATE TILINHALLINTA set SALARY = %s where id=%s;".formatted(salary, id);
            stmt.executeUpdate(sql);

            ResultSet rs = stmt.executeQuery("SELECT * FROM TILINHALLINTA WHERE id=%s;".formatted(id));
            while (rs.next()) {
                String name = rs.getString("name");
                int age = rs.getInt("age");
                String country = rs.getString("country");
                float salary2 = rs.getFloat("salary");
                int id2 = rs.getInt("id");
                System.out.println("NAME = " + name);
                System.out.println("AGE = " + age);
                System.out.println("country = " + country);
                System.out.println("SALARY = " + salary2);
                System.out.println("ID = " + id2);
                System.out.println();
            }
            rs.close();
            stmt.close();
            connectio.connect().close();
            System.out.println("Käyttäjän tieto päivitetty");


        } catch (Exception e) {
            System.out.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }

    }

    public void deleteUser(int id) {
        try {
            Connectio connectio = new Connectio();
            connectio.connect();

            stmt = connectio.connect().createStatement();
            String sql = "DELETE from TILINHALLINTA where id=%s;".formatted(id);
            stmt.executeUpdate(sql);

            System.out.println("Käyttäjä poistettu");

            stmt.close();
            connectio.connect().close();

        } catch (Exception e) {
            System.out.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }

    }

}
