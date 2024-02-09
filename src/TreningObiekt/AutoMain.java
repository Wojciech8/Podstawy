package TreningObiekt;

public class AutoMain {
    public static void main(String[] args) {

        Auto auto1 = new Auto();
        Auto auto2 = new Auto();
        Auto auto3 = new Auto();

        auto1.cena = 12000;
        auto1.nazwa = "Maluch";
        auto2.cena = 1000;
        auto2.nazwa = "Warszawa";
        auto3.cena = 5000;
        auto3.nazwa = "Polonez";
        Auto[]auta = {auto1,auto2,auto3};

        for (int i = 0; i < 3; i++) {
            auta[i].wyswietl();

        }
    }
}
