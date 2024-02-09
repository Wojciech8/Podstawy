package obiektowe;

public class Czesc {
// cechy /nazywa sie je polami / rodzaj zmiennych
    String charge;
    double srednica;










//konstruktory / rodzaj metody ktory uruchamia sie w momencie tworzenia obiektu





//zachowania  / metody
    public void wyswietl () {
        System.out.println("Charge = " + charge);
        System.out.println("średnica  = " + srednica );

        System.out.println("promień = " + policzPromien());
    }

    public double policzPromien() {
        double promien = srednica + 10;
        return promien;
    }

}
