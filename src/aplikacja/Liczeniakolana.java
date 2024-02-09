package aplikacja;

import java.util.Scanner;

public class Liczeniakolana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Podaj promień kolana");
        double promien = scanner.nextDouble();
        System.out.println("Podaj średnice kolana");
        double srednica = scanner.nextDouble();

        double lukZewnentrzny = (promien + srednica / 2) * Math.PI * promien * 2 / 360;

        System.out.println("Luk zewnętrzny wynosi " + lukZewnentrzny);

        double lukWenterzny = (promien - srednica / 2) * Math.PI * promien * 2 / 360;

        System.out.println("Luk wewntętrzny wynosi " + lukWenterzny );


    }
}
