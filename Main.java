package provaLavoroGruppo3;

public class Main {
    public static void main(String[] args) {
        System.out.println("RISTORANTE GLI ORSI BRUNI");
        System.out.println("Contemporary and classic italian cuisine");

        Menu menu = new Menu();
        menu.makeMenu();
        menu.printMenuInfo();
    }


}
