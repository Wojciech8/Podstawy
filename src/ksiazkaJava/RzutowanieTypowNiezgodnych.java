package ksiazkaJava;

public class RzutowanieTypowNiezgodnych {
    public static void main(String[] args) {

        double x, y;
        byte b;
        int i;
        char ch;

        x = 10.0;
        y = 3.0;

        i = (int) (x / y); //rzutuje double na int (Rzutowanie obetnie cześci dziesiętne wyniku )
        System.out.println("Całkowity wynik dzielenia x / y: " + i);

        i = 100;
        b = (byte) i; // Brak utraty informacji byte umożliwia reprezentację wartości 100
        System.out.println("Wartość zmiennej b: " + b);

        i = 257;
        b = (byte) i; // utrata informacji byte nie umożliwia reprezentacje wartości 257
        System.out.println("Wartość zmiennej b: " + b);

        b = 88; // kod ASCII litery x
        ch = (char) b; // Rzutowanie typu niezgodnego
        System.out.println("ch : " + ch);

    }
}