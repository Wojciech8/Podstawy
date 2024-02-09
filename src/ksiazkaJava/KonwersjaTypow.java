package ksiazkaJava;

public class KonwersjaTypow {
    public static void main(String[] args) {
        byte b;
        int i;

        b = 10; //Rzutowanie nie jest potrzebne, wynik promowany do typu int
        i = b *b; //OK rzutowanie nie potrzebne


        b = 10;             //Rzutowanie konieczne, aby przypiusać wartość  int zmiennej byte
        b = (byte) (b * b); // Rzutowanie konieczne


        System.out.println("i oraz b: " + i +  "  " + b);
    }
}
