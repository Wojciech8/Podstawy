package aplikacja;

import java.util.Scanner;

public interface LiczenieKataKolanaMetody {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Podaj promień kolana");
        double promien = scanner.nextDouble();
        System.out.println("Podaj średnice kolana");
        double srednica = scanner.nextDouble();
        System.out.println("Podaj kąt kolana");
        double kat = scanner.nextDouble();

        // liczę łuk Zewnętrzny
        double lukZewnentrzny = (promien + srednica / 2) * Math.PI * promien * 2 / 360;

        System.out.println("Luk zewnętrzny wynosi " + lukZewnentrzny);

        // Liczę łuk Wewnętrzny
        double lukWewnterzny = (promien - srednica / 2) * Math.PI * promien * 2 / 360;

        System.out.println("Luk wewntętrzny wynosi " + lukWewnterzny);




        //Teraz trzeba wszystko max skrócić




    }
    static double piliczLukolana (double lukZewnentrzny, double lukWewnterzny, double kat) {
        double katKolanaZew = lukZewnentrzny / 90 * kat;
        System.out.println("Długość łuku kolana na zewnątrz dla  " + kat + " stopni wynosi " + katKolanaZew);

        double katKolanaWew = lukWewnterzny / 90 * kat;
        System.out.println("Długość łuku kolana wewnątąrz dla  " + kat + " stopni wynosi " + katKolanaWew);
        return katKolanaWew;

    }
}


