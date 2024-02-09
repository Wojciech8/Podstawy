package podstawy;

public class Minutysekundy {
    public static void main(String[] args) {
        double minuty = 60;
        double sekunda = 1;
        double minuta = 60;
        double godzina = 60 * 60;
        System.out.println(minuty + "minut to " + (minuta * minuty) / sekunda + "sekund");
        System.out.println(minuty + "minut to " + (minuty * minuta) / godzina + "godzin");


    }
}
