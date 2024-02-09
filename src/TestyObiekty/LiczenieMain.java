package TestyObiekty;

public class LiczenieMain {
    public static void main(String[] args) {
        Rura rura1 = new Rura(30,1000);
        Rura rura2 = new Rura(30,2000);

        Kolano kolano1 = new Kolano(30,50);
        Kolano kolano2 = new Kolano(40,60);

        rura1.polaczKolano = kolano1;
        kolano1.polaczRura = rura2;
        rura2.polaczKolano = kolano2;

        rura1.wyswietl();
    }
}
