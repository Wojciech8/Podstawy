package podstawy;

public class TablicaPetla {
    public static void main(String[] args) {
        int[] tablica = new int[10];
        for (int i = 0; i< tablica.length; i++) {
            tablica[i] = (int)(Math.random()*1000)+1;
        }
        System.out.println("Wszystkie liczby : ");
        for (int liczba : tablica) {
            System.out.println(liczba);
        }



    }
}
