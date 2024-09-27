package harmonogramProjekt;

import java.util.ArrayList;

public class ListyDemo {
    public static void main(String[] args) {
        ArrayList<String> daysOfWeek = new ArrayList<>();
        daysOfWeek.add("pon");
        daysOfWeek.add("wto");
        daysOfWeek.add("śro");
        daysOfWeek.add("czw");
        daysOfWeek.add("pio");
        daysOfWeek.add("sob");
        daysOfWeek.add("niedz");

        daysOfWeek.remove("wto");

        System.out.println(daysOfWeek);



    }
}
