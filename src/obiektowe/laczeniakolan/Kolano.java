package obiektowe.laczeniakolan;

public class Kolano {
    double srednica;
    double promien;

    Rura dodajRura;

    Kolano(double srednica1, double promien1){
        srednica = srednica1;
        promien = promien1;
    }

    void wyswietl(){
        System.out.println("Kolano");
        System.out.println("średnica = " + srednica);
        System.out.println("promień = " + promien);
        if (dodajRura != null){
            dodajRura.wyswietl();
        }else {
            System.out.println("Brak połączenia");
        }
    }
}
