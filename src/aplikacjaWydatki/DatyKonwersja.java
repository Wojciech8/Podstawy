package aplikacjaWydatki;

import java.time.LocalDate;

public class DatyKonwersja {
    public static void main(String[] args) {
        String data = "2024-11-01";
        LocalDate dataLocalDate = LocalDate.parse(data);
        System.out.println(data);
        System.out.println(dataLocalDate.plusYears(1));
    }
}
