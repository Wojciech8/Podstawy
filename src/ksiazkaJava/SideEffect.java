package ksiazkaJava;

public class SideEffect { // Efekt uboczny
    public static void main(String[] args) {
        int i;
        i = 0;
        /* inkrementuje   i, mimo że warunek instrukcji if nie jest spełniony*/
        if (false & (++i < 100))
            System.out.println("Wywołanie nie zostanie wywołane");
        System.out.println("Liczba wykonanych instrukcji if:  " + i); // wyświetla 1

        /* Nie inkrementuje  i, ponieważ operator warunkowy pomija drugie wyrażenie*/
        if (false && (++i < 100))
            System.out.println("Wywołanie nie zostanie wykonane");
        System.out.println("Liczba wykonanych instrukcji if: " + i);
    }
}
