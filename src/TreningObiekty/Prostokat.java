package TreningObiekty;

public class Prostokat {
    int wysokosc;
    int szerokosc;
    char wypelnienie;
    public Prostokat(int wysokosc, int szerokosc, char wypelnienie) {
        this.wysokosc = wysokosc;
        this.szerokosc = szerokosc;
        this.wypelnienie = wypelnienie;
    }
    public void rysujProstokat() {
        for (int i = 0; i < wysokosc; i++) {
            for (int j = 0; j < szerokosc; j++) {
        System.out.print(wypelnienie);
            }
            System.out.println();
        }
    }
}
