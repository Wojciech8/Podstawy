package podstawy;

public class OriAND {
    public static void main(String[] args) {
        int temperatura = 25;
        if (temperatura < 0 || temperatura > 30) {
            System.out.println("Temperatura jest albo poniżej zera, albo powyżej 30 stopni");
        } else {
            System.out.println("Temperatura jest między zerem a 30 stopniami");
        }
        int x = 5;
        int y = 10;
        if (x > 0 && y > 0) {
            System.out.println("Obie zmienne są dodatnie");
        } else {
            System.out.println("Co najmniej jedna zmienna jest nie dodatnia");
        }
    }
}
