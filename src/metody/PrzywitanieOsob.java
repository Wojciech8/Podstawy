package metody;

public class PrzywitanieOsob {
    public static void main(String[] args) {
        przywitanie("Wojceich", 23);
        przywitanie("Daniel", 32);
        przywitanie("Ewa", 22);
        przywitanie("Kasia", 50);
    }
    static void przywitanie(String imie, int wiek) {
        System.out.println("Hello " + imie + " " + wiek);
    }
}
