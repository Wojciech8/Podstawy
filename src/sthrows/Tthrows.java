package sthrows;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tthrows {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe");
        try{
            int number = scanner.nextInt();
            System.out.println("Twoja liczba to " + number);
        }catch (InputMismatchException e){
            System.out.println("Wystapil blad: " + e.getClass().getName());
            System.out.println("Nalezy napisac liczbe a nie tekst!");
        }

        System.out.println("Program dziala dalej");
    }
}
