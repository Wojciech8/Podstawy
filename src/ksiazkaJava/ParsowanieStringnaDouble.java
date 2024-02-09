package ksiazkaJava;

public class ParsowanieStringnaDouble {
    public static void main(String[] args) {
        String liczba = "10";
        double liczbadouble = Double.parseDouble(liczba);
        System.out.println(liczbadouble);

        int liczba2 = Integer.parseInt(liczba);
        System.out.println(liczba2);
    }
}
