package ksiazkaJava;

public class RzuitowanieDouble {
    public static void main(String[] args) {
             // w ksiazce jest tutaj int i; i nie dziala

        for (int i = 0; i < 5 ; i++) {

            System.out.println(i + "/3: " + i / 3);
            System.out.println(i + " / 3 część dziesiętna:  " + (double) i / 3);
            System.out.println();
        }
    }
}
