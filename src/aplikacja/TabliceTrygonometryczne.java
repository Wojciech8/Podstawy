package aplikacja;

import java.util.Scanner;

public class TabliceTrygonometryczne {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj długość pierwszego boku trójkąta: ");
        double a = scanner.nextDouble();
        System.out.print("Podaj długość drugiego boku trójkąta: ");
        double b = scanner.nextDouble();
        System.out.print(" długość trzeciego boku trójkąta: ");
        double c = Math.sqrt(a * a + b * b);
        // Sprawdzenie czy podane boki tworzą trójkąt prostokątny
        // Obliczenie kątów
        double katA = Math.toDegrees(Math.acos(a / Math.hypot(b, c)));
        double katB = Math.toDegrees(Math.acos(b / Math.hypot(a, c)));
        double katC = 90; // Kąt prosty            // Wyświetlenie wyników
        System.out.println("Kąt A: " + katA);
        System.out.println("Kąt B: " + katB);
        System.out.println("Kąt C: " + katC);

        System.out.println("Podane boki nie tworzą trójkąta prostokątnego.");
         }
    }
