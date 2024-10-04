package aplikacjaWydatki;

import java.time.LocalDate;
import java.util.ArrayList;

public class ServiceWydatki {


    private ArrayList<Wydatek> wydatki = new ArrayList<>();


    public void zapiszWydatek(Wydatek wydatek) {
        wydatki.add(wydatek);

    }


    public ArrayList<Wydatek> getWydatki() {
        return wydatki;

    }
}
