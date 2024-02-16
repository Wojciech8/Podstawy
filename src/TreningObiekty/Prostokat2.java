package TreningObiekty;

public class Prostokat2 {
    int wysokosc;
    int szerokosc;
    String wypelnienie;

    Prostokat2(int wysokosc, int szerokosc, String wypelnienie){
        this.wysokosc = wysokosc;
        this.szerokosc = szerokosc;
        this.wypelnienie = wypelnienie;
    }

    public void rysyjProstokat() {
        for (int i = 0; i < wysokosc; i++) {
            for (int j = 0; j < szerokosc; j++) {
                System.out.print(wypelnienie);
            }
            System.out.println();
        }
    }
}
