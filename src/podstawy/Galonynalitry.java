package podstawy;

public class Galonynalitry {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            double gallons, liters;
            int counter;

            counter = 0; // licznik otrzymuje początkową wartość zero
            for (gallons = 1; gallons <= 30; gallons++) {
                liters = gallons * 3.7854; //zmiana na litry
                System.out.println(gallons + "galonów to " + liters + " litrów");
                counter++; //inkrementacja licznika z każdą interacją pętli
                //inkrementacja-operacje informatyczne powodujące odpowiednio zwiększenie
                // lub zmniejszenie wartości argumentu o jeden.

                if (counter == 10) { //Jeśli licznik wierszy jest równy 10 wyświetla pusty wiersz
                    System.out.println();
                    counter = 0; //zeruje licznik wierszy

                }

            }
        }
    }
}


