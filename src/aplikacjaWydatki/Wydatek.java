package aplikacjaWydatki;

import java.time.LocalDate;

public class Wydatek {
    private String kategoria;
    private double kwota;
    private LocalDate data;

    public Wydatek(String kategoria, double kwota, LocalDate data) {
        this.kategoria = kategoria;
        this.kwota = kwota;
        this.data = data;
    }

    @Override
    public String toString() {
        return "Wydatek:" +
                "kategoria='" + kategoria + '\'' +
                ", kwota=" + kwota +
                ", data=" + data +
                '}';
    }
}
