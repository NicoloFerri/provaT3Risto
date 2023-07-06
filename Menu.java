package provaLavoroGruppo3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Menu {
    List<TemplatesMenu> listaPrimi = new LinkedList<>();
    List<TemplatesMenu> listaSecondi = new LinkedList<>();
    List<TemplatesMenu> listaBevande = new LinkedList<>();
    List<TemplatesMenu> listaDessert = new LinkedList<>();

    public void makeMenu(){
        TemplatesMenu scaloppineAlLimone = new TemplatesMenu("Scaloppine al limone", 12, "Fettine di vitello  battute e poi cotte in padella con succo di limone, burro e prezzemolo");
        TemplatesMenu arrostoDiMaiale = new TemplatesMenu("Arrosto di maiale", 14, "Arrosto di delizioso filetto di maialino nero");
        TemplatesMenu bisteccaAllaFiorentina = new TemplatesMenu("Bistecca alla fiorentina", 24, "Bistecca di carne marchigiana con taglio da fiorentina");
        TemplatesMenu abbacchioAllaRomana = new TemplatesMenu("Abbacchio alla romana", 16, "Carne di agnello da latte marinata con aglio, rosmarino, pepe nero e succo di limone cotta lentamente in padella");
        TemplatesMenu polloAllaCacciatora = new TemplatesMenu("Pollo alla cacciatora", 14, "Pollo allevato a terra con  contorno di patate al forno");

        TemplatesMenu acquaNaturale = new TemplatesMenu("Acqua naturale", 3, "1l");
        TemplatesMenu acquaFrizzante = new TemplatesMenu("Acqua frizzante", 3, "1l");
        TemplatesMenu cocaCola = new TemplatesMenu("Coca Cola", 3.5, "lattina 33cl");
        TemplatesMenu sprite = new TemplatesMenu("Sprite", 3.5, "lattina 33cl");
        TemplatesMenu fanta = new TemplatesMenu("Fanta", 3.5, "lattina 33cl");
        TemplatesMenu theLimone = new TemplatesMenu("Thé al limone", 3.5, "lattina 33cl");
        TemplatesMenu birraPiccola = new TemplatesMenu("Birra piccola", 4, "25cl, Alc %5,00");
        TemplatesMenu birraMedia = new TemplatesMenu("Birra media", 6, "40cl, Alc %5,00");
        TemplatesMenu caliceVino = new TemplatesMenu("Calice di vino", 5.50, "Alc %12,00");

        TemplatesMenu spaghettiAllaCarbonara = new TemplatesMenu("Spaghetti alla carbonara" , 10.50,"Spaghetti conditi con uova, pancetta, pecorino romano e pepe nero");
        TemplatesMenu risottoAiFunghi = new TemplatesMenu("Risotto ai funghi" , 12.50,"Risotto cremoso preparato con funghi porcini freschi e parmigiano reggiano");
        TemplatesMenu lasagneAlRagu = new TemplatesMenu("Lasagne al ragù" , 12.00,"Strati di pasta all'uovo, ragù di carne, besciamella e formaggio gratinato");
        TemplatesMenu penneAllArrabbiata = new TemplatesMenu("Penne all'arrabbiata" , 9.00,"Penne condite con salsa piccante al pomodoro, aglio, peperoncino e prezzemolo");
        TemplatesMenu gnocchiAlPesto = new TemplatesMenu("Gnocchi al pesto" , 8.50,"Gnocchi di patate freschi serviti con salsa al basilico, pinoli, parmigiano e olio d'oliva");

        TemplatesMenu sorbettoAlLimone = new TemplatesMenu("Sorbetto al limone", 5, "Coppa di sorbetto con limoni freschi di Siracusa igp");
        TemplatesMenu tiramisù = new TemplatesMenu("Tiramisù", 6, "Fetta di tiramisù con mascarpone, savoiardi,caffè e amaretto di Saronno");
        TemplatesMenu pannaCotta = new TemplatesMenu("Panna Cotta", 4.50, "Panna cotta con succo di fragole fresche frullate");
        TemplatesMenu cheescake = new TemplatesMenu("Cheescake al Pistacchio", 8.90, "Fetta di Cheescake al pistacchio di Bronte con base di biscotti");

        listaPrimi.add(spaghettiAllaCarbonara);
        listaPrimi.add(risottoAiFunghi);
        listaPrimi.add(lasagneAlRagu);
        listaPrimi.add(penneAllArrabbiata);
        listaPrimi.add(gnocchiAlPesto);


        listaSecondi.add(scaloppineAlLimone);
        listaSecondi.add(arrostoDiMaiale);
        listaSecondi.add(bisteccaAllaFiorentina);
        listaSecondi.add(abbacchioAllaRomana);
        listaSecondi.add(polloAllaCacciatora);

        listaBevande.add(acquaNaturale);
        listaBevande.add(acquaFrizzante);
        listaBevande.add(cocaCola);
        listaBevande.add(sprite);
        listaBevande.add(fanta);
        listaBevande.add(theLimone);
        listaBevande.add(birraPiccola);
        listaBevande.add(birraMedia);
        listaBevande.add(caliceVino);


        listaDessert.add(sorbettoAlLimone);
        listaDessert.add(tiramisù);
        listaDessert.add(pannaCotta);
        listaDessert.add(cheescake);
    }

    public void printMenuInfo(){
        System.out.println("\n\nPrimi piatti:");
        for (TemplatesMenu primi : listaPrimi) {
            System.out.println("- " + primi.getName().toUpperCase() + " " + primi.getPrice() + "€");
            System.out.println(primi.getDescription());
        }

        System.out.println("\n\n\n");
        System.out.println("Secondi:");

        for (TemplatesMenu secondi : listaSecondi) {
            System.out.println("- " + secondi.getName().toUpperCase() + " " + secondi.getPrice() + "€");
            System.out.println(secondi.getDescription() + ";");
        }

        System.out.println("\n\n\n");
        System.out.println("Bevande:");

        for (TemplatesMenu drink : listaBevande) {
            System.out.println("- " + drink.getName().toUpperCase() + " " + drink.getPrice() + "€");
            System.out.println("  " + drink.getDescription());
        }

        System.out.println("\n\n\n");
        System.out.println("Dessert");
        for (TemplatesMenu dessert : listaDessert){
            System.out.println("- " + dessert.getName().toUpperCase() + " " + dessert.getPrice() + "€");
            System.out.println(" " + dessert.getDescription());

        }

    }
}
