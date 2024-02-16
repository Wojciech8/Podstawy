package TreningObiekty;

public class ProstokatMain2 {
    public static void main(String[] args) {

        Prostokat2 prostokat1 = new Prostokat2(4,4,"@");
        Prostokat2 prostokat2 = new Prostokat2(10,10, "%");

        System.out.println("Pierwszy prostokat");
        prostokat1.rysyjProstokat();
        System.out.println("Drugi prostokat");
        prostokat2.rysyjProstokat();
    }
}
