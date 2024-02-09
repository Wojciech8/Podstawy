package obiektowe.laczeniakolan;

public class Rura {

    double srednica;
    double dlugosc;

    Kolano dodajKoloano;

    Rura(double srednica1 , double dlugosc1){
        srednica = srednica1;
        dlugosc = dlugosc1;
    }

    void wyswietl(){
        System.out.println("Rura");
        System.out.println("średnica = " + srednica);
        System.out.println("długość = " + dlugosc);
        System.out.println();
        if (dodajKoloano != null){
            dodajKoloano.wyswietl();
        }else {
            System.out.println("Brak połączenia");
        }
    }
}
