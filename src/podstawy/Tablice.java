package podstawy;

public class Tablice {
    public static void main(String[] args) {
        //TWORZENIE TABLICY LICZB
        int[] liczby = new int[4];
        //PRZYPISYWANIE WARTOSCI TABLICY DO LICZB
        liczby[0] = 10;
        liczby[1] = 20;
        liczby[2] = 30;
        liczby[3] = 40;
        //TWORZENIE TABLICY TEKSTÓW
        String[] teksty = new String[2];
        //PRZYPISYWANIE WARTOSCI DO TABLICY TEKSTOW
        teksty[0] = "Hello";
        teksty[1] = "World";
        //WYSWIETLENIE ZAWARTOSCI TABLIC
        System.out.println("Tablica liczb :  ");
        for (int liczba : liczby) {// co robi dwu kropek
            System.out.println(liczba);
        }
        System.out.println("Tablica tekstów");
        for (String tekst : teksty) {
            System.out.println(tekst);
        }
    }
}
