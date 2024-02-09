package TestyObiekty;

public class Rura {
    double srednica;
    double dlugosc;

    Kolano polaczKolano;

    Rura(double srednica1, double dlugosc1){
        srednica = srednica1;
        dlugosc = dlugosc1;
    }

    void wyswietl(){
        System.out.println("Rura");
        System.out.println("średnica = " + srednica);
        System.out.println("długość = " + dlugosc);
        if (polaczKolano != null){
            polaczKolano.wyswietl();
        } else {
            System.out.println("Brak połączenia");
        }
    }
}
