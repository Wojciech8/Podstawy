package podstawy;

import java.util.Scanner;

public class Deszczslonce {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Czy pada deszcz ? (true/false) ");
        boolean deszcz = scanner.nextBoolean();
        System.out.println("Czy świeci słońce? (true/false)");
        boolean swieciSlonce = scanner.nextBoolean();

        if(deszcz && !swieciSlonce) {
            System.out.println("Pada deszcz");
        }else if (!deszcz && swieciSlonce) {
            System.out.println("Świeci słońce");
        } else if (!deszcz && !swieciSlonce) {
            System.out.println("Jest pochmurno");
        } else if (deszcz && swieciSlonce) {
            System.out.println("Tęcza");

        }

    }

    }

