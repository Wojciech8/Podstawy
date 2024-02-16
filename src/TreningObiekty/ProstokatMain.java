package TreningObiekty;

public class ProstokatMain {
    public static void main(String[] args) {
        Prostokat prostokat1 = new Prostokat(5, 10, '*');
        Prostokat prostokat2 = new Prostokat(3, 7, '#');
        System.out.println("Pierwszy prostokąt:");
        prostokat1.rysujProstokat();
        System.out.println("\nDrugi prostokąt:");
        prostokat2.rysujProstokat();
    }
}
