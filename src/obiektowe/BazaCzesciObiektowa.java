package obiektowe;

public class BazaCzesciObiektowa {
    public static void main(String[] args) {

        Czesc czesc1 = new Czesc();
        czesc1.charge = "w";
        czesc1.srednica = 10;

        Czesc czesc2 = new Czesc();
        czesc2.charge = "o";
        czesc2.srednica = 20;
        System.out.println(czesc1.charge);
        System.out.println(czesc2.srednica);
        czesc1.wyswietl();
        czesc2.wyswietl();

    }
}
