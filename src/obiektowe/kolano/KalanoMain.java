package obiektowe.kolano;

public class KalanoMain {
    public static void main(String[] args) {


        Kolano kolano1 = new Kolano(90,40,10 );
        Kolano kolano2 = new Kolano(100, 50);
        Kolano kolano3 = new Kolano(110, 60 );
        Kolano kolano4 = new Kolano(120,150);
        Kolano[] kolana = {kolano1, kolano2, kolano3,kolano4};
        for (int i = 0; i < kolana.length; i++) {
            kolana[i].wyswietlenie();
        }

       /* kolano1.promien = 90;
        kolano1.srednica = 40;
        kolano1.wysokoscKolana = 10 + kolano1.promien;

        kolano2.promien = 100;
        kolano2.srednica = 50;
        //kolano2.wysokoscKolana = kolano2.promien;

        kolano3.promien = 110;
        kolano3.srednica = 60;
        //kolano3.wysokoscKolana = kolano3.promien;*/


        for (int i = 0; i < kolana.length; i++) {
            kolana[i].wyswietlenie();
        }
    }
}
