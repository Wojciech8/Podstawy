package harmonogramProjekt;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Daty {
    public static void main(String[] args) {
        // aktualna data
       LocalDate aktualnaData = LocalDate.now();
        System.out.println(aktualnaData);
        // elementy daty
        int year = aktualnaData.getYear();
       DayOfWeek day = aktualnaData.getDayOfWeek();
        System.out.println(year);
        System.out.println(day);
    }
}
