package sthrows;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionsDemo {

    static int iloscProduktu = 100;

    public static void main(String[] args) {
        try {
            kupProdukty();
        } catch (NotEnoughProductException e) {
            System.out.println("Nie udalo Ci sie kupic");
        }
        System.out.println("Produktu jest: " + iloscProduktu);
    }

    public static void kupProdukty(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ile produktu kupujesz?");
        int number = scanner.nextInt();
        zrealizujZakup(number);
        System.out.println("Kupiles :)");

    }

    public static void zrealizujZakup(int iloscUzytkownika){
        if (iloscProduktu < iloscUzytkownika) {
            throw new NotEnoughProductException();
        } else {
            iloscProduktu -= iloscUzytkownika;
        }
    }
}
