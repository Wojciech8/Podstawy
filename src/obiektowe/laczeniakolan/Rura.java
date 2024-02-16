package obiektowe.laczeniakolan;

public class Rura {

    double srednica;
    double dlugosc;

    Kolano przylaczoneKolano;

    Rura(double srednica1 , double dlugosc1){
        srednica = srednica1;
        dlugosc = dlugosc1;
    }

    void wyswietl(){
        System.out.println("Rura");
        System.out.println("średnica = " + srednica);
        System.out.println("długość = " + dlugosc);
        System.out.println();
        if (przylaczoneKolano != null){
            przylaczoneKolano.wyswietl();
        }else {
            System.out.println("Brak połączenia");
        }
    }
}
