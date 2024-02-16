package TreningObiekty;

public class OsobaMain {
    public static void main(String[] args) {

        Osoba osoba1 = new Osoba();
        Osoba osoba2 = new Osoba();
        Osoba osoba3 = new Osoba();

        osoba1.imie = "Ewa";
        osoba1.wiek = 35;
        osoba1.pelnoletnia = true;
        osoba2.imie = "Patryk";
        osoba2.wiek = 17;
        osoba2.pelnoletnia = false;
        osoba3.imie = "Mikolaj";
        osoba3.wiek = 5;
        osoba3.pelnoletnia = false;

        Osoba[]osoby = {osoba1,osoba2,osoba3};

        for (int i = 0; i < 3; i++) {
            osoby[i].wyswietl();

        }

    }
}
