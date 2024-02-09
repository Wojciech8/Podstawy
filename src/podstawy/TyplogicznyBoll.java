package podstawy;

public class TyplogicznyBoll {
    public static void main(String[] args) {
        boolean b;
        b = false;
        System.out.println("b jest " + b);
        b = true;
        System.out.println("b jest " + b);
        //Wartość typu boolean może sterować intrukcją if
        if (b) System.out.println("To wykonanie zostało wykonane");

        b = false;
        if (b) System.out.println("To wywołanie nie zostało wykonane");

        //Wynikiem zastosowania operatora porównania jest wartość boolean
        System.out.println("10 > 9 jest " + (10 > 9));
    }
}
