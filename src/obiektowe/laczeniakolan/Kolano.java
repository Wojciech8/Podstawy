package obiektowe.laczeniakolan;

public class Kolano {
    double srednica = 0;
    double promien = 0;
    Rura przylaczonaRura = null;

    Kolano(double srednica1, double promien1){
        srednica = srednica1;
        promien = promien1;
    }

    void wyswietl(){
        System.out.println("Kolano");
        System.out.println("średnica = " + srednica);
        System.out.println("promień = " + promien);
        if (przylaczonaRura != null){
            przylaczonaRura.wyswietl();
        }else {
            System.out.println("Brak połączenia");
        }
    }
}
