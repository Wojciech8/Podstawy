package obiektowe.samochod;

public class Samochod {

    String marka;

    double przebieg;

    double przebiegDoPrzegladu;

    public void dodawanieKilometrow() {

        przebieg = przebieg + 2000;

    }

    void wyswiel(){
        System.out.println("Marka = " + marka);
        System.out.println("Przebieg = " + przebieg);
    }

    void przeglad(){
        if (przebieg == 40000) {
            System.out.println("Trzeba zrobić przegląd");
        } else {
            System.out.println("Do przeglądu zostało = " + (40000 - przebieg));
        }
    }
}
