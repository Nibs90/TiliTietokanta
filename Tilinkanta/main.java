package Tilinkanta;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Mitä haluaisit tehdä? \n1.Tarkistaa kaikkia käyttäjiä \n2.Tarkastella tiettyä käyttäjää \n" +
                "3.Muuttaa käyttäjän nimeä \n4.Muuttaa käyttäjän ikää \n5.Muuttaa käyttäjän maata \n" +
                "6.Muuttaa käyttäjän tiliä \n7.Lisätä käyttäjä \n8.Poistaa käyttäjä");

        System.out.print("Valinta: ");
        int valinta = Integer.parseInt(scanner.nextLine());

        switch (valinta) {
            case 1:
                //Käyttäjien tulostaminen
                printUsers tulostus = new printUsers();
                tulostus.printUsersAll();
                break;
            case 2:
                //Käyttäjän tulostus
                System.out.print("Syötä halutun käyttäjän ID: ");
                int tulostaID = Integer.parseInt(scanner.nextLine());
                printUsers tulostus2 = new printUsers();
                tulostus2.printUserSpecific(tulostaID);
                break;
            case 3:
                //Nimenvaihto
                System.out.print("Syötä halutun käyttäjän ID: ");
                int id = Integer.parseInt(scanner.nextLine());
                System.out.print("Mikä annetaan uudeksi nimeksi? ");
                String uusNimi = scanner.nextLine();
                System.out.println("");

                updateStats nimenvaihto = new updateStats();
                nimenvaihto.changeName(uusNimi, id);
                break;
            case 4:
                //Iän vaihto
                System.out.print("Syötä halutun käyttäjän ID: ");
                int id2 = Integer.parseInt(scanner.nextLine());
                System.out.print("Kuinka vanha käyttäjä on? ");
                String uusIka = scanner.nextLine();
                System.out.println("");

                updateStats ianVaihto = new updateStats();
                ianVaihto.changeName(uusIka, id2);
                break;
            case 5:
                //Maan vaihto
                System.out.print("Syötä halutun käyttäjän ID: ");
                int id3 = Integer.parseInt(scanner.nextLine());
                System.out.print("Missä maassa käyttäjä asuu? ");
                String uusMaa = scanner.nextLine();
                System.out.println("");

                updateStats maanVaihto = new updateStats();
                maanVaihto.changeCountry(uusMaa, id3);
                break;
            case 6:
                //Tilin muutto
                System.out.print("Syötä halutun käyttäjän ID: ");
                int id4 = Integer.parseInt(scanner.nextLine());
                System.out.print("Mikä tilitilanne? ");
                Double uusTili = Double.valueOf(scanner.nextLine());
                System.out.println("");

                updateStats tilinVaihto = new updateStats();
                tilinVaihto.changeSalary(uusTili, id4);
                break;
            case 7:
                //Käyttäjän lisääminen
                System.out.print("Syötä käyttäjän nimi: ");
                String lisaaNimi = scanner.nextLine();
                System.out.print("Syötä käyttäjän ikä: ");
                int lisaaIka = Integer.parseInt(scanner.nextLine());
                System.out.print("Syötä käyttäjän maa: ");
                String lisaaMaa = scanner.nextLine();
                System.out.print("Syötä käyttäjän tilitilanne: ");
                Double lisaaTili = Double.valueOf(scanner.nextLine());

                addNewUser uusi = new addNewUser();
                uusi.addUser(lisaaNimi, lisaaIka, lisaaMaa, lisaaTili);
                break;
            case 8:
                //Käyttäjän poisto
                System.out.print("Syötä halutun käyttäjän ID: ");
                int poistaKäyttäjä = Integer.parseInt(scanner.nextLine());
                updateStats poisto = new updateStats();
                poisto.deleteUser(poistaKäyttäjä);
                break;
        }


    }
}