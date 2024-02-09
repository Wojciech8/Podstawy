package obiektowe.samochod;

public class SamochodDemo {
    public static void main(String[] args) {
        Samochod samochod1 = new Samochod();
        Samochod samochod2 = new Samochod();

        samochod1.marka = "Audi";
        samochod1.przebieg = 20000;
        samochod1.przebiegDoPrzegladu = 15000;

        samochod2.marka = "Bmw";
        samochod2.przebieg = 30000;
        samochod2.przebiegDoPrzegladu = 10000;
        samochod2.dodawanieKilometrow();
        samochod2.przeglad();

        samochod1.wyswiel();
        samochod2.wyswiel();

    }
}
