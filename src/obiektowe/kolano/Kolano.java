package obiektowe.kolano;

public class Kolano {
    double srednica;
    double promien;
    double wysokoscKolana;

    Kolano(double startowaSrednica, double startowyPromien, double startowaWysokosc) {   // konstruktor
        srednica = startowaSrednica;
        promien = startowyPromien;
        wysokoscKolana = startowaWysokosc + promien;
    }

    Kolano(double startowaSrednica, double startowyPromien){
        srednica = startowaSrednica;
        promien = startowyPromien;
    }


    void wyswietlenie() {
        System.out.println(" Promień = " + promien);
        System.out.println("Średnica = " + srednica);
        System.out.println("Wysokość kolana = " + wysokoscKolana);

        if (wysokoscKolana == 0) {
            System.out.println("standardowe kolano");
        } else {
            System.out.println("Kolanop orbitalne");
        }
    }


}

