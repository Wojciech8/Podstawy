package obiektowe.gietarki;

public class GietarkiMain {
    public static void main(String[] args) {
        Gietarka gietarka1 = new Gietarka();
        Gietarka gietarka2 = new Gietarka();
        Gietarka gietarka3 = new Gietarka();

        gietarka1.srednica = 6.35;
        gietarka1.promien = 20;
        gietarka2.srednica =8;
        gietarka2.promien = 25;
        gietarka3.srednica = 10;
        gietarka3.promien = 30;

        gietarka1.wyswietl();
        gietarka2.wyswietl();
        gietarka3.wyswietl();

        Gietarka[]gietarki = {gietarka1,gietarka2,gietarka3};

        int count = 0;

        for (int i = 0; i < gietarki.length; i++) {
            gietarki[i].wyswietl();
            if (gietarki[i].policzDlugoscGieciaLuku() > 2000) {
                count++;
            }



        }
        System.out.println(count);

    }
}
