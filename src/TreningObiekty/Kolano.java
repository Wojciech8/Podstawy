package TreningObiekty;

public class Kolano {

    double srednica;
    double promien;

    Rura polaczRura;

    Kolano(double srednica1, double promien1){
        srednica = srednica1;
        promien = promien1;
    }
    void wyswietl(){
        System.out.println("Kolano");
        System.out.println("średnica = " + srednica);
        System.out.println("promień = " + promien);
        System.out.println();
        polaczRura.wyswietl();
        if (polaczRura != null){
            polaczRura.wyswietl();
            System.out.println();
        }else {
            System.out.println("Brak połączenia");
        }
    }
}
